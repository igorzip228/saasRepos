package pages.managerPages;

import pages.Variables;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainManagersPage {
    public WebDriver driver;

    public MainManagersPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//span[@translate='managersManage.createBtn']")
    public static WebElement createManagerButton;

    public static void clickCreateManagerButton() {
        createManagerButton.click();
    }
}
