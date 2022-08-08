package lib.UI;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class WelcomePageObject extends MainPageObject
{
    private static final String
        STEP_LEARN_MORE_LINK = "The free encyclopedia",
        STEP_NEW_WAY_TO_EXPLORE = "New ways to explore",
        STEP_ADD_OR_EDIT_PREFFEREDLANGUAGES = "//XCUIElementTypeStaticText[@name=\"Add or edit preferred languages\"]",
        STEP_LEARN_MORE_ABOUT_DATA_COLLECTIONS = "//XCUIElementTypeStaticText[@name=\"Learn more about data collected\"]",
        STEP_GET_STARTED_BUTTON = "//XCUIElementTypeStaticText[@name=\"Get started\"]",
        STEP_NEXT_BUTTON = "//XCUIElementTypeButton[@name=\"Next\"]",
        STEP_SKIP_BUTTON = "//XCUIElementTypeButton[@name=\"Skip\"]";


    public WelcomePageObject(AppiumDriver driver)
    {
        super(driver);
    }

    public void waitForLearnMoreLink()
    {
        this.waitForElementPresent(By.id(STEP_LEARN_MORE_LINK), "Cannot find 'Learn more' link", 10);
    }

    public void waitNewWayToExplore()
    {
        this.waitForElementPresent(By.id(STEP_NEW_WAY_TO_EXPLORE), "Cannot find 'New ways to explore' link", 10);
    }

    public void waitAddOrEditPreferredLanguages()
    {
        this.waitForElementPresent(By.xpath(STEP_ADD_OR_EDIT_PREFFEREDLANGUAGES), "Cannot find 'Add Or Edit Preferred Languages' link", 10);
    }

    public void waitLearnMoreAboutDataCollections()
    {
        this.waitForElementPresent(By.xpath(STEP_LEARN_MORE_ABOUT_DATA_COLLECTIONS), "Cannot find 'Learn more about data collected' link", 10);
    }
    public void clickGetStartedButton()
    {
        this.waitForElementAndClick(By.xpath(STEP_GET_STARTED_BUTTON), "Cannot find and click 'Get Started' button", 10);
    }

    public void clickNextButton()
    {
        this.waitForElementAndClick(By.xpath(STEP_NEXT_BUTTON), "Cannot find and click 'Next' button", 10);
    }
    public void clickSkipButton()
    {
        this.waitForElementAndClick(By.xpath(STEP_SKIP_BUTTON), "Cannot find and click 'Skip' button", 10);
    }
}
