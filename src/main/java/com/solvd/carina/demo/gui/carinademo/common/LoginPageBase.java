package com.solvd.carina.demo.gui.carinademo.common;

import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class   LoginPageBase  extends AbstractPage {
    protected LoginPageBase(WebDriver driver) {
        super(driver);
    }
    public abstract void typeName(String name);

    public abstract void typePassword(String password);

    public abstract void selectMaleSex();

    public abstract void selectFemaleSex();

    public abstract void checkPrivacyPolicyCheckbox();

    public abstract FrameBasePage clickLoginBtn();

    public abstract boolean isLoginBtnActive();

    public abstract FrameBasePage login();

    public void onlyClickLoginBtn() {
    }
}
