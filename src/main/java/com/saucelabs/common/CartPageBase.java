package com.saucelabs.common;

import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class CartPageBase extends AbstractPage {


    public abstract void swipeToCheckoutBtn();
    public abstract void checkoutBtnClick();
    protected CartPageBase(WebDriver driver) {
        super(driver);
    }
}
