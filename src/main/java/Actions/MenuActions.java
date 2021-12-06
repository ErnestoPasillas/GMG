package Actions;

import GMGOfficialSite.Maven.MenuPage;
import Utilities.WaitManager;

public class MenuActions {
	
	MenuPage menuPage = new MenuPage();
	
	
	public void clickOnGiddyLogoBtn()
	{
		 WaitManager.waitAndClick(menuPage.getGiddyLogo());
	}
	
	public void clickOnMyAccountBtn(){
		menuPage.getMyAccount().click();
	}

	public void clickOnMenuOption(String menu) {
		
		WaitManager.waitForElementToBePressent(menuPage.getMenuOption(menu));
		menuPage.getMenuOption(menu).click();
	}
	
	
	public void clickOnSubMenuOption(String subMenu) {
		
		WaitManager.waitForElementToBePressent(menuPage.getSubMenuOption(subMenu));
		menuPage.getSubMenuOption(subMenu).click();
	}

	
	public void clickOnFooterOption(String footer) {
		
		WaitManager.waitForElementToBePressent(menuPage.getFooterOption(footer));
		menuPage.getFooterOption(footer).click();
	}

	
	
	
}
