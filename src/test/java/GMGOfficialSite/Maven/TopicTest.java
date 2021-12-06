package GMGOfficialSite.Maven;

import Actions.*;
import Models.FooterMenu;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;


import Models.HeaderMenuEnum;
import Models.SubHeaderOptions;

public class TopicTest extends PadreClassGMG{

	AccountActions accountActions = new AccountActions();
	TopicActions topicActions = new TopicActions();
	HomeActions homeActions = new HomeActions();
	LoginActions loginActions = new LoginActions();
	MenuActions menuActions = new MenuActions();
	TopicsOfInteresActions topicsOfInteresActions = new TopicsOfInteresActions();
	AccountActions acccountActions = new AccountActions();
	TagSearchActions tagSearchActions = new TagSearchActions();
	AuthorsActions authorsActions = new AuthorsActions();
	WebDriver driver = PadreClassGMG.getDriver();
	
	@Test
	public void followTopic() throws InterruptedException 
	{
		/*Fixed*/
		homeActions.clickOnLoginBtn();
		Thread.sleep(2000);
		loginActions.emailSetText();
		loginActions.passwordSetText();
		loginActions.clickOnLoginBtn();
		Thread.sleep(2000);
		homeActions.clickOnCarouselBtn();
		Thread.sleep(2000);
		topicActions.clickOnFollowUnfollowBtn();
		Thread.sleep(2000);
		menuActions.clickOnMyAccountBtn();
		//Thread.sleep(2000);
		accountActions.clickOnSingOut();

	}
	
	
	
	@Test
	public void followTopicMensHealth() throws InterruptedException 
	{

		/*N/A+*/
		homeActions.clickOnLoginBtn();
		Thread.sleep(2000);
		loginActions.emailSetText();
		loginActions.passwordSetText();
		loginActions.clickOnLoginBtn();
		Thread.sleep(2000);
		menuActions.clickOnMenuOption(HeaderMenuEnum.MENS_HEALTH.getMenuOption());
		Thread.sleep(2000);
		menuActions.clickOnSubMenuOption(SubHeaderOptions.PROSTATE_HEALTH.getSubMenuOption());
		Thread.sleep(2000);
		topicActions.clickOnFirstTopicBtn();
		Thread.sleep(4000);
		topicActions.clickOnFollowUnfollowCoreTopic();
		menuActions.clickOnMyAccountBtn();
		//Thread.sleep(2000);
		accountActions.clickOnSingOut();
	}
	
	
	@Test
	public void saveUnsaveArticleMenu() throws InterruptedException 
	{
		
		/*Save Unsave article by Menu*/
		homeActions.clickOnLoginBtn();
		Thread.sleep(2000);
		loginActions.emailSetText();
		loginActions.passwordSetText();
		loginActions.clickOnLoginBtn();
		Thread.sleep(2000);
		menuActions.clickOnMenuOption(HeaderMenuEnum.MENS_HEALTH.getMenuOption());
		Thread.sleep(2000);
		menuActions.clickOnSubMenuOption(SubHeaderOptions.ERECTILE_DYSFUNCTION.getSubMenuOption());
		Thread.sleep(2000);
		topicActions.clickOnFirstTopicBtn();
		Thread.sleep(2000);
		topicActions.clickOnSaveUnsaveBtn();
		menuActions.clickOnMyAccountBtn();
		//Thread.sleep(2000);
		accountActions.clickOnSingOut();
		
		
	}
	
	@Test
	public void saveUnsaveArticleHomePage() throws InterruptedException 
	{
		/*Fixed*/
		/*Save Unsave article by HomePage*/
		homeActions.clickOnLoginBtn();
		Thread.sleep(2000);
		loginActions.emailSetText();
		loginActions.passwordSetText();
		loginActions.clickOnLoginBtn();
		Thread.sleep(2000);
		homeActions.clickOnCarouselBtn();
		Thread.sleep(4000);
		topicActions.clickOnSaveUnsaveBtn();
		Thread.sleep(2000);
		menuActions.clickOnMyAccountBtn();
		//Thread.sleep(2000);
		accountActions.clickOnSingOut();


	}


	
	
	
	@Test
	public void followTopicAccount() throws InterruptedException 
	{
		homeActions.clickOnLoginBtn();
		Thread.sleep(2000);
		loginActions.emailSetText();
		loginActions.passwordSetText();
		loginActions.clickOnLoginBtn();
		Thread.sleep(2000);
		menuActions.clickOnMyAccountBtn();
		acccountActions.clickOnTopicsOfInterestBtn();
		Thread.sleep(2000);
		topicsOfInteresActions.clickOngetFollowUnfollowAccount();
		menuActions.clickOnMyAccountBtn();
		//Thread.sleep(2000);
		accountActions.clickOnSingOut();
	}


/*
	@Test
	public void loginSussecfull()
	{
		homeActions.clickOnLoginBtn();
		loginActions.emailSetText();
		loginActions.passwordSetText();
		loginActions.clickOnLoginBtn();
		menuActions.clickOnMyAccountBtn();
		//Thread.sleep(2000);
		accountActions.clickOnSingOut();
	}


	@Test
	public void followAuthors() throws InterruptedException
	{
		homeActions.clickOnLoginBtn();
		Thread.sleep(2000);
		loginActions.emailSetText();
		loginActions.passwordSetText();
		loginActions.clickOnLoginBtn();
		Thread.sleep(2000);
		menuActions.clickOnFooterOption(FooterMenu.OUR_AUTHORS.getFooterOption());
		//menuActions.clickOnSubMenuOption(SubHeaderOptions.ERECTILE_DYSFUNCTION.getSubMenuOption());
		Thread.sleep(4000);
		driver.switchTo().defaultContent();
		//System.out.println(driver.getPageSource());
		authorsActions.validarTitulo();
		authorsActions.clickOnFirstAuthorBtn();
		Thread.sleep(4000);
		authorsActions.clickOnFollowUnfolloAuthorsBtn();
		menuActions.clickOnMyAccountBtn();
		//Thread.sleep(2000);
		accountActions.clickOnSingOut();
	}*/



}
