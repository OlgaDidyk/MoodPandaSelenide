package moodPandaTest;

import com.codeborne.selenide.Configuration;
import constants.DomainConstants;
import constants.WindowSizeConstants;
import model.WindowsSize;
import org.testng.annotations.BeforeMethod;
import steps.AuthenticationSteps;


public class BaseTest {

    static {
        System.setProperty("browser", "chrome");
    }

    AuthenticationSteps loginSteps = new AuthenticationSteps();


    @BeforeMethod
    public void setUp() {
        Configuration.headless = false;
        //Configuration.baseUrl = System.getProperty("baseUrl");
        Configuration.baseUrl = DomainConstants.BASE_URL;
        Configuration.browser = System.getProperty("browser");
        configureWindowSizeDependencies(WindowSizeConstants.MEDIUM_SIZE);
        //configureWindowSizeDependencies(WindowSizeConstants.SMALL_SIZE);

    }

    public void configureWindowSizeDependencies(WindowsSize windowSize) {
        Configuration.browserSize = windowSize.getScreenSize();
        System.setProperty("HOME_PAGE_TITLE_CSS", windowSize.getElementClass());
    }

}
