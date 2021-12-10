package GMGOfficialSite.Maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BareByGiddyPage {
    WebDriver driver = PadreClassGMG.getDriver();

    By SearchField = By.id("edit-combine");



    public WebElement setSearchField(){
        return driver.findElement(SearchField);
    }

}
