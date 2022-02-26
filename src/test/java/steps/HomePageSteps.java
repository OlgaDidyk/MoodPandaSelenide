package steps;

import com.codeborne.selenide.Condition;
import constants.HomePageConstants;

import static com.codeborne.selenide.Selenide.$;

public class HomePageSteps extends AbstractSteps {

    public static final String TITLE_CSS_PATTERN = ".%s .title";
    public static final String TITLE_CSS = String.format(TITLE_CSS_PATTERN, System.getProperty("HOME_PAGE_TITLE_CSS"));
    public static final String POST_BUTTON_CSS = ".buttons a[href='/post']";

    public HomePageSteps isHomeOpened() {
        $(TITLE_CSS).shouldHave(Condition.text(HomePageConstants.TITLE_TEXT));
        $(TITLE_CSS).shouldBe(Condition.visible);
        return this;
    }

    public PostMoodSteps postMood() {
        $(POST_BUTTON_CSS).click();
        return new PostMoodSteps();
    }

}
