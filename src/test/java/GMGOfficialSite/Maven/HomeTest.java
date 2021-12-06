package GMGOfficialSite.Maven;

import org.testng.Assert;
import org.testng.annotations.Test;


import Actions.HomeActions;
import Actions.LoginActions;
import Actions.MenuActions;

public class HomeTest extends PadreClassGMG{
	
	HomeActions homeActions = new HomeActions();
	
	LoginActions loginActions = new LoginActions();
	
	MenuActions menuActions = new MenuActions();



	@Test
	public void madeSearch()
	{
		homeActions.searchSetText();
		homeActions.clickOnSearchBtn();
	}

	@Test
	public void madeSearchWrongText() throws InterruptedException {
		homeActions.clickOnGiddyLogo(); ///Agregar todos los TC para que funcionen
		Thread.sleep(4000);
		homeActions.searchSetWrongText();
		homeActions.clickOnSearchBtn();
	}
	@Test
	public void madeSearchEmptyField() throws InterruptedException {
		homeActions.clickOnGiddyLogo(); ///Agregar todos los TC para que funcionen
		Thread.sleep(4000);
		homeActions.clickOnSearchBtn();
	}



	


}
