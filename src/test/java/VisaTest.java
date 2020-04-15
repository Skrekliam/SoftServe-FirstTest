import org.testng.Assert;
import org.testng.annotations.Test;

public class VisaTest {
    @Test
    public void testVisaBooking(){

        BaseClass baseClass = new BaseClass();
        String firstName = "Andrew",
                lastName = "Worski",
                email = "worski123@gmail.com",
                phone = "12321312",
                fromCountry = "Ukraine",
                toCountry = "Poland";

        String actualResult = baseClass
                .openHomePage()
                .clickVisaContainerButton()
                .selectFromCountryField(fromCountry)
                .selectToCountryField(toCountry)
                .setDate()
                .clickSubmitButton()
                .setFirstName(firstName)
                .setLastName(lastName)
                .setEmail(email)
                .setConfirmEmail(email)
                .setPhone(phone)
                .checkAdditionalRequests()
                .clickBookingButton()
                .getConfirmationText();

        Assert.assertEquals(actualResult,"Visa Submitted");

    }
}
