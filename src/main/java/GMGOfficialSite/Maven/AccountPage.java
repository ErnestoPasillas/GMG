package GMGOfficialSite.Maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountPage {
	
	 WebDriver driver = PadreClassGMG.getDriver();
	 
	 By AccountInfo = By.xpath("//a[@href='/user']");
	  
	 By AccountSecurity = By.xpath("//a[@href='/account-security']");
	 
	 By SavedArticles = By.xpath("//a[@href='/saved-articles']");
	 
	 By TopicsOfInterest = By.xpath("//a[@href='/topics-of-interest']");
	 
	 By AuthorsFollowed = By.xpath("//a[@href=/authors-followed']");
	 
	 By  QuestionsAnswers = By.xpath("//a[@href='/question-and-answers']");
	 
	 By SignOut = By.xpath("//a[@href='/user/logout']");
	
	 
	 
	 public WebElement getAccountInfo()
	 {
		 return driver.findElement(AccountInfo);
	 }

	 public WebElement getAccountSecurity()
	 {
		 return driver.findElement(AccountSecurity);
	 }
	 
	 public WebElement getSavedArticles()
	 {
		 return driver.findElement(SavedArticles);
	 }
	 
	 public WebElement getTopicsOfInterest()
	 {
		 return driver.findElement(TopicsOfInterest);
	 }
	 
	 public WebElement getAuthorsFollowed()
	 {
		 return driver.findElement(AuthorsFollowed);
	 }
	 
	 public WebElement getQuestionsAnswers()
	 {
		 return driver.findElement(QuestionsAnswers);
	 }

	 public WebElement getSignOut(){
		 return driver.findElement(SignOut);
	 }
}
