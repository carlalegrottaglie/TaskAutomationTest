package com.carina.demo;

import com.carina.demo.gui.facebook_pages.FacebookPage;
import com.carina.demo.gui.facebook_pages.components.FacebookNewAccount;
import org.testng.annotations.Test;

import static com.zebrunner.agent.core.webdriver.RemoteWebDriverFactory.getDriver;

public class FacebookTest {

    @Test
    public void createNewAccount()
    {
        FacebookPage facebookPage= new FacebookPage(getDriver());
        facebookPage.open();
        facebookPage.clickCreateNewAcoount();
        FacebookNewAccount facebookNewAccount= facebookPage.getFacebookNewAccount();

    }
}
