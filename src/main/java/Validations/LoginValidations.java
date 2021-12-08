package Validations;

import GMGOfficialSite.Maven.HomePage;
import GMGOfficialSite.Maven.LoginPage;
import GMGOfficialSite.Maven.PadreClassGMG;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class LoginValidations {
    static SoftAssert softAssert = new SoftAssert();

    static WebDriverWait wait = new WebDriverWait(PadreClassGMG.getDriver(), 10);
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    public  void validWelcomeBanner(){
        try
        {
            wait.until(ExpectedConditions.visibilityOf(homePage.getGiddyLogo()));
            softAssert.assertTrue(homePage.getWelcomeBaner().isDisplayed());

        }catch(NoSuchElementException | TimeoutException e)
        {
            System.out.println("Verify that the Welcome Banner is not displayed");
        }
    }

    public void validateUnrecognizedUsernameOrPassword(){


        try
        {

            wait.until(ExpectedConditions.visibilityOf(homePage.getGiddyLogo()));
            softAssert.assertTrue(loginPage.getErrorMessage().isDisplayed());


            String ActualText = loginPage.getErrorMessage().getText();
            String ExpectedText = "Unrecognized username or password";
            softAssert.assertEquals(ExpectedText,ActualText);
            System.out.println("Verify that the Error Message is displayed");
            System.out.println(ActualText);

        }catch(NoSuchElementException | TimeoutException e)
        {
            System.out.println("Verify that the Error Message is not displayed");
        }

    }



}
