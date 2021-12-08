package Validations;

import GMGOfficialSite.Maven.HomePage;
import GMGOfficialSite.Maven.LoginPage;
import GMGOfficialSite.Maven.PadreClassGMG;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class SearchValidations {

    static SoftAssert softAssert = new SoftAssert();

    static WebDriverWait wait = new WebDriverWait(PadreClassGMG.getDriver(), 10);
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();


    public void validateResult(){

        try
        {

            wait.until(ExpectedConditions.visibilityOf(homePage.getGiddyLogo()));
            softAssert.assertTrue(homePage.getSearchResult().isDisplayed());
            System.out.println("Verify that the Result of Search is displayed");


        }catch(NoSuchElementException | TimeoutException e)
        {
            System.out.println("Verify that the Result of Search  is not displayed");
        }

    }


}
