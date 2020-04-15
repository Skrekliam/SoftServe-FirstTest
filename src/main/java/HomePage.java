import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage extends BaseClass {

    public HomePage() {
    }

    public HomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);

    }



    @FindBy(xpath = "//div[contains(@class, 'dropdown-login')]//a[contains (text(), 'Sign Up')]")
    private WebElement signUpElement;

    public VisaPage goToVisaPage() {
       driver.get("https://phptravels.net/visa?nationality_country=Antigua+and+Barbuda&destination_country=United+Arab+Emirates&date=15-04-2020");
        return new VisaPage(driver);
    }

}