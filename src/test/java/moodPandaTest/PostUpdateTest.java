package moodPandaTest;

import org.testng.annotations.Test;


public class PostUpdateTest extends BaseTest {

    @Test
    public void postUpdateTest() {
        loginSteps
                .open()
                .validLogin()
                .isHomeOpened()
                .postMood()
                .isPostPageOpened()
                .fillNewMood(10, "FINISHED");

    }

}
