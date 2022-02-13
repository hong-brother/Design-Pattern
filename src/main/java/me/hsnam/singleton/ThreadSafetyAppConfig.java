package me.hsnam.singleton;

public class ThreadSafetyAppConfig {
    private static ThreadSafetyAppConfig INSTANCE = null;

    private ThreadSafetyAppConfig() {}

    public static synchronized ThreadSafetyAppConfig getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ThreadSafetyAppConfig();
        }
        return INSTANCE;
    }
}
