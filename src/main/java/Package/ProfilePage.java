package Package;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage {
    //@FindBy(className = "MuiButton-label")
    //private WebElement createTestBtn;
    @FindBy(css = "#logout")
    private WebElement logout;

    // public void setCreateTestBtn() {
    //     createTestBtn.click();
    //}

    public void logout() {
        logout.click();
    }
}
