package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class CommonAPI {
    public static WebDriver driver = null;
    public static Actions builder = null;
    public static WebDriverWait wait;
    public String URL = null;

    @BeforeMethod
    public void setup() throws MalformedURLException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\orfat\\IdeaProjects\\PrinterLogic\\Base\\driver\\chromedriver.exe");
        System.setProperty("webdriver.gecko.driver","C:\\Users\\orfat\\IdeaProjects\\PrinterLogic\\Base\\driver\\geckodriver.exe");
        driver = new ChromeDriver();
        driver = new FirefoxDriver();
        driver.manage().deleteAllCookies();
        builder = new Actions(driver);
        wait = new WebDriverWait(driver, 10);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().fullscreen();
    }


    @Parameters
    public void setUrl(String URL){
        this.URL = URL;
        driver.get(URL);
    }
}
