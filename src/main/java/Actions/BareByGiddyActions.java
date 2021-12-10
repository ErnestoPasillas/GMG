package Actions;

import GMGOfficialSite.Maven.BareByGiddyPage;
import GMGOfficialSite.Maven.Methods;
import Utilities.WaitManager;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;

public class BareByGiddyActions {

    BareByGiddyPage bareByGiddyPage = new BareByGiddyPage();


    public void setText()
    {
        try {
            WaitManager.waitForElementToBePressent(bareByGiddyPage.setSearchField());

            bareByGiddyPage.setSearchField().clear();
            bareByGiddyPage.setSearchField().sendKeys("cancer");
            bareByGiddyPage.setSearchField().sendKeys(Keys.ENTER);

        }catch(NoSuchElementException e ){

            e.printStackTrace();
        }
    }
    public void chooseTopic()
    {
        try {
            Methods.dropdown("edit-tid", "6830");

        }catch(NoSuchElementException e ){

            e.printStackTrace();
        }
    }


    public void chooseCelebrity()
    {
        try {
            Methods.dropdown2("field_celebrity_target_id", "13657");

        }catch(NoSuchElementException e ){

            e.printStackTrace();
        }
    }





}
