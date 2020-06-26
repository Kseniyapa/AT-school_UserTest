package Package;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
    @FindBy(id = "header-lk-button")
    private WebElement openForm;
    @FindBy(className = "modal-lk-wrapper modal-lk-enterlk opened")
    private WebElement buttonClient;
    @FindBy(id = "login")
    private WebElement loginUser;
    @FindBy(xpath = "//*[@id=\"form_auth\"]/input[2]")
    private WebElement passwordUser;
    @FindBy(css = "#form_auth > button")
    private WebElement enterTo;

    public void openFormEnter() {
        openForm.click();
    }

    public void pressEnter() {
        enterTo.click();
    }

    public void pressButtonRegistration() {
        buttonClient.click();
    }

    public void sendDataAuth(String email, String password) {
        loginUser.sendKeys(email);
        passwordUser.sendKeys(password);
    }

}
