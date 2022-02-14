import com.typesafe.config.ConfigFactory;

public class Config {
    private com.typesafe.config.Config typeSafeConfig;
    private static Config config;

    private Config() {
        typeSafeConfig = ConfigFactory.parseResources("dev.conf");
    }

    public static Config instance() {
        if(config == null) {
            config = new Config();
        }
        return config;
    }

    public String getName() {
        return this.typeSafeConfig.getString("name");
    }
}
