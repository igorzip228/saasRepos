import pages.Variables;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import pages.CreateOfferPage;
import pages.DashBoardPage;
import pages.LoginPage;
import pages.managerPages.CreateManagerPage;
import pages.managerPages.MainManagersPage;

import java.util.concurrent.TimeUnit;

public class TestBase {

    public WebDriver driver;
    public LoginPage loginPage;
    public DashBoardPage dashBoardPage;
    public CreateOfferPage createOfferPage;
    public MainManagersPage managerPage;
    public CreateManagerPage createManagerPage;

    public static Variables variables;

    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\QA-Team\\IdeaProjects\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://saas_new.loove.co/login");
        loginPage = new LoginPage(driver);
        dashBoardPage = new DashBoardPage(driver);
        createOfferPage = new CreateOfferPage(driver);
        managerPage = new MainManagersPage(driver);
        createManagerPage = new CreateManagerPage(driver);
        variables = new Variables();
    }

}

