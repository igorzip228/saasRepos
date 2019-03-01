import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DashBoardPage;
import pages.Variables;

public class Tests extends TestBase{
    @Test
    public void logIn(){
        loginPage.logIn();
        Assert.assertTrue(dashBoardPage.getUsersButton().isEnabled());
    }

    @Test (dependsOnMethods = {"logIn"})
    public void createManager() throws InterruptedException {
        createManagerPage.createManager();
        Assert.assertEquals((driver.findElements(By.cssSelector("div.manager-info__name > span + br + span")).get(0).getText()), Variables.getEmailManager());
    }

    @Test (dependsOnMethods = {"logIn"})
    public void createOffer() throws InterruptedException {
        createOfferPage.createOffer();
        Assert.assertEquals((driver.findElements(By.xpath("(//strong[@class='css-popover'] / span)[1]")).get(0).getText()), Variables.getOfferName());
    }
}
