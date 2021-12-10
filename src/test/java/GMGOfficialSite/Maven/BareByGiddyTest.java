package GMGOfficialSite.Maven;

import Actions.BareByGiddyActions;
import Actions.MenuActions;
import Models.FooterMenu;
import Models.HeaderMenuEnum;
import org.testng.annotations.Test;

public class BareByGiddyTest extends PadreClassGMG{

    BareByGiddyActions bareByGiddyActions = new BareByGiddyActions();
    MenuActions menuActions = new MenuActions();


    @Test
    public void filterByTopic(){

        menuActions.clickOnMenuOption(HeaderMenuEnum.BABRE_BY_GIDDY.getMenuOption());
        bareByGiddyActions.chooseTopic();

    }


    @Test
    public void filterByCelebrity() throws InterruptedException {
        menuActions.clickOnMenuOption(HeaderMenuEnum.BABRE_BY_GIDDY.getMenuOption());
        Thread.sleep(3000);
        bareByGiddyActions.chooseCelebrity();
    }


    @Test
    public void setText() throws InterruptedException {
        menuActions.clickOnMenuOption(HeaderMenuEnum.BABRE_BY_GIDDY.getMenuOption());
        Thread.sleep(3000);
        bareByGiddyActions.setText();
    }
}
