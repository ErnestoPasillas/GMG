package Actions;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import GMGOfficialSite.Maven.AccountPage;
import Utilities.WaitManager;


public class AccountActions {
	
	
	AccountPage accountPage = new AccountPage();

	SoftAssert softAssert = new SoftAssert();
	
	WebDriverWait wait = null;
	
	
	
	public void clickOnAccountInfoBtn()
	{
			 WaitManager.waitAndClick(accountPage.getAccountInfo());
	}
	
	public void clickOnTopicsOfInterestBtn()
	{
			 WaitManager.waitAndClick(accountPage.getTopicsOfInterest());
	}
	
	
	public void clickOnAccountSecurityBtn()
	{
			 WaitManager.waitAndClick(accountPage.getAccountSecurity());
	}

	public void clickOnAuthorsFollowedBtn()
	{
			 WaitManager.waitAndClick(accountPage.getAuthorsFollowed());
	}
	

	public void clickOnSavedArticlesBtn()
	{
			 WaitManager.waitAndClick(accountPage.getSavedArticles());
	}
	
	public void clickOnQuestionsAnswersBtn()
	{
			 WaitManager.waitAndClick(accountPage.getQuestionsAnswers());
	}

	public void clickOnSingOut(){
		WaitManager.waitAndClick(accountPage.getSignOut());
	}

}
