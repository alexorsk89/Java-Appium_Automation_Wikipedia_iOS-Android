package tests.iOS;

import lib.UI.WelcomePageObject;
import lib.iOSTestCase;
import org.junit.Test;

public class GetStartedTest extends iOSTestCase
{
    @Test
    public void testPassThroughWelcome()
    {
        WelcomePageObject WelcomePage = new WelcomePageObject(driver);

        WelcomePage.waitForLearnMoreLink();
        WelcomePage.clickSkipButton();

//        WelcomePage.waitNewWayToExplore();
//        WelcomePage.clickNextButton();
//
//        WelcomePage.waitAddOrEditPreferredLanguages();
//        WelcomePage.clickNextButton();
//
//        WelcomePage.waitLearnMoreAboutDataCollections();
//        WelcomePage.clickGetStartedButton();
    }

}
