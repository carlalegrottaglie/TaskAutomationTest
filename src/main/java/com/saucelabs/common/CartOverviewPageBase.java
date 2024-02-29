package com.saucelabs.common;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class CartOverviewPageBase extends AbstractPage {

    public abstract void finishBtnClick();

    public abstract void swipeToFinishBtn();

    protected CartOverviewPageBase(WebDriver driver) {
        super(driver);
    }
}

