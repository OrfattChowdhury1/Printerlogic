package logIn;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PositiveLogIn extends CommonAPI {
    @FindBy(how = How.XPATH, using = "//input[@id='relogin_user']")
    public static WebElement inputUserName;
    @FindBy(how = How.XPATH, using = "//input[@id='relogin_password']")
    public static WebElement inputPassWord;
    @FindBy(how = How.XPATH, using = "//button[@id='admin-login-btn']//span[@class='ui-button-text'][contains(text(),'Log In')]")
    public static WebElement submitButton;

    public void validLogIn(){
        inputUserName.sendKeys("OrfattChowdhury");
        inputPassWord.sendKeys("Shadowdirge12");
        submitButton.click();
    }

}
