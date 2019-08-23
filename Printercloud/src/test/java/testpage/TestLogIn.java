package testpage;

import logIn.PositiveLogIn;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestLogIn extends PositiveLogIn {
    PositiveLogIn positiveLogIn;
    @BeforeMethod
    public void initElements() {
        positiveLogIn = PageFactory.initElements(driver, PositiveLogIn.class);
        setUrl("https://http.printercloud.com/admin/index.php");
    }
    @Test
    public void testFilmPage(){
        positiveLogIn.validLogIn();
    }


}
