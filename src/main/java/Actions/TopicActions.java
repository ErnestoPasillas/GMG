package Actions;


import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import GMGOfficialSite.Maven.TopicsPage;
import Utilities.WaitManager;

public class TopicActions {

	
	
	TopicsPage topicsPage = new TopicsPage();


	
	SoftAssert softAssert = new SoftAssert();
	
	WebDriverWait wait = null;
	
	public void clickOnFollowUnfollowBtn()
	{
			 WaitManager.waitAndClick(topicsPage.getFollowUnfollow());
	}
	
	
	public void clickOnFirstTopicBtn()
	{
			 WaitManager.waitAndClick(topicsPage.getFirstTopic());
	}
	
	public void clickOnSaveUnsaveBtn()
	{
			 WaitManager.waitAndClick(topicsPage.getSaveUnsaveArticle());
			// topicsPage.getSaveUnsaveArticle().getText();
	}

	public void getTextSaveUnsaveBtn()
	{
		topicsPage.getSaveUnsaveArticle().getText();
	}

	public void isSelectedSaveUnsaveBtn()
	{
		topicsPage.getSaveUnsaveArticle().isSelected();
	}

	
	public void clickOnAothorBtn()
	{
		WaitManager.waitAndClick(topicsPage.getAutorArticle());
		// topicsPage.getSaveUnsaveArticle().getText();
	}

	public void clickOnFollowUnfollowCoreTopic(){
		topicsPage.getFollowUnfollowCoreTopic();
	}
}
