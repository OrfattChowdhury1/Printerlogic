package testpage;

import logIn.NegativeLogIn;
import logIn.NegativeLogIn3;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NegativeTestLogIn3 extends NegativeLogIn3 {
    NegativeLogIn3 negativeLogIn3;
    @BeforeMethod
    public void initElements() {
        negativeLogIn3 = PageFactory.initElements(driver, NegativeLogIn3.class);
        setUrl("https://http.printercloud.com/admin/index.php");
    }
    @Test
    public void testNegativeLogIn2(){
        negativeLogIn3.invalidLogIn();
    }
}
