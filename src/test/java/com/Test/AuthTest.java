package com.Test;


import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AuthTest extends SettingsTests {

    @Test
    public void getLoginPage() {
        driver.get("http://uxcrowd.ru");
    }

    @Test
    public void authLogin() {
        driver.get("http://uxcrowd.ru");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        loginPage.openFormEnter();
        loginPage.sendDataAuth("pao14nzhcq@1secmail.com", "CUlo4R");
        loginPage.pressEnter();
    }

    @Test
    public void useYourProfile() {
        driver.get("https://uxcrowd.ru/app-customer-home/list-orders");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        // profilePage.setCreateTestBtn();
        profilePage.logout();

    }
}

