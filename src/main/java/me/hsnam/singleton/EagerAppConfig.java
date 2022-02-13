package me.hsnam.singleton;

public class EagerAppConfig {

    private static final EagerAppConfig INSTANCE = new EagerAppConfig();

    private EagerAppConfig(){

    }

    public static EagerAppConfig getInstance() {
        return INSTANCE;
    }


}
