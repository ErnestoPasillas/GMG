package GMGOfficialSite.Maven;

import Validations.TagSearchValidations;
import org.testng.annotations.Test;

import Actions.HomeActions;
import Actions.TagSearchActions;

public class TagSearchTest extends PadreClassGMG {

	
	HomeActions homeActions = new HomeActions();
	TagSearchActions tagSearchActions = new TagSearchActions();

	TagSearchValidations tagSearchValidations = new TagSearchValidations();
	
	@Test
	public void tagSearchG() throws InterruptedException {
		Thread.sleep(4000);
		homeActions.clickOnTagSearchBtn();
		tagSearchActions.tagSearchFieldSetText();
		tagSearchActions.clickOnSearchBtn();
		Thread.sleep(4000);
		tagSearchValidations.validateTagSearchResult();
	}
	
	@Test
	public void tagSearchReset() throws InterruptedException
	{
		homeActions.clickOnGiddyLogo(); ///Agregar todos los TC para que funcionen
		Thread.sleep(4000);
		homeActions.clickOnTagSearchBtn();
		Thread.sleep(2000);
		tagSearchActions.tagSearchFieldSetText();
		tagSearchActions.clickOnSearchBtn();
		Thread.sleep(4000);
		tagSearchActions.clickOnResetBtn();
		tagSearchValidations.validateTagSearchResult();
	}


	@Test
	public void tagSearchEmptyFields() throws InterruptedException
	{
		homeActions.clickOnGiddyLogo(); ///Agregar todos los TC para que funcionen
		Thread.sleep(4000);
		homeActions.clickOnTagSearchBtn();
		Thread.sleep(2000);
		tagSearchActions.clickOnSearchBtn();
		///Need to be validated that empty field search is working and getting a result

		Thread.sleep(4000);
		tagSearchValidations.validateTagSearchResult();
		tagSearchActions.clickOnResetBtn();

	}
	
	
}
