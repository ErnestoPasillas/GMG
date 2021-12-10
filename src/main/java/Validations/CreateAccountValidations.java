package Validations;

import GMGOfficialSite.Maven.CreateAccountPage;
import GMGOfficialSite.Maven.HomePage;
import GMGOfficialSite.Maven.LoginPage;
import GMGOfficialSite.Maven.PadreClassGMG;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class CreateAccountValidations {


    static SoftAssert softAssert = new SoftAssert();

    static WebDriverWait wait = new WebDriverWait(PadreClassGMG.getDriver(), 10);
    HomePage homePage = new HomePage();
    CreateAccountPage createAccountPage = new CreateAccountPage();


    public void validateEmailAlreadyRegister(){

        try
        {

            wait.until(ExpectedConditions.visibilityOf(homePage.getGiddyLogo()));
            softAssert.assertTrue(createAccountPage.getErrorMessage().isDisplayed());


            String ActualText = createAccountPage.getErrorMessage().getText();
            String ExpectedText = "That email is already in use.";
            softAssert.assertEquals(ExpectedText,ActualText);
            System.out.println("Verify that the Error Message is displayed");
            System.out.println(ActualText);

        }catch(NoSuchElementException | TimeoutException e)
        {
            System.out.println("Verify that the Error Message is not displayed");
        }

    }
}
