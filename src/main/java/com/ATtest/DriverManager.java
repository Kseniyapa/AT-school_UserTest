package com.ATtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

public class DriverManager {
    private static WebDriver driver;


    private DriverManager() {

    }

    public static WebDriver webDriver() {
        if (driver != null)
            return driver;
        InputStream inputStream = DriverManager.class.getClassLoader().getResourceAsStream("conf.properties");
        Properties properties = new Properties();
        try {
            properties.load(inputStream);
        } catch (IOException e) {
            throw new RuntimeException();
        }
        String property = properties.getProperty("selenium.hub.url");
        URL hubURL = null;
        try {
            hubURL = new URL(property);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("browsername", "firefox");
        driver = new RemoteWebDriver(hubURL, desiredCapabilities);
        return driver;
    }
}
