package Utilities;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import GMGOfficialSite.Maven.PadreClassGMG;

public class WaitManager {
	
	static WebDriverWait wait = new WebDriverWait(PadreClassGMG.getDriver(), 10);
	
	static SoftAssert softAssert = new SoftAssert();
	
	public static  void waitForElementToBePressent( WebElement element )
	{
		
		
		try {
			
			wait = new  WebDriverWait(PadreClassGMG.getDriver(), 10);
			wait.until(ExpectedConditions.visibilityOf(element));
			
		}catch(NoSuchElementException | TimeoutException e) {
			e.printStackTrace();
		}
	
	}
	
	
	public static void waitAndClick( WebElement element )
	{
		
		try 
		{
			wait = new  WebDriverWait(PadreClassGMG.getDriver(), 10);
			
			wait.until(ExpectedConditions.visibilityOf(element));
			
			softAssert.assertTrue(element.isDisplayed());
			element.click();
		}catch(NoSuchElementException | TimeoutException e) 
		{
			e.printStackTrace();
		}
		
	}

}
