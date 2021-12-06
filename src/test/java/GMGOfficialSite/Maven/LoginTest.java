package GMGOfficialSite.Maven;


import Actions.AccountActions;
import org.testng.annotations.Test;


import Actions.HomeActions;
import Actions.LoginActions;
import Actions.MenuActions;

public class LoginTest extends PadreClassGMG{
	
	LoginActions loginActions = new LoginActions();
	HomeActions homeActions = new HomeActions();
	AccountActions accountActions = new AccountActions();
	


	@Test
	public void loginSuccessful()
	{
		homeActions.clickOnLoginBtn();
		loginActions.emailSetText();
		loginActions.passwordSetText();
		loginActions.clickOnLoginBtn();
		accountActions.clickOnSingOut();
	}
	
	@Test
	public void loginFailed() 
	{
		homeActions.clickOnLoginBtn();
		loginActions.emailSetTextFaild();
		loginActions.passwordSetText();
		loginActions.clickOnLoginBtn();
	}


	@Test
	public void loginEmptyFields() 
	{
		homeActions.clickOnLoginBtn();
		loginActions.clickOnLoginBtn();
	}

	@Test
	public void forgotPassword(){
		homeActions.clickOnLoginBtn();
		loginActions.clickOForgotPassword();
		loginActions.emailSetText();
		loginActions.clickOnResetPasswordBtn();

	}
	

}
