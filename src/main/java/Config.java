import com.typesafe.config.ConfigFactory;

public class Config {
    private com.typesafe.config.Config typeSafeConfig;
    private static Config config;

    private Config() {
        String environment = System.getenv().getOrDefault("CONFIG_ENV", "dev");
        typeSafeConfig = ConfigFactory.parseResources(environment + ".conf");
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
