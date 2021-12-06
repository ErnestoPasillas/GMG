package GMGOfficialSite.Maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TagSearchPage {
	

	 WebDriver driver = PadreClassGMG.getDriver();
	 
	 By TagSeachField = By.id("edit-tid");
	 
	 By SearchTag	= By.id("edit-submit-tag-search");
	 
	 By Reset = By.xpath("//input[@value='Reset']");
	 
	 
	 public WebElement getTagSeachField()
	 {
		 return driver.findElement(TagSeachField);
	 }

	 
	 public WebElement getSearchTagBtn()
	 {
		 return driver.findElement(SearchTag);
	 }

	 public WebElement getReset()
	 {
		 return driver.findElement(Reset);
	 }
}
