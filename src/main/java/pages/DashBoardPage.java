package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;

public class DashBoardPage {
    public WebDriver driver;


    public DashBoardPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//span[contains(text(), 'Users')]")
    private static WebElement usersButton;

    @FindBy(css = "a[routerlink='/manager/managers']")
    private static WebElement managersButton;

    @FindBy(css = "a[routerlink='/manager/advertisers']")
    private WebElement advertisersButton;

    @FindBy(css = "a[routerlink='/manager/publishers']")
    private WebElement publishersButton;

    @FindBy(xpath = "//span[contains(text(), 'Offers')]")
    private static WebElement offersButton;

    @FindBy(css = "a[routerlink='/manager/offers/create']")
    private static WebElement createOfferButton;

    public static WebElement getUsersButton() {
        return usersButton;
    }

    public static void clickUsersaButton() {
        usersButton.click();
    }

    public static void clickManagersButton() {
        managersButton.click();
    }

    public static void clickOffersButton(){
        offersButton.click();
    }

    public static void clickCreateOfferButton(){
        createOfferButton.click();
    }

    public Boolean isEmailManager() {
        String emailForCheck = driver.findElements(By.cssSelector("div.manager-info__name > span + br + span")).get(0).getText();
        System.out.printf("Емайл менеджера " + emailForCheck);
        System.out.printf("Переменная " + Variables.getEmailManager());
        if (emailForCheck == Variables.getEmailManager()) {
            System.out.printf("Емайл менеджера " + emailForCheck);
            return true;
        } else return false;
    }





}