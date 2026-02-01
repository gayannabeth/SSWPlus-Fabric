package gay.mountainspring.sswplus.block;

import org.jetbrains.annotations.Nullable;

import gay.mountainspring.aquifer.util.BlockUtil;
import gay.mountainspring.sswplus.config.SSWPConfig;
import gay.mountainspring.sswplus.screen.NetheriteAnvilScreenHandler;
import net.minecraft.block.AnvilBlock;
import net.minecraft.block.BlockState;
import net.minecraft.entity.FallingBlockEntity;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.ScreenHandlerContext;
import net.minecraft.screen.SimpleNamedScreenHandlerFactory;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class NetheriteAnvilBlock extends AnvilBlock {
	private static final Text TITLE = Text.translatable("container.repair");
	
	public NetheriteAnvilBlock(Settings settings) {
		super(settings);
		BlockUtil.addUnbreakableAnvil(this);
	}
	
	@Nullable
	@Override
	protected NamedScreenHandlerFactory createScreenHandlerFactory(BlockState state, World world, BlockPos pos) {
		return new SimpleNamedScreenHandlerFactory(
			(syncId, inventory, player) -> new NetheriteAnvilScreenHandler(syncId, inventory, ScreenHandlerContext.create(world, pos)), TITLE
		);
	}
	
	@Override
	protected void configureFallingBlockEntity(FallingBlockEntity entity) {
		entity.setHurtEntities(2.0f + SSWPConfig.getInstance().getNetheriteAnvilAdditionalDamage(), 60);
	}
}