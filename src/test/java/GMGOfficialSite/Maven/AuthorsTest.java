package GMGOfficialSite.Maven;
import Actions.*;
import org.testng.annotations.Test;

import Models.FooterMenu;

public class AuthorsTest extends PadreClassGMG{
	AccountActions accountActions = new AccountActions();
	AuthorsActions authorsActions = new AuthorsActions();
	HomeActions homeActions = new HomeActions();
	LoginActions loginActions = new LoginActions();
	MenuActions menuActions = new MenuActions();
	TopicActions topicActions = new TopicActions();



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
		Thread.sleep(4000);
		authorsActions.clickOnFirstAuthorBtn();
		Thread.sleep(4000);
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
		loginActions.clickOnLoginBtn();
		Thread.sleep(2000);
		//homeActions.clickOnGiddyLogo(); ///Agregar todos los TC para que funcionen con el delete cookies
		Thread.sleep(2000);
		homeActions.clickOnCarouselBtn();
		topicActions.clickOnAothorBtn();
		Thread.sleep(2000);
		authorsActions.clickOnFollowUnfolloAuthorsBtn();
		menuActions.clickOnMyAccountBtn();
		accountActions.clickOnSingOut();
	}
}
