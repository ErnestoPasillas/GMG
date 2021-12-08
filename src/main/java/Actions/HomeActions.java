package Actions;


import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import GMGOfficialSite.Maven.HomePage;
import Utilities.WaitManager;

public class HomeActions{
	
	HomePage homePage = new HomePage();
	
	SoftAssert softAssert = new SoftAssert();
	
	WebDriverWait wait = null;
	

	
	
	public void searchSetText()
	{
		try {
			 WaitManager.waitForElementToBePressent(homePage.getSearchField());
		
			homePage.getSearchField().clear();
			homePage.getSearchField().sendKeys("education");
			
		}catch(NoSuchElementException e ){
			
			e.printStackTrace();
		}
	}

	public void searchSetWrongText()
	{
		try {
			WaitManager.waitForElementToBePressent(homePage.getSearchField());

			homePage.getSearchField().clear();
			homePage.getSearchField().sendKeys("wjahkahks");

		}catch(NoSuchElementException e ){

			e.printStackTrace();
		}
	}
	
	public void clickOnSearchBtn()
	{
			 WaitManager.waitAndClick(homePage.getSearchBtn());
	}
	
	
	public void clickOnTagSearchBtn()
	{
		 WaitManager.waitAndClick(homePage.getTagSearch());
	}
	
	public void clickOnLoginBtn()
	{
		 WaitManager.waitAndClick(homePage.getLogin());
	}

	public void clickOnCarouselBtn()
	{
		 WaitManager.waitAndClick(homePage.getCarousel());
	}
	
	public void clickOnAuthorslBtn()
	{
		 WaitManager.waitAndClick(homePage.getFooterAuthors());
	}


	public void clickOnGiddyLogo()
	{
		homePage.getGiddyLogo().click();
	}



}
