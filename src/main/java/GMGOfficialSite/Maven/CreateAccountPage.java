package GMGOfficialSite.Maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateAccountPage {
	
	WebDriver driver = PadreClassGMG.getDriver();
	

	By FirtsName = By.id("edit-first-name");
	//input[@id='edit-name']
	By LastName = By.id("edit-last-name");
	
	By Email = By.id("edit-email");
	
	By Password = By.id("edit-pass-pass1--2");
	
	By ConfirmPass = By.id("edit-pass-pass2--2");
	
	By CheckPP= By.id("edit-tos-pp");
	
	By CheckAdult = By.id("edit-adult-content");
	
	
	By GoBack = By.xpath("//a[@href='/user/login']");
	
	By Continue = By.id("edit-submit");

	By ErrorMessage = By.xpath("//div[@role='alert']");
	
	
	public WebElement getFirtsName()
	{
		return driver.findElement(FirtsName);
	}
	
	public WebElement getLastName()
	{
		return driver.findElement(LastName);
	}
	
	
	public WebElement getEmail()
	{
		return driver.findElement(Email);
	}
	
	public WebElement getPassword()
	{
		return driver.findElement(Password);
	}
	
	public WebElement getConfirmPass()
	{
		return driver.findElement(ConfirmPass);
	}
	
	public WebElement getCheckPP() 
	{
		return driver.findElement(CheckPP);
	}
	
	public WebElement getCheckAdult()
	{
		return driver.findElement(CheckAdult); 
	}
	
	public WebElement getGoBack()
	{
		return driver.findElement(GoBack);
	}
	
	public WebElement getContinue()
	{
	
		return driver.findElement(Continue);
	}

	public WebElement getErrorMessage(){
		return driver.findElement(ErrorMessage);
	}
	

}
