package testpage;

import logIn.NegativeLogIn;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NegativeTestLogIn extends NegativeLogIn {
    NegativeLogIn negativeLogIn;
    @BeforeMethod
    public void initElements() {
        negativeLogIn = PageFactory.initElements(driver, NegativeLogIn.class);
        setUrl("https://http.printercloud.com/admin/index.php");
    }
    @Test
    public void testNegativeLogIn(){
        negativeLogIn.invalidLogIn();
    }


}
