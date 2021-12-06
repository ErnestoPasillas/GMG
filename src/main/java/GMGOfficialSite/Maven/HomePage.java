package GMGOfficialSite.Maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage  {
	
  WebDriver driver = PadreClassGMG.getDriver();
	

	
	By GiddyLogo = By.id("block-themag-st-sitebranding-3");

	By Login = By.id("login-text");
	
	By SearchField =By.xpath("//input[@name='search']");
	
	By SearchBtn = By.id("edit-submit-solr-search");
	
	By TagSearch =By.xpath("//*[text()='Tag search']");

	
	By Carousel = //By.id("views_slideshow_cycle_div_homepage_feature_slider-block_1_0");
	
	By.className("justify-content-right");
	
	By FooterAuthors = By.cssSelector("#aboutFooterBody > p:nth-child(4) > a");
	
	public WebElement getGiddyLogo()
	{
		return driver.findElement(GiddyLogo);
	}
	
	public WebElement getLogin()
	{
		return driver.findElement(Login);
	}

	public WebElement getSearchField()
	{
		return driver.findElement(SearchField);
	}
	
	public WebElement getSearchBtn()
	{
		return driver.findElement(SearchBtn);
	}
	
	
	public WebElement getTagSearch()
	{
		return driver.findElement(TagSearch);
	}
	
	public WebElement getCarousel()
	{
		return driver.findElement(Carousel);
	}
	
	
	public WebElement getFooterAuthors()
	{
		return driver.findElement(FooterAuthors);
	}
}
