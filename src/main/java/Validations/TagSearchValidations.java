package Validations;

import GMGOfficialSite.Maven.HomePage;
import GMGOfficialSite.Maven.LoginPage;
import GMGOfficialSite.Maven.PadreClassGMG;
import GMGOfficialSite.Maven.TagSearchPage;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class TagSearchValidations {

    static SoftAssert softAssert = new SoftAssert();

    static WebDriverWait wait = new WebDriverWait(PadreClassGMG.getDriver(), 10);
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    TagSearchPage tagSearchPage = new TagSearchPage();


    public void validateTagSearchResult(){

        try
        {

            wait.until(ExpectedConditions.visibilityOf(homePage.getGiddyLogo()));
            softAssert.assertTrue(tagSearchPage.getTagSearchResult().isDisplayed());
            System.out.println("Verify that the TagSearch Result is displayed");


        }catch(NoSuchElementException | TimeoutException e)
        {
            System.out.println("Verify that the TagSearch Results  is not displayed");
        }

    }

}
