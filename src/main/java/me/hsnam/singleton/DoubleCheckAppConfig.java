package me.hsnam.singleton;

public class DoubleCheckAppConfig {

    private static DoubleCheckAppConfig instance;

    private DoubleCheckAppConfig() {

    }

    public static DoubleCheckAppConfig getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckAppConfig.class) {
                instance = new DoubleCheckAppConfig();
            }
        }
        return instance;
    }
}
