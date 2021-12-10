package Validations;

import GMGOfficialSite.Maven.AuthorsPage;
import GMGOfficialSite.Maven.HomePage;
import GMGOfficialSite.Maven.PadreClassGMG;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class BareByGiddyValidations {

    static SoftAssert softAssert = new SoftAssert();

    static WebDriverWait wait = new WebDriverWait(PadreClassGMG.getDriver(), 10);
    HomePage homePage = new HomePage();
    AuthorsPage authorsPage = new AuthorsPage();

    public void validateFollowAuthorIsDisplayed(){

        try
        {
            wait.until(ExpectedConditions.visibilityOf(homePage.getGiddyLogo()));
            softAssert.assertTrue(authorsPage.getFollowUnFollowAuthors().isDisplayed());
            System.out.println("Verify that the Follow Author or Unfollow Author button is displayed");

        }catch(NoSuchElementException | TimeoutException e)
        {
            System.out.println("Verify that the Follow Author or Unfollow Author button is not displayed");
        }

    }
}
