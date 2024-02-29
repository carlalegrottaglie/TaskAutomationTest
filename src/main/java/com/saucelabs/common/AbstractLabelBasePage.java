package com.saucelabs.common;

import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class AbstractLabelBasePage extends AbstractPage {

    protected AbstractLabelBasePage(WebDriver driver) {
        super(driver);
    }


    public abstract void cartBtnClick();

}
