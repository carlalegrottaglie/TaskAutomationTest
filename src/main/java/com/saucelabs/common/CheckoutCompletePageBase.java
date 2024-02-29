package com.saucelabs.common;

import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class CheckoutCompletePageBase extends AbstractPage {

    public abstract boolean isorderDispachedMsgPresent() ;
    protected CheckoutCompletePageBase(WebDriver driver) {
        super(driver);
    }
}
