package Actions;

import GMGOfficialSite.Maven.ProfilePage;

public class ProfileActions {

    ProfilePage profilePage = new ProfilePage();

    public void clickOnSingOutBtn(){

        profilePage.getSingOut().click();
    }

}
