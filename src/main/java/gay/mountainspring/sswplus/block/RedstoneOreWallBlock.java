package gay.mountainspring.sswplus.block;

import java.util.Map;

import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;

import gay.mountainspring.aquifer.block.ExperienceDroppingWallBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.RedstoneOreBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.block.WallBlock;
import net.minecraft.block.enums.WallShape;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.particle.DustParticleEffect;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.util.Hand;
import net.minecraft.util.ItemActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

public class RedstoneOreWallBlock extends ExperienceDroppingWallBlock {
	public static final MapCodec<WallBlock> CODEC = createCodec(RedstoneOreWallBlock::new);
	public static final BooleanProperty LIT = RedstoneOreBlock.LIT;
	
	private final Map<BlockState, VoxelShape> shapeMap;
	private final Map<BlockState, VoxelShape> collisionShapeMap;
	
	private static VoxelShape getVoxelShape(VoxelShape base, WallShape wallShape, VoxelShape tall, VoxelShape low) {
		if (wallShape == WallShape.TALL) {
			return VoxelShapes.union(base, low);
		} else {
			return wallShape == WallShape.LOW ? VoxelShapes.union(base, tall) : base;
		}
	}
	
	private Map<BlockState, VoxelShape> getShapeMap(float f, float g, float h, float i, float j, float k) {
		float l = 8.0F - f;
		float m = 8.0F + f;
		float n = 8.0F - g;
		float o = 8.0F + g;
		VoxelShape voxelShape = Block.createCuboidShape(l, 0.0, l, m, h, m);
		VoxelShape voxelShape2 = Block.createCuboidShape(n, i, 0.0, o, j, o);
		VoxelShape voxelShape3 = Block.createCuboidShape(n, i, n, o, j, 16.0);
		VoxelShape voxelShape4 = Block.createCuboidShape(0.0, i, n, o, j, o);
		VoxelShape voxelShape5 = Block.createCuboidShape(n, i, n, 16.0, j, o);
		VoxelShape voxelShape6 = Block.createCuboidShape(n, i, 0.0, o, k, o);
		VoxelShape voxelShape7 = Block.createCuboidShape(n, i, n, o, k, 16.0);
		VoxelShape voxelShape8 = Block.createCuboidShape(0.0, i, n, o, k, o);
		VoxelShape voxelShape9 = Block.createCuboidShape(n, i, n, 16.0, k, o);
		ImmutableMap.Builder<BlockState, VoxelShape> builder = ImmutableMap.builder();
		
		for (Boolean boolean_ : UP.getValues()) {
			for (WallShape wallShape : EAST_SHAPE.getValues()) {
				for (WallShape wallShape2 : NORTH_SHAPE.getValues()) {
					for (WallShape wallShape3 : WEST_SHAPE.getValues()) {
						for (WallShape wallShape4 : SOUTH_SHAPE.getValues()) {
							VoxelShape voxelShape10 = VoxelShapes.empty();
							voxelShape10 = getVoxelShape(voxelShape10, wallShape, voxelShape5, voxelShape9);
							voxelShape10 = getVoxelShape(voxelShape10, wallShape3, voxelShape4, voxelShape8);
							voxelShape10 = getVoxelShape(voxelShape10, wallShape2, voxelShape2, voxelShape6);
							voxelShape10 = getVoxelShape(voxelShape10, wallShape4, voxelShape3, voxelShape7);
							if (boolean_) {
								voxelShape10 = VoxelShapes.union(voxelShape10, voxelShape);
							}
							
							BlockState blockState = this.getDefaultState()
								.with(UP, boolean_)
								.with(EAST_SHAPE, wallShape)
								.with(WEST_SHAPE, wallShape3)
								.with(NORTH_SHAPE, wallShape2)
								.with(SOUTH_SHAPE, wallShape4);
							builder.put(blockState.with(WATERLOGGED, false).with(LIT, false), voxelShape10);
							builder.put(blockState.with(WATERLOGGED, true).with(LIT, false), voxelShape10);
							builder.put(blockState.with(WATERLOGGED, false).with(LIT, true), voxelShape10);
							builder.put(blockState.with(WATERLOGGED, true).with(LIT, true), voxelShape10);
						}
					}
				}
			}
		}
		
		return builder.build();
	}
	
	@Override
	public MapCodec<WallBlock> getCodec() {
		return CODEC;
	}
	
	public RedstoneOreWallBlock(Settings settings) {
		super(UniformIntProvider.create(1, 5), settings);
		this.setDefaultState(this.getDefaultState().with(LIT, false));
		
		this.shapeMap = this.getShapeMap(4.0F, 3.0F, 16.0F, 0.0F, 14.0F, 16.0F);
		this.collisionShapeMap = this.getShapeMap(4.0F, 3.0F, 24.0F, 0.0F, 24.0F, 24.0F);
	}
	
	@Override
	protected VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
		return (VoxelShape)this.shapeMap.get(state);
	}
	
	@Override
	protected VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
		return (VoxelShape)this.collisionShapeMap.get(state);
	}
	
	@Override
	protected void onBlockBreakStart(BlockState state, World world, BlockPos pos, PlayerEntity player) {
		light(state, world, pos);
		super.onBlockBreakStart(state, world, pos, player);
	}
	
	@Override
	public void onSteppedOn(World world, BlockPos pos, BlockState state, Entity entity) {
		if (!entity.bypassesSteppingEffects()) {
			light(state, world, pos);
		}
		
		super.onSteppedOn(world, pos, state, entity);
	}
	
	@Override
	protected ItemActionResult onUseWithItem(ItemStack stack, BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
		if (world.isClient) {
			spawnParticles(world, pos);
		} else {
			light(state, world, pos);
		}
		
		return stack.getItem() instanceof BlockItem && new ItemPlacementContext(player, hand, stack, hit).canPlace()
			? ItemActionResult.SKIP_DEFAULT_BLOCK_INTERACTION
			: ItemActionResult.SUCCESS;
	}
	
	private static void light(BlockState state, World world, BlockPos pos) {
		spawnParticles(world, pos);
		if (!(Boolean)state.get(LIT)) {
			world.setBlockState(pos, state.with(LIT, true), Block.NOTIFY_ALL);
		}
	}
	
	@Override
	protected boolean hasRandomTicks(BlockState state) {
		return (Boolean)state.get(LIT);
	}
	
	@Override
	public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
		if ((Boolean)state.get(LIT)) {
			spawnParticles(world, pos);
		}
	}
	
	private static void spawnParticles(World world, BlockPos pos) {
		Random random = world.random;
		
		for (Direction direction : Direction.values()) {
			BlockPos blockPos = pos.offset(direction);
			if (!world.getBlockState(blockPos).isOpaqueFullCube(world, blockPos)) {
				Direction.Axis axis = direction.getAxis();
				double e = axis == Direction.Axis.X ? 0.5 + 0.5625 * direction.getOffsetX() : random.nextFloat();
				double f = axis == Direction.Axis.Y ? 0.5 + 0.5625 * direction.getOffsetY() : random.nextFloat();
				double g = axis == Direction.Axis.Z ? 0.5 + 0.5625 * direction.getOffsetZ() : random.nextFloat();
				world.addParticle(DustParticleEffect.DEFAULT, pos.getX() + e, pos.getY() + f, pos.getZ() + g, 0.0, 0.0, 0.0);
			}
		}
	}
	
	@Override
	protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
		super.appendProperties(builder);
		builder.add(LIT);
	}
}