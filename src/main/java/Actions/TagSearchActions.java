package Actions;

import org.openqa.selenium.NoSuchElementException;

import GMGOfficialSite.Maven.TagSearchPage;
import Utilities.WaitManager;




public class TagSearchActions {
	
	TagSearchPage tagSearchActions = new TagSearchPage();
	
	public void tagSearchFieldSetText()
	{
		try {
			 WaitManager.waitForElementToBePressent(tagSearchActions.getTagSeachField());
		
			 tagSearchActions.getTagSeachField().clear();
			 tagSearchActions.getTagSeachField().sendKeys("sex");
			
		}catch(NoSuchElementException e ){
			
			e.printStackTrace();
		}
	}
	
	
	public void clickOnSearchBtn()
	{
		 WaitManager.waitAndClick(tagSearchActions.getSearchTagBtn());
		 
	}
	
	
	
	public void clickOnResetBtn()
	{
		 WaitManager.waitAndClick(tagSearchActions.getReset());
		 
	}

}
