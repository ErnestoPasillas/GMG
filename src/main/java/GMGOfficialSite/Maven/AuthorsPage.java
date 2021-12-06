package GMGOfficialSite.Maven;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AuthorsPage {
	
	 WebDriver driver = PadreClassGMG.getDriver();
	 
	 By FirstsAuthor = By.cssSelector("#block-themag-st-content div.views-field.views-field-name a");

	 By FollowUnFollowAuthors = By.xpath("//*[text()='Follow Author' or text()='Unfollow Author']");

	 //By FollowAutor = By.xpath("//form[@action='/our-authors/Eric_Schad']");

	 By title = By.cssSelector("h1.page-title");


	 public WebElement getFirstsAuthor()
	 {
		 return driver.findElement(FirstsAuthor);
	 }

	public WebElement getFirstsAuthor2()
	{
		return (WebElement) PadreClassGMG.js.executeScript("document.querySelector('#block-themag-st-content .views-field-name a').click();");
	}
	
	 public WebElement getFollowUnFollowAuthors()
	 {
		 return driver.findElement(FollowUnFollowAuthors);
	 }

	 public WebElement getTittle(){
		 return driver.findElement(title);
	 }
	
}
