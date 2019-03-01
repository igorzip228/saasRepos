package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateOfferPage {
    public WebDriver driver;


    public CreateOfferPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(css = "ng-select[bindlabel='username'] input")
    private WebElement advertiserField;

    @FindBy(css = "textarea[formcontrolname='previewUrl']")
    private WebElement prewiewUrlField;

    @FindBy(xpath = "(//i[@class='fa fa-magic'])[1]")
    private WebElement magicButton;

    @FindBy(xpath = "(//input[@ng-reflect-name='name'])[1]")
    private WebElement offerNameField;

    @FindBy(xpath = "//app-tags-select[@ng-reflect-name='tags'] / ng-select/div/div")
    private WebElement categoryField;

    @FindBy(xpath = "//app-distribution-type-select[@ng-reflect-name='distribution'] / ng-select / div / div")
    private WebElement distributionField;

    @FindBy(xpath = "//div[@class='ng-dropdown-panel-items scroll-host'] / div / div[2]")
    private WebElement distributionWEBButton;

    @FindBy(xpath = "(//button[@class='btn btn-ok createOffer-nav__next'])[1]")
    private WebElement nextStepButton1;

    @FindBy(xpath = "(//button[@class='btn btn-ok createOffer-nav__next'])[2]")
    private WebElement nextStepButton2;

    @FindBy(xpath = "(//button[@class='btn btn-ok createOffer-nav__next'])[3]")
    private WebElement createOffer;

    @FindBy(css = "app-goals-select div div.ng-value-container")
    private WebElement goalField;

    @FindBy(xpath = "(//div[@class='ng-option ng-star-inserted'])[6]")
    private WebElement installGoalButton;

    @FindBy(css = "textarea[ng-reflect-name='trackingUrl']")
    private WebElement trackingURLField;

    @FindBy(css = "ng-select[ng-reflect-placeholder='Countries'] div.ng-input input")
    private WebElement countryField;

    @FindBy(css = "app-input-number[ng-reflect-name='payout']  input")
    private WebElement payoutField;

    @FindBy(css = "i[class='platform-ico platform-ico_desktop']")
    private WebElement desktopButton;

    @FindBy(xpath = "// span[contains(text(), 'adv_280119')]")
    private WebElement getAdvertiserButton;

    @FindBy(xpath = "//div[@class='createOffer__input thumbnail__input'] / input")
    private WebElement thumbnailField;

    @FindBy(xpath = "(//div[@class='url-info__col url-info__col-2'] //label[@class='select-one__item'])[2]")
    private WebElement activateButton;


    public void createOffer() throws InterruptedException {
        DashBoardPage.clickOffersButton();
        DashBoardPage.clickCreateOfferButton();
        advertiserField.click();
        advertiserField.sendKeys("adv_280119");
        getAdvertiserButton.click();
        prewiewUrlField.sendKeys(Variables.getPreviewURL());
        magicButton.click();
        Thread.sleep(2000);
        //explicitWait(distributionField);
        distributionField.click();
        distributionWEBButton.click();
        offerNameField.clear();
        offerNameField.sendKeys(Variables.getOfferName());
        thumbnailField.clear();
        thumbnailField.sendKeys(Variables.getThumbnail());
        activateButton.click();

        Actions actions = new Actions(driver);
        actions.moveToElement(nextStepButton1);
        actions.click();
        actions.build().perform();

        nextStepButton2.click();

        Actions actions2 = new Actions(driver);
        actions2.moveToElement(goalField);
        actions2.click();
        actions2.build().perform();

        goalField.click();
        installGoalButton.click();
        trackingURLField.sendKeys(Variables.getTrackingURL());
        countryField.click();
        countryField.sendKeys(Variables.getCountry());
        payoutField.sendKeys(Variables.getPayout());
        desktopButton.click();

        Actions actions3 = new Actions(driver);
        actions3.moveToElement(createOffer);
        actions3.click();
        actions3.build().perform();
    }

    public void explicitWait(WebElement element){
        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

}
