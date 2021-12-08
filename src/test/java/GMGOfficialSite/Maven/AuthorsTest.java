package GMGOfficialSite.Maven;
import Actions.*;
import Validations.AuthorsValidations;
import org.testng.annotations.Test;

import Models.FooterMenu;

public class AuthorsTest extends PadreClassGMG{
	AccountActions accountActions = new AccountActions();
	AuthorsActions authorsActions = new AuthorsActions();
	HomeActions homeActions = new HomeActions();
	LoginActions loginActions = new LoginActions();
	MenuActions menuActions = new MenuActions();
	TopicActions topicActions = new TopicActions();
	AuthorsValidations authorsValidations = new AuthorsValidations();



	@Test
	public void followAuthors() throws InterruptedException
	{
		homeActions.clickOnLoginBtn();
		Thread.sleep(2000);
		loginActions.emailSetText();
		loginActions.passwordSetText();
		loginActions.clickOnSingInButton();
		Thread.sleep(2000);
		menuActions.clickOnFooterOption(FooterMenu.OUR_AUTHORS.getFooterOption());
		Thread.sleep(4000);
		authorsActions.clickOnFirstAuthorBtn();
		Thread.sleep(4000);
		authorsValidations.validateFollowAuthorIsDisplayed();
		authorsActions.clickOnFollowUnfolloAuthorsBtn();
		menuActions.clickOnMyAccountBtn();
		accountActions.clickOnSingOut();

	}
	
	@Test
	public void followAuthorsByArticle() throws InterruptedException
	{
		homeActions.clickOnLoginBtn();
		Thread.sleep(2000);
		loginActions.emailSetText();
		loginActions.passwordSetText();
		loginActions.clickOnSingInButton();
		Thread.sleep(2000);
		//homeActions.clickOnGiddyLogo(); ///Agregar todos los TC para que funcionen con el delete cookies
		Thread.sleep(2000);
		homeActions.clickOnCarouselBtn();
		topicActions.clickOnAothorBtn();
		Thread.sleep(2000);
		authorsValidations.validateFollowAuthorIsDisplayed();
		authorsActions.clickOnFollowUnfolloAuthorsBtn();
		menuActions.clickOnMyAccountBtn();
		accountActions.clickOnSingOut();
	}


	@Test
	public void validateFollowAuthorsByArticleIsNotShow() throws InterruptedException
	{
		homeActions.clickOnGiddyLogo();
		homeActions.clickOnCarouselBtn();
		Thread.sleep(2000);
		topicActions.clickOnAothorBtn();
		Thread.sleep(2000);
		authorsValidations.validateFollowAuthorIsDisplayed();

	}

	@Test
	public void validateFollowAuthorsBtnIsNotShown() throws InterruptedException
	{
		Thread.sleep(3000);
		menuActions.clickOnFooterOption(FooterMenu.OUR_AUTHORS.getFooterOption());
		Thread.sleep(4000);
		authorsActions.clickOnFirstAuthorBtn();
		authorsValidations.validateFollowAuthorIsDisplayed();
	}



}
