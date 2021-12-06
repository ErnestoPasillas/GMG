package GMGOfficialSite.Maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TopicsOfInteresPage {
	
	
	
	 WebDriver driver = PadreClassGMG.getDriver();
	 
	 By UpdateMyInterests = By.id("hideable_container_title");
	 
	 By CancelButton = By.id("cancel_button");
	 
	 By SaveButton = By.id("submission_button");
	 
	 
	 By TagOption  = By.xpath("//div[contains(@id,'topic_to_select')]");
	 
	 By FollowUnfollowAccount = By.xpath("//div[text()='Follow Topic' or @value='Unfollow Topic']");

	 By DeleteTag = By.xpath("//*[contains(@id,'selected_area')]/div");

	 
	 public WebElement getUpdateMyInterests()
	 {
		 return driver.findElement(UpdateMyInterests);
	 }

	 
	 public WebElement getCancelButton()
	 {
		 return driver.findElement(CancelButton);
	 }
	 
	 public WebElement getSaveButton()
	 {
		 return driver.findElement(SaveButton);
	 }
	 
	 public WebElement getTagOption()
	 {
		 return driver.findElement(TagOption);
	 }

 public WebElement getFollowUnfollowAccount()
	 {
		 return driver.findElement(FollowUnfollowAccount);
	 }

	 public WebElement getDeleteTag(){
		 return driver.findElement(DeleteTag);
	 }
}
