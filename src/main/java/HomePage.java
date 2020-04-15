import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage extends BaseClass {

    @FindBy(xpath = "//a[@href = '#visa']")
    private WebElement visaContainerButton;

    @FindBy(xpath = "//*[@name = 'nationality_country']/..//input")
    private WebElement fromCountryField;

    @FindBy(xpath = "//*[@class='active-result highlighted']")
    private WebElement selectFromCountry;

    @FindBy(xpath = "//label[text() = 'To Country']/..//input")
    private WebElement toCountryField;

    @FindBy(xpath = "//*[@class='active-result highlighted']")
    private WebElement selectToCountry;

    @FindBy(name = "date")
    private WebElement dateField;

    @FindBy(xpath = "//button[contains(text(),'Submit')]")
    private WebElement submitButton;

    @FindBy(xpath = "//label[text() = 'From Country']/..//a/span")
    private WebElement fromCountryDiv;

    @FindBy(xpath = "//label[text() = 'To Country']/..//a/span")
    private WebElement toCountryDiv;


    public HomePage() {
    }

    public HomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);

    }
    public HomePage clickVisaContainerButton(){
        visaContainerButton.click();
        return new HomePage(driver);
    }

    private HomePage setFromCountryField(String fromCountry) {
        this.fromCountryField.sendKeys(fromCountry);
        return this;
    }

    public HomePage selectFromCountryField(String fromCountry) {
        fromCountryDiv.click();
        setFromCountryField(fromCountry);
        this.selectFromCountry.click();
        return this;
    }

    private HomePage setToCountryField(String toCountry) {
        this.toCountryField.sendKeys(toCountry);
        return this;
    }

    public HomePage selectToCountryField(String toCountry) {
        toCountryDiv.click();
        setToCountryField(toCountry);
        this.selectToCountry.click();
        return this;
    }

    public HomePage setDate(){
        dateField.click();
        dateField.sendKeys("16/04/2020");
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