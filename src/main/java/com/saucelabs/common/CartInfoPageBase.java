package com.saucelabs.common;

import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class CartInfoPageBase extends AbstractPage {

    public abstract void typeName(String text);

    public abstract void typeLastName(String text);

    public abstract void typezipCode(String text);

    public abstract void continueBtnClick();
    protected CartInfoPageBase(WebDriver driver) {
        super(driver);
    }
}
