package testpage;

import logIn.NegativeLogIn;
import logIn.NegativeLogIn2;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NegativeTestLogIn2 extends NegativeLogIn2 {
    NegativeLogIn2 negativeLogIn2;
    @BeforeMethod
    public void initElements() {
        negativeLogIn2 = PageFactory.initElements(driver, NegativeLogIn2.class);
        setUrl("https://http.printercloud.com/admin/index.php");
    }
    @Test
    public void testNegativeLogIn2(){
        negativeLogIn2.invalidLogIn();
    }
}
