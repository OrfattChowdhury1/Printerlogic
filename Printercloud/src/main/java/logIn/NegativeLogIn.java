package logIn;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class NegativeLogIn extends CommonAPI {
    @FindBy(how = How.XPATH, using = "//input[@id='relogin_user']")
    public static WebElement invalidUserName;
    @FindBy(how = How.XPATH, using = "//input[@id='relogin_password']")
    public static WebElement invalidPassWord;
    @FindBy(how = How.XPATH, using = "//button[@id='admin-login-btn']//span[@class='ui-button-text'][contains(text(),'Log In')]")
    public static WebElement clickButton;

    public void invalidLogIn(){
        invalidUserName.sendKeys("OrfattChowdhury1234");
        invalidPassWord.sendKeys("OrfattChowdhury");
        clickButton.click();
    }
}
