package GMGOfficialSite.Maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProfilePage {

	
	WebDriver driver;

	By SingOut = //By.xpath("//a[text()='Sign out']");
	By.cssSelector("#block-themag-st-content nav > ul > li:nth-child(7) ");
	
	public WebElement getSingOut()
	{
		return driver.findElement(SingOut);
	}
}
