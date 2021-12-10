package Actions;

import GMGOfficialSite.Maven.PadreClassGMG;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import GMGOfficialSite.Maven.AuthorsPage;
import GMGOfficialSite.Maven.Methods;
import Utilities.WaitManager;


public class AuthorsActions {

	AuthorsPage authorsPage = new AuthorsPage();
	
	SoftAssert softAssert = new SoftAssert();
	
	WebDriverWait wait = null;
	
	Methods methods = new Methods();



	public void clickOnFirstAuthorBtn()
	{


		PadreClassGMG.js.executeScript("document.querySelector('#block-themag-st-content .views-field-name a').click();");
	}
	
	public void clickOnFollowUnfolloAuthorsBtn()
	{
			// WaitManager.waitAndClick(authorsPage.getFollowUnFollowAuthors());
		authorsPage.getFollowUnFollowAuthors().click();
	}

	public void validarTitulo(){

		authorsPage.getTittle().isDisplayed();
	}
	
	
	
}
