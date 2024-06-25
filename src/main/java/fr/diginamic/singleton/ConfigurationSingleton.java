package fr.diginamic.singleton;

import java.util.ResourceBundle;

public class ConfigurationSingleton {

    private static ConfigurationSingleton instance;
    private ResourceBundle resourceBundle;

    private ConfigurationSingleton() {
        resourceBundle = ResourceBundle.getBundle("configuration");
    }

    public static synchronized ConfigurationSingleton getInstance() {
        if (instance == null) {
            instance = new ConfigurationSingleton();
        }
        return instance;
    }

    public String getProperty(String key) {
        return resourceBundle.getString(key);
    }
}
