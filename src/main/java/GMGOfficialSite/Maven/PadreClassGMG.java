package GMGOfficialSite.Maven;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class PadreClassGMG {
	
	private static WebDriver driver = null;

	public static WebDriverWait wait;

	public static JavascriptExecutor js;

	public static SoftAssert a;


	public PadreClassGMG() 
	{
		if(driver == null){

			System.setProperty("webdriver.chrome.driver", "//Users//user//Downloads//chromedriver 5" );
			driver = new ChromeDriver();

		}



	}
	
	@BeforeTest
	public  void setup() throws IOException {

		js = (JavascriptExecutor) driver;
		a = new SoftAssert();
		wait = new WebDriverWait(driver, 20);

		/* Test */
		//driver.get("https://dev-giddy.pantheonsite.io/");

		/*Droupal*/

		driver.get("https://giddyd9-giddy.pantheonsite.io/");

		/*Live Site*/
		//driver.get("https://getmegiddy.com/");

		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.manage().window().maximize();

	}

	public static WebDriver getDriver() {
		return driver;
	}

	/*@AfterClass
	public void backHome(){
		driver.get("https://dev-giddy.pantheonsite.io/");
	}*/

	@AfterMethod
	public void closeWindows() {
		driver.manage().deleteAllCookies();
	}


	public void closeWindows1() {
		driver.close();
	}

}
