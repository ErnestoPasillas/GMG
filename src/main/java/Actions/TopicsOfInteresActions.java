package Actions;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import GMGOfficialSite.Maven.Methods;
import GMGOfficialSite.Maven.TopicsOfInteresPage;
import Utilities.WaitManager;

public class TopicsOfInteresActions {
	
	
	TopicsOfInteresPage topicsOfInteresPage = new TopicsOfInteresPage();

	SoftAssert softAssert = new SoftAssert();
	
	WebDriverWait wait = null;
	
	
	
	public void clickOnUpdateMyInterestsBtn()
	{
			 WaitManager.waitAndClick(topicsOfInteresPage.getUpdateMyInterests());
	}
	
	

	public void clickOnCancelBtn()
	{
			 WaitManager.waitAndClick(topicsOfInteresPage.getCancelButton());
	}
	public void clickOnSaveButton()
	{
			 WaitManager.waitAndClick(topicsOfInteresPage.getSaveButton());
	}

	public void clickOnTagSelected(){
		topicsOfInteresPage.getDeleteTag().click();
	}
	
	
	public void clickOngetFollowUnfollowAccount()
	{
		WaitManager.waitAndClick(topicsOfInteresPage.getFollowUnfollowAccount());
	}
	
	
	public void clickOnTagOption()
	{
			 WaitManager.waitAndClick(topicsOfInteresPage.getTagOption());
	}
	
	
	
	public void chooseTopic()
	{
		try {
			Methods.dropdown("edit-topics-and-interests", "6813");
			
		}catch(NoSuchElementException e ){
			
			e.printStackTrace();
		}
	}
	
	
	public void chooseSecondSelectTopics()
	{
		try {
			Methods.dropdown("second_select_topics", "6824");
			
		}catch(NoSuchElementException e ){
			
			e.printStackTrace();
		}
	}

}
