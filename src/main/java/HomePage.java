import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage extends BaseClass {

    @FindBy(xpath = "//a[@href = '#visa']")
    private WebElement visaContainerButton;
    @FindBy(xpath = "//*[@name = 'nationality_country']/..//input")
    private WebElement fromCountryField;
    @FindBy(xpath = "//label[text() = 'From Country']/..//a")
    private WebElement selectFromCountry;
    @FindBy(xpath = "//label[text() = 'To Country']/..//input")
    private WebElement toCountryField;
    @FindBy(xpath = "//label[text() = 'To Country']/..//a")
    private WebElement selectToCountry;
    @FindBy(name = "date")
    private WebElement dateField;
    @FindBy(xpath = "//button[contains(text(),'Submit')]")
    private WebElement submitButton;

    public HomePage() {
    }

    public HomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);

    }

    private HomePage setFromCountryField(String fromCountry) {
        this.fromCountryField.sendKeys(fromCountry);
        return this;
    }

    public HomePage selectFromCountryField(String fromCountry) {
        setFromCountryField(fromCountry);
        this.selectFromCountry.click();
        return this;
    }

    private HomePage setToCountryField(String toCountry) {
        this.toCountryField.sendKeys(toCountry);
        return this;
    }

    public HomePage selectToCountryField(String toCountry) {
        setFromCountryField(toCountry);
        this.selectToCountry.click();
        return this;
    }

    public VisaPage clickSubmitButton() {
        submitButton.click();
        return new VisaPage(driver);
    }

    public VisaPage goToVisaPage() {
        return new VisaPage(driver);
    }

}