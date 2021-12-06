package GMGOfficialSite.Maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MenuPage {
	
	 WebDriver driver = PadreClassGMG.getDriver();
	 
	
 By GiddyLogo =	By.xpath("//a[@class='site-logo']");
 
 By  PhysicalWellness = By.xpath("//li[@class='we-mega-menu-li physical-wellness-tab justify dropdown-menu']");
 
 By Exercise =   By.linkText("Understanding Your Physical Health");
		 //By.xpath("//*[@id=\"block-lifestylewellness\"]/div/div/p[2]/a");

    By MyAccount = By.cssSelector("#login-text");
 

 public WebElement getMenuOption(String menu)
 {
	 By  menuOption = By.xpath("//a[@class='we-megamenu-nolink' and contains(text(),\""+ menu +"\")]");
	
	 return driver.findElement(menuOption);
 }
 
 
 public WebElement getSubMenuOption(String subMenu)
 {
	 By  subMenuOption = By.xpath("//a[@class='we-megamenu-nolink']/following-sibling::div//*[contains(text(),\""+ subMenu +"\")]");
	//a[@class='we-megamenu-nolink']/following-sibling::div//*[contains(text(),'Understanding Your Breasts')]
	 return driver.findElement(subMenuOption);
 }
 
 
 public WebElement getFooterOption(String footerOption)
 {
	 By  footerOptionM = By.xpath("//div[@class='footer-bottom-wrapper']/div//*[contains(text(),\""+ footerOption +"\")]");
	 return driver.findElement(footerOptionM);
 }
 
 public WebElement getGiddyLogo()
 {
	 return driver.findElement(GiddyLogo);
 }
 
 public WebElement getExercise()
 {
	 return driver.findElement(Exercise);
 }

 public WebElement getMyAccount(){ return driver.findElement(MyAccount);}
 
 
 

}
