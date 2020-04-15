import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseClass {

    WebDriver driver;

    public BaseClass(){

    }

    public BaseClass(WebDriver driver) {
        this.driver = driver;
    }


    public void beforeTest() {

        System.setProperty("webdriver.chrome.driver", "D:\\net.phptravels\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);

    }

    public HomePage openHomePage() {
        beforeTest();
        driver.get("https://phptravels.net/home");
        return new HomePage(driver);
    }

}