import org.testng.Assert;
import org.testng.annotations.Test;

public class VisaTest {
    @Test
    public void testVisaBooking(){

        BaseClass baseClass = new BaseClass();
        String firstName = "Andrew",
                lastName = "Worski",
                email = "worski123@gmail.com",
                phone = "12321312";

        String actualResult = baseClass
                .openHomePage()
                .goToVisaPage()
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
