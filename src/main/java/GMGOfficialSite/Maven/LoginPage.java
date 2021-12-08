package GMGOfficialSite.Maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	
	 WebDriver driver = PadreClassGMG.getDriver();
	
	By LoginField = By.cssSelector("#edit-name");
	
	By Password = By.cssSelector("#edit-pass");
	
	By LoginBtn = By.cssSelector("#login-text");
	
	By CreateAccount = By.xpath("//a[@href='/user/register']");

	By ForgotPassword = By.cssSelector("#user-login-form > p > a");

	By ResetPassword = By.cssSelector("#edit-actions");

	By SingnIn = By.id("edit-submit");

	By ErrorMessage = By.xpath("//div[@role='alert']");

	By UnlockNowEmail = By.id("edit-email");

	By  UnlockNowBtn = By.xpath("//input[@value='Unlock Now']");


	
	
	public WebElement getLoginField()
	{
		return driver.findElement(LoginField);
	}
	
	public WebElement getPassword()
	{
		return driver.findElement(Password);
	}
	
	public WebElement getLoginBtn()
	{
		return driver.findElement(LoginBtn);
	}
	
	public WebElement getCreateAccount()
	{
		return driver.findElement(CreateAccount);
	}

	public WebElement getForgotPassword(){
		return driver.findElement(ForgotPassword);
	}

	public WebElement getResetPassword(){
		return driver.findElement(ResetPassword);
	}

	public WebElement getSingnIn(){return driver.findElement(SingnIn);}

	public WebElement getErrorMessage(){ return driver.findElement(ErrorMessage);}

	public WebElement getUnlockNowEmail(){ return driver.findElement(UnlockNowEmail);}

	public WebElement getUnlockNowBtn(){
		return driver.findElement(UnlockNowBtn);
	}

}
