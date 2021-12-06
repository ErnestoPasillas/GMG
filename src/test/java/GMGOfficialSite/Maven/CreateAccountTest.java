package GMGOfficialSite.Maven;

import org.testng.annotations.Test;


import Actions.CreateAccountActions;
import Actions.HomeActions;
import Actions.LoginActions;

public class CreateAccountTest extends PadreClassGMG{
	
	
	CreateAccountActions  createAccountActions = new CreateAccountActions();
	HomeActions homeActions = new HomeActions();
	LoginActions loginActions = new LoginActions();
	

	@Test
	public void createAccountAlreadyUse()
	{
		homeActions.clickOnLoginBtn();
		loginActions.clickOnCreateAccount();
		createAccountActions.firstNameSetText();
		createAccountActions.lastNameSetText();
		createAccountActions.emailSetText();
		createAccountActions.passwordSetText();
		createAccountActions.confirmPasswordSetText();
		createAccountActions.chooseGender();
		createAccountActions.chooseAge();
		createAccountActions.chooseRace();
		createAccountActions.clickOnTCPPCheeckbox();
		createAccountActions.clickOnAdultCheeckbox();
		createAccountActions.clickOnContinue();
	}
	
	@Test
	public void createAccountMissingCheckAnOption() throws InterruptedException
	{
		homeActions.clickOnLoginBtn();
		Thread.sleep(4000);
		loginActions.clickOnCreateAccount();
		createAccountActions.firstNameSetText();
		createAccountActions.lastNameSetText();
		createAccountActions.emailSetText();
		createAccountActions.passwordSetText();
		createAccountActions.confirmPasswordSetText();
		createAccountActions.chooseGender();
		createAccountActions.chooseAge();
		createAccountActions.chooseRace();
		createAccountActions.clickOnTCPPCheeckbox();
		createAccountActions.clickOnContinue();
	}

	@Test
	public void createAccountEmptyFields() throws InterruptedException
	{
		homeActions.clickOnLoginBtn();
		Thread.sleep(4000);
		loginActions.clickOnCreateAccount();
		createAccountActions.clickOnContinue();
	}

}
