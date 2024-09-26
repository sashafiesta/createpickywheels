package zeh.createpickywheels;

import com.mojang.logging.LogUtils;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraftforge.fml.config.ModConfig;
import org.slf4j.Logger;
import zeh.createpickywheels.common.Configuration;
import net.fabricmc.api.ModInitializer;
//import net.minecraftforge.fml.ModLoadingContext;
import fuzs.forgeconfigapiport.api.config.v2.ForgeConfigRegistry;
public class CreatePickyWheels implements ModInitializer {

    public static final String MODID = "createpickywheels";
    public static final Logger LOGGER = LogUtils.getLogger();
    public static final BooleanProperty PICKY = BooleanProperty.create("picky");

	@Override
	public void onInitialize() {
		ForgeConfigRegistry.INSTANCE.register(MODID, ModConfig.Type.COMMON, Configuration.COMMON_CONFIG);
	}

}
