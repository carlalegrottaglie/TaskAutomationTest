package com.saucelabs.common;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public abstract class BlackTSPageBase extends AbstractPage {

    public abstract void addToCartBlackTSClick();

    public abstract void swipeToAddToCartBlackTS();

    protected BlackTSPageBase(WebDriver driver) {
        super(driver);
    }
}
