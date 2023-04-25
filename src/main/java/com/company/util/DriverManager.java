package com.company.util;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.windows.WindowsDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.util.concurrent.TimeUnit;

public class DriverManager {

    private static WindowsDriver windowsDriver;
    private static AppiumDriver appiumDriver;
    private static WebDriver seleniumDriver;
    private static AppiumDriverLocalService appiumService;

    // WindowsDriver methods
    public static WindowsDriver getWindowsDriver() {
        if (windowsDriver == null) {
            setupWindowsDriver();
        }
        return windowsDriver;
    }

    private static void setupWindowsDriver() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("app", "Your_Application_Path");

        windowsDriver = new WindowsDriver(appiumService.getUrl(), capabilities);
        windowsDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public static void quitWindowsDriver() {
        if (windowsDriver != null) {
            windowsDriver.quit();
            windowsDriver = null;
        }
    }

    // AppiumDriver methods
    public static AppiumDriver getAppiumDriver() {
        if (appiumDriver == null) {
            setupAppiumDriver();
        }
        return appiumDriver;
    }

    private static void setupAppiumDriver() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        // Set your Appium capabilities here

        appiumDriver = new AppiumDriver(appiumService.getUrl(), capabilities);
        appiumDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public static void quitAppiumDriver() {
        if (appiumDriver != null) {
            appiumDriver.quit();
            appiumDriver = null;
        }
    }

    // Selenium WebDriver methods
    public static WebDriver getSeleniumDriver() {
        if (seleniumDriver == null) {
            setupSeleniumDriver();
        }
        return seleniumDriver;
    }

    private static void setupSeleniumDriver() {
        seleniumDriver = new ChromeDriver();
        seleniumDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public static void quitSeleniumDriver() {
        if (seleniumDriver != null) {
            seleniumDriver.quit();
            seleniumDriver = null;
        }
    }

    // Appium server methods
    public static void startAppiumServer() {
        if (appiumService == null || !appiumService.isRunning()) {
            appiumService = new AppiumServiceBuilder().usingAnyFreePort().build();
            appiumService.start();
        }
    }

    public static void stopAppiumServer() {
        if (appiumService != null && appiumService.isRunning()) {
            appiumService.stop();
        }
    }
}