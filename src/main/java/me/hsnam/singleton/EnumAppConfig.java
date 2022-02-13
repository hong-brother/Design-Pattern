package me.hsnam.singleton;

public enum EnumAppConfig {
    INSTANCE;

    public static EnumAppConfig getInstance() {
        return INSTANCE;
    }

}
