package Actions;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import GMGOfficialSite.Maven.CreateAccountPage;
import GMGOfficialSite.Maven.Methods;
import Utilities.WaitManager;

public class CreateAccountActions {
	
	CreateAccountPage createAccountPage = new CreateAccountPage();
	
	Methods methods = new Methods();
	
	SoftAssert softAssert = new SoftAssert();
	
	WebDriverWait wait = null;
	
	
	
	public void firstNameSetText()
	{
		try {
			 WaitManager.waitForElementToBePressent(createAccountPage.getFirtsName());
		
			// homeCreateAccountPage.getFirtsName().clear();
			createAccountPage.getFirtsName().sendKeys("QA");
			
		}catch(NoSuchElementException e ){
			
			e.printStackTrace();
		}
	}
	
	
	public void lastNameSetText()
	{
		try {
			 WaitManager.waitForElementToBePressent(createAccountPage.getLastName());
		
			// homeCreateAccountPage.getLastName().clear();
			 createAccountPage.getLastName().sendKeys("TEST");
			
		}catch(NoSuchElementException e ){
			
			e.printStackTrace();
		}
	}
	
	public void emailSetText()
	{
		try {
			 WaitManager.waitForElementToBePressent(createAccountPage.getEmail());
		
			 createAccountPage.getEmail().clear();
			 createAccountPage.getEmail().sendKeys("netoluevano4@gmail.com");
			
		}catch(NoSuchElementException e ){
			
			e.printStackTrace();
		}
	}
	
	public void passwordSetText()
	{
		try {
			 WaitManager.waitForElementToBePressent(createAccountPage.getPassword());
		
			 createAccountPage.getPassword().clear();
			 createAccountPage.getPassword().sendKeys("1234");
			
		}catch(NoSuchElementException e ){
			
			e.printStackTrace();
		}
	}
	
	
	public void confirmPasswordSetText()
	{
		try {
			 WaitManager.waitForElementToBePressent(createAccountPage.getConfirmPass());
		
			 createAccountPage.getConfirmPass().clear();
			 createAccountPage.getConfirmPass().sendKeys("1234");
			
		}catch(NoSuchElementException e ){
			
			e.printStackTrace();
		}
	}
	
	public void chooseGender()
	{
		try {
			Methods.dropdown("edit-gender", "Male");
			
		}catch(NoSuchElementException e ){
			
			e.printStackTrace();
		}
	}
	
	public void chooseAge()
	{
		try {
			Methods.dropdown("edit-age", "36-45");
			
		}catch(NoSuchElementException e ){
			
			e.printStackTrace();
		}
	}
	
	public void chooseRace()
	{
		try {
			Methods.dropdown("edit-race", "Latino or Hispanic");
			
		}catch(NoSuchElementException e ){
			
			e.printStackTrace();
		}
	}
	
	public void clickOnTCPPCheeckbox()
	{
		 WaitManager.waitAndClick(createAccountPage.getCheckPP());
		 createAccountPage.getCheckPP().isSelected();
	}
	
	public void clickOnAdultCheeckbox()
	{
		 WaitManager.waitAndClick(createAccountPage.getCheckAdult());
		 createAccountPage.getCheckPP().isSelected();
	}

	public void clickOnContinue()
	{
		 WaitManager.waitAndClick(createAccountPage.getContinue());
	}
}
