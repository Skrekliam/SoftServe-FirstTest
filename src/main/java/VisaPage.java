import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class VisaPage extends BaseClass {

    public VisaPage() {
    }


    public VisaPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);

    }
    @FindBy(name = "first_name")
    private WebElement firstName;


    @FindBy(name = "last_name")
    private WebElement lastName;


    @FindBy(name = "email")
    private WebElement email;


    @FindBy(name = "confirmemail")
    private WebElement confirmEmail;


    @FindBy(name = "phone")
    private WebElement phone;

    @FindBy(css = ".switch input")
    private WebElement checkboxAdditionalRequests;

    @FindBy(xpath = "//button[text() = 'Booking']")
    private WebElement bookingButton;

    @FindBy(xpath = "//strong[text() = 'Visa Submitted']")
    private WebElement visaSuccessText;

    public VisaPage setFirstName (String value){
        firstName.sendKeys(value);
        return this;
    }

    public VisaPage setLastName (String value){
        lastName.sendKeys(value);
        return this;
    }

    public VisaPage setEmail (String value){
        email.sendKeys(value);
        return this;
    }

    public VisaPage setConfirmEmail (String value){
        confirmEmail.sendKeys(value);
        return this;
    }
    public VisaPage setPhone (String value){
        phone.sendKeys(value);
        return this;
    }

    public VisaPage checkAdditionalRequests (){
        checkboxAdditionalRequests.click();
        return this;
    }

    public VisaPage clickBookingButton(){
        bookingButton.click();
        return this;
    }

    public String getConfirmationText(){
        return visaSuccessText.getText();
    }

}
