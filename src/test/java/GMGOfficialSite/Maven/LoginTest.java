package GMGOfficialSite.Maven;


import Actions.AccountActions;
import Validations.ArticleValidations;
import Validations.LoginValidations;
import org.testng.annotations.Test;


import Actions.HomeActions;
import Actions.LoginActions;

public class LoginTest extends PadreClassGMG{
	
	LoginActions loginActions = new LoginActions();
	HomeActions homeActions = new HomeActions();
	AccountActions accountActions = new AccountActions();
	LoginValidations validationsLogin = new LoginValidations();
	ArticleValidations articleValidations = new ArticleValidations();


	@Test
	public void loginSuccessful() throws InterruptedException {
		homeActions.clickOnLoginBtn();
		loginActions.emailSetText();
		loginActions.passwordSetText();
		loginActions.clickOnSingInButton();
		validationsLogin.validWelcomeBanner();
		loginActions.clickOnLoginBtn();

		accountActions.clickOnSingOut();
	}


	public void loginSuccessful2() {
		homeActions.clickOnLoginBtn();
		loginActions.emailSetText();
		loginActions.passwordSetText();
		loginActions.clickOnSingInButton();
		loginActions.clickOnLoginBtn();
		//accountActions.clickOnSingOut();
	}
	
	@Test
	public void loginFailed() 
	{
		homeActions.clickOnLoginBtn();
		loginActions.emailSetTextFaild();
		loginActions.passwordSetText();
		loginActions.clickOnSingInButton();
		validationsLogin.validateUnrecognizedUsernameOrPassword();
	}


	@Test
	public void loginEmptyFields() 
	{
		homeActions.clickOnLoginBtn();
		loginActions.clickOnSingInButton();
	}

	@Test
	public void forgotPassword(){
		homeActions.clickOnLoginBtn();
		loginActions.clickOForgotPassword();
		loginActions.emailSetText();
		loginActions.clickOnResetPasswordBtn();

	}

@Test
	public void unlockNowUserAlreadyRegister() throws InterruptedException {
		homeActions.clickOnCarouselBtn();
		loginActions.unlockEmailSetText();
		loginActions.clickOnUnlockBt();
	    articleValidations.validateEmailAlreadyRegister();
	}
	

}
