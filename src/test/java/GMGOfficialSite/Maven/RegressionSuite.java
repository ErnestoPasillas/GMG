package GMGOfficialSite.Maven;

import Actions.*;
import Models.HeaderMenuEnum;
import Models.SubHeaderOptions;
import org.testng.annotations.Test;

public class RegressionSuite  extends PadreClassGMG {

    LoginActions loginActions = new LoginActions();
    HomeActions homeActions = new HomeActions();
    MenuActions menuActions = new MenuActions();
    TopicActions topicActions = new TopicActions();
    AccountActions acccountActions = new AccountActions();
    CreateAccountActions createAccountActions = new CreateAccountActions();
    TagSearchActions tagSearchActions = new TagSearchActions();
    TopicsOfInteresActions topicsOfInteresActions = new TopicsOfInteresActions();


    @Test
    public void loginSussecfull()
    {
        homeActions.clickOnLoginBtn();
        loginActions.emailSetText();
        loginActions.passwordSetText();
        loginActions.clickOnLoginBtn();
    }

    @Test
    public void loginFailed()
    {
        homeActions.clickOnLoginBtn();
        loginActions.emailSetTextFaild();
        loginActions.passwordSetText();
        loginActions.clickOnLoginBtn();
    }




    @Test
    public void loginEmptyFields()
    {
        homeActions.clickOnLoginBtn();
        loginActions.clickOnLoginBtn();
    }



    @Test
    public void madeSearch() throws InterruptedException {
        Thread.sleep(4000);
        homeActions.searchSetText();
        homeActions.clickOnSearchBtn();
    }


    @Test
    public void tagSearchG() throws InterruptedException {
        Thread.sleep(4000);
        homeActions.clickOnTagSearchBtn();
        tagSearchActions.tagSearchFieldSetText();
        tagSearchActions.clickOnSearchBtn();
    }

    @Test
    public void tagSearchReset() throws InterruptedException
    {
        Thread.sleep(4000);
        homeActions.clickOnTagSearchBtn();
        tagSearchActions.tagSearchFieldSetText();
        tagSearchActions.clickOnSearchBtn();
        Thread.sleep(4000);
        tagSearchActions.clickOnResetBtn();
        Thread.sleep(2000);
    }




}
