package GMGOfficialSite.Maven;

import Validations.SearchValidations;
import org.testng.Assert;
import org.testng.annotations.Test;


import Actions.HomeActions;
import Actions.LoginActions;
import Actions.MenuActions;

public class HomeTest extends PadreClassGMG{
	
	HomeActions homeActions = new HomeActions();
	SearchValidations searchValidations = new SearchValidations();

	@Test
	public void madeSearch()
	{
		homeActions.searchSetText();
		homeActions.clickOnSearchBtn();
		searchValidations.validateResult();
	}

	@Test
	public void madeSearchWrongText() throws InterruptedException {
		homeActions.clickOnGiddyLogo(); ///Agregar todos los TC para que funcionen
		Thread.sleep(4000);
		homeActions.searchSetWrongText();
		homeActions.clickOnSearchBtn();
		searchValidations.validateResult();
	}
	@Test
	public void madeSearchEmptyField() throws InterruptedException {
		homeActions.clickOnGiddyLogo(); ///Agregar todos los TC para que funcionen
		Thread.sleep(4000);
		homeActions.clickOnSearchBtn();
		searchValidations.validateResult();
	}



	


}
