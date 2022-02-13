package me.hsnam.singleton;

public class DefaultAppConfig {

    private static DefaultAppConfig instance;

    private DefaultAppConfig() {}

    public static DefaultAppConfig getInstance() {
        if (instance == null) {
            instance = new DefaultAppConfig();
        }
        return instance;
    }
}
