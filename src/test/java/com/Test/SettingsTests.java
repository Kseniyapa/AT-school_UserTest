package com.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import Package.LoginPage;
import Package.ProfilePage;

public class SettingsTests {
    public WebDriver driver;
    public WebDriverWait webDriverWait;
    public LoginPage loginPage;
    public ProfilePage profilePage;

    @BeforeClass
    public void signUp() {
        System.setProperty("webdriver.gecko.driver", "/Users/kseniyapanshina/bin/geckodriver");
        driver = new FirefoxDriver();
        webDriverWait = new WebDriverWait(driver, 20);
        loginPage = PageFactory.initElements(driver, LoginPage.class);
        profilePage = PageFactory.initElements(driver, ProfilePage.class);
    }

    @AfterClass
    public void closeSession() {
        driver.quit();
    }

}
