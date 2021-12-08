package GMGOfficialSite.Maven;

import Actions.*;
import org.testng.annotations.Test;

public class TopicsOfInterestTest extends PadreClassGMG{
	
	
	
AccountActions accountActions = new AccountActions();
	
TopicsOfInteresActions topicsOfInteresActions = new TopicsOfInteresActions();
	
	LoginActions loginActions = new LoginActions();
	
	HomeActions homeActions = new HomeActions();

	MenuActions menuActions = new MenuActions();

	AccountActions acccountActions = new AccountActions();


	@Test
	public void addTopicsOfInterestSaveButton() throws InterruptedException
	{

		homeActions.clickOnLoginBtn();
		Thread.sleep(2000);
		loginActions.emailSetText();
		loginActions.passwordSetText();
		loginActions.clickOnSingInButton();
		Thread.sleep(2000);
		menuActions.clickOnMyAccountBtn();
		Thread.sleep(2000);
		acccountActions.clickOnTopicsOfInterestBtn();
		topicsOfInteresActions.clickOnUpdateMyInterestsBtn();
		topicsOfInteresActions.chooseTopic();
		Thread.sleep(2000);
		topicsOfInteresActions.chooseSecondSelectTopics();
		Thread.sleep(2000);
		topicsOfInteresActions.clickOnTagOption();
		Thread.sleep(2000);
		topicsOfInteresActions.clickOnSaveButton();
		menuActions.clickOnMyAccountBtn();
		//Thread.sleep(2000);
		accountActions.clickOnSingOut();


	}



	@Test
	public void addTopicsOfInterestCancelButton() throws InterruptedException
	{
		homeActions.clickOnLoginBtn();
		Thread.sleep(2000);
		loginActions.emailSetText();
		loginActions.passwordSetText();
		loginActions.clickOnSingInButton();
		menuActions.clickOnMyAccountBtn();
		acccountActions.clickOnTopicsOfInterestBtn();
		topicsOfInteresActions.clickOnUpdateMyInterestsBtn();
		topicsOfInteresActions.chooseTopic();
		Thread.sleep(2000);
		topicsOfInteresActions.chooseSecondSelectTopics();
		topicsOfInteresActions.clickOnCancelBtn();
		menuActions.clickOnMyAccountBtn();
		//Thread.sleep(2000);
		accountActions.clickOnSingOut();
	}


	@Test
	public void deleteTagsTopicsOfInterestCancelBtn() throws InterruptedException
	{
		homeActions.clickOnLoginBtn();
		Thread.sleep(2000);
		loginActions.emailSetText();
		loginActions.passwordSetText();
		loginActions.clickOnSingInButton();
		menuActions.clickOnMyAccountBtn();
		acccountActions.clickOnTopicsOfInterestBtn();
		topicsOfInteresActions.clickOnUpdateMyInterestsBtn();
		Thread.sleep(4000);
		topicsOfInteresActions.clickOnTagSelected();
		topicsOfInteresActions.clickOnCancelBtn();
		menuActions.clickOnMyAccountBtn();
		//Thread.sleep(2000);
		accountActions.clickOnSingOut();
	}

	@Test
	public void deleteTagsTopicsOfInterestSaveBtn() throws InterruptedException
	{
		homeActions.clickOnLoginBtn();
		Thread.sleep(2000);
		loginActions.emailSetText();
		loginActions.passwordSetText();
		loginActions.clickOnSingInButton();
		menuActions.clickOnMyAccountBtn();
		acccountActions.clickOnTopicsOfInterestBtn();
		topicsOfInteresActions.clickOnUpdateMyInterestsBtn();
		Thread.sleep(4000);
		topicsOfInteresActions.clickOnTagSelected();
		topicsOfInteresActions.clickOnSaveButton();
		menuActions.clickOnMyAccountBtn();
		//Thread.sleep(2000);
		accountActions.clickOnSingOut();
	}

}
