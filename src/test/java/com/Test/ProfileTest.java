package com.Test;

import org.testng.annotations.Test;

public class ProfileTest extends SettingsTests {
    @Test
    public void getLoginPage() {
        driver.get("http://uxcrowd.ru");
    }

    @Test
    public void useYourProfile() {


    }
}
