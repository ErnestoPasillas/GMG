package GMGOfficialSite.Maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TopicsPage {
	
	 WebDriver driver = PadreClassGMG.getDriver();
	 
	 
	 
	 By FollowUnfollowSubTopic = By.xpath("//*[contains(@id,'buttonSave-subtopic-button')]");


	By FollowUnfollowCoreTopic = By.xpath("//*[contains(@id,'buttonSave-coretopic-button')]");
	
	 By SaveUnsave = By.xpath("//*[contains(@id,'buttonSave-article-button')]/div");

			 //By.xpath("//*[contains(text(),'Save Article' or 'Remove Article')]");
			 
			 //By.xpath("//input[@class='saved button js-form-submit form-submit' or @class='unsaved button js-form-submit form-submit']");
			// By.xpath("//input[@value='Save Article' or @value='Remove Article']");
	 //By.xpath("//input[@class='saved button js-form-submit form-submit' or @class='unsaved button js-form-submit form-submit']");
	
	// By.xpath("//*[@id=\"block-themag-st-content\"]/div/article/div/div[2]/div/div/div[2]/div/div[4]/div/div/div/div[2]");
	// By.xpath("/html/body/div[2]/div/div[6]/div[2]/div/article/div/div[4]/div/div/div[2]/div/div[4]/div/div/div/div[2]/div[1]/div/div/form/input[2]");
	           
	 By FirstTopic = By.className("core-topic-pillar-title");
	 
	 
	 By AutorArticle = By.className("author-details");
			 
			 
	 public WebElement getFollowUnfollow()
	 {
		 return driver.findElement(FollowUnfollowSubTopic);
	 }
	 
	 
 public WebElement getSaveUnsaveArticle()
	 
	 {
		 return driver.findElement(SaveUnsave);	
	 }
	 
	 public WebElement getFirstTopic()
	 
	 {
		 return driver.findElement(FirstTopic);	
	 }
	 
public WebElement getAutorArticle()
	 
	 {
		 return driver.findElement(AutorArticle);	
	 }

	 public WebElement getFollowUnfollowCoreTopic(){
		 return driver.findElement(FollowUnfollowCoreTopic);
	 }




}
