package singleton;

public class LazyAppConfig {

    private LazyAppConfig() {

    }

    private static class HolderLazyAppConfig {
        private static LazyAppConfig INSTANCE = new LazyAppConfig();
    }

    public static LazyAppConfig getInstance() {
        return HolderLazyAppConfig.INSTANCE;
    }
}
