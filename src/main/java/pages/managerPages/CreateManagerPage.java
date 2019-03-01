package pages.managerPages;


import org.openqa.selenium.interactions.Actions;
import pages.DashBoardPage;
import pages.Variables;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class CreateManagerPage {
    public WebDriver driver;

    public CreateManagerPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(css = "app-input-text[formcontrolname='username'] input")
    private WebElement userNameField;

    @FindBy(css = "app-input-text[formcontrolname='firstName'] input")
    private WebElement firstNameField;

    @FindBy(css = "app-input-text[formcontrolname='lastName'] input")
    private WebElement lastNameField;

    @FindBy(css = "app-input-text[formcontrolname='email'] input")
    private WebElement emailField;

    @FindBy(xpath = "//span[contains(text(), 'Active')]")
    private WebElement activeStatusButton;

    @FindBy(xpath = "(//input[@role='combobox'])[4]")
    private WebElement forRoleDropDownList;

    @FindBy(xpath = "(//div[@class='ng-dropdown-panel-items scroll-host'] /div / div)[1]")
    private WebElement headRoleButton;

    @FindBy(css = "app-password[ng-reflect-form-control-name='password']")
    private WebElement passwordField;

    @FindBy(xpath = "(//div[@class='createOffer__input'])[16]")
    private WebElement confirmPasswordField;

    @FindBy(css = "button[class='btn btn-ok create-user__create']")
    private WebElement createManagerButton;



    public void createManager() throws InterruptedException {
        DashBoardPage.clickUsersaButton();
        DashBoardPage.clickManagersButton();
        MainManagersPage.clickCreateManagerButton();
        userNameField.sendKeys(Variables.getManagerUserName());
        firstNameField.sendKeys(Variables.getFirstNameManager());
        lastNameField.sendKeys(Variables.getLastNameManager());
        emailField.sendKeys(Variables.getEmailManager());
        activeStatusButton.click();
        forRoleDropDownList.click();
        headRoleButton.click();

        Actions actions = new Actions(driver);
        actions.moveToElement(passwordField);
        actions.click();
        actions.sendKeys(Variables.getPasswordData());
        actions.build().perform();

        actions.moveToElement(confirmPasswordField);
        actions.click();
        actions.sendKeys(Variables.getPasswordData());
        actions.build().perform();

        actions.moveToElement(createManagerButton);
        actions.click();
        actions.build().perform();

    }
}
