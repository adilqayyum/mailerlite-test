package com.web.mailerlite.utils;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

public class readProperties {

    static Properties prop = new Properties();

    public static String getProperty(String propertyName){

        try {
            // load a properties file for reading
            prop.load(Files.newInputStream(Paths.get("src/test/resources/config.properties")));
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        return prop.getProperty(propertyName);
    }
    public static long longWait = Long.parseLong(getProperty("long.wait"));
    public static long shortWait = Long.parseLong(getProperty("short.wait"));
    public static int retry = Integer.parseInt(getProperty("retry.count"));
}
