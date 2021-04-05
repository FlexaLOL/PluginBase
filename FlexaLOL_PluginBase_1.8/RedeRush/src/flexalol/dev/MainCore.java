package flexalol.dev;

import org.bukkit.plugin.java.JavaPlugin;

public class MainCore extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("O plugin base foi ligado com sucesso, feito por FlexaLOL");
    }

    @Override
    public void onDisable() {
        getLogger().info("Tchau, o plugin base foi desligado");
    }
}
