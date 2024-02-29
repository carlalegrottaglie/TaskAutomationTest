package com.saucelabs.common;


import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;


public abstract class LoginPageBase extends AbstractPage {

    public abstract void typeUsername(String text);

    public abstract void typePassword(String text);

    public abstract void clickLoginBtn();

    public abstract boolean isWrongMsgPresent();

    public LoginPageBase(WebDriver driver) {
        super(driver);
    }
}