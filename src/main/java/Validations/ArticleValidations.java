package Validations;

import GMGOfficialSite.Maven.HomePage;
import GMGOfficialSite.Maven.LoginPage;
import GMGOfficialSite.Maven.PadreClassGMG;
import GMGOfficialSite.Maven.TopicsOfInteresPage;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class ArticleValidations {

    static SoftAssert softAssert = new SoftAssert();

    static WebDriverWait wait = new WebDriverWait(PadreClassGMG.getDriver(), 10);
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    TopicsOfInteresPage topicsOfInteresPage = new TopicsOfInteresPage();

    public void validateFollowTopicButtonIsNotDisplayed(){


        try
        {
            wait.until(ExpectedConditions.visibilityOf(homePage.getGiddyLogo()));
            softAssert.assertTrue(topicsOfInteresPage.getFollowUnfollowAccount().isDisplayed());
            System.out.println("Verify that the Follow Topic or Unfollow Topic button is displayed");

        }catch(NoSuchElementException | TimeoutException e)
        {
            System.out.println("Verify that the Follow Topic or Unfollow Topic button is not displayed");
        }

    }

    public void validateSaveArticleButtonIsNotDisplayed(){


        try
        {
            wait.until(ExpectedConditions.visibilityOf(homePage.getGiddyLogo()));
            softAssert.assertTrue(topicsOfInteresPage.getSaveButton().isDisplayed());
            System.out.println("Verify that the Save Article or Remove Article button is displayed");

        }catch(NoSuchElementException | TimeoutException e)
        {
            System.out.println("Verify that the Save Article or Remove Article  button is not displayed");
        }

    }


    public void validateEmailAlreadyRegister(){

        try
        {

            wait.until(ExpectedConditions.visibilityOf(homePage.getGiddyLogo()));
            softAssert.assertTrue(loginPage.getErrorMessage().isDisplayed());


            String ActualText = loginPage.getErrorMessage().getText();
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
