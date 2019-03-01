package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {
    public WebDriver driver;


    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(css = "input[placeholder='Email']")
    private WebElement emailField;

    @FindBy(css = "input[placeholder='Password']")
    private WebElement passwordField;

    @FindBy(css = "input[value='Login']")
    private WebElement loginButton;

    @FindBy(xpath = "//a[contains(text(), 'Forgot Password?')]")
    private WebElement forgotPasswordButton;

    @FindBy(xpath = "//label[contains(text(), 'Publisher')]")
    private WebElement publisherSwitchButton;

    public void logIn(){
        emailField.sendKeys(Variables.getEmailData());
        passwordField.sendKeys(Variables.getPasswordData());
        loginButton.click();
    }
}
