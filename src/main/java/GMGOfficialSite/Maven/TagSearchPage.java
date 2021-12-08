package GMGOfficialSite.Maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TagSearchPage {
	

	 WebDriver driver = PadreClassGMG.getDriver();
	 
	 By TagSeachField = By.id("edit-tid");
	 
	 By SearchTag	= By.id("edit-submit-tag-search");
	 
	 By Reset = By.xpath("//input[@value='Reset']");

	 By TagSearchResult = By.xpath("//*[@id='block-themag-st-content']/div/div/div/div[3]/div/div[1]/div[1]/div/div/div[2]/p[2]");
	 
	 
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

	 public WebElement getTagSearchResult(){
		 return driver.findElement(TagSearchResult);
	 }
}
