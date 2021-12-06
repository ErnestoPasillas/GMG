package Actions;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;


import GMGOfficialSite.Maven.LoginPage;
import Utilities.WaitManager;

public class LoginActions {
	
	LoginPage loginPage = new LoginPage();
	
	SoftAssert softAssert = new SoftAssert();
	
	WebDriverWait wait = null;
	
	
	public void emailSetText()
	{
		try {
			 WaitManager.waitForElementToBePressent(loginPage.getLoginField());
		
			 loginPage.getLoginField().clear();
			 loginPage.getLoginField().sendKeys("qagiddy1@gmail.com");
			
		}catch(NoSuchElementException e ){
			
			e.printStackTrace();
		}
	}
	
	
	
	public void emailSetTextFaild()
	{
		try {
			 WaitManager.waitForElementToBePressent(loginPage.getLoginField());
		
			 loginPage.getLoginField().clear();
			 loginPage.getLoginField().sendKeys("qagiddy1@g");
			
		}catch(NoSuchElementException e ){
			
			e.printStackTrace();
		}
	}
	
	public void passwordSetText()
	{
		try {
			 WaitManager.waitForElementToBePressent(loginPage.getPassword());
		
			 loginPage.getPassword().clear();
			 loginPage.getPassword().sendKeys("123");
			
		}catch(NoSuchElementException e ){
			
			e.printStackTrace();
		}
	}
	
	
	public void clickOnLoginBtn()
	{
			 WaitManager.waitAndClick(loginPage.getLoginBtn());
	}
	
	public void clickOnCreateAccount()
	{
			 WaitManager.waitAndClick(loginPage.getCreateAccount());
	}

	public void clickOForgotPassword(){
		WaitManager.waitAndClick(loginPage.getForgotPassword());
	}

	public void clickOnResetPasswordBtn(){
		WaitManager.waitAndClick(loginPage.getResetPassword());
	}
	
	
	

}
