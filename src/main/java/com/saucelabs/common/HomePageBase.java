package com.saucelabs.common;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public abstract class HomePageBase extends AbstractPage {

    public abstract void sortBtn();

    public abstract void priceLowToHighBtnClick();

    public abstract void swipeToAddBlackTS();

    public abstract void  addBlackTSClick();

    public abstract void selectBlackPicTSClick();

    public abstract void selectBlackLabelTSClick();



    public abstract void swipeToAddBlackPLabelTS();

    public HomePageBase(WebDriver driver) {
        super(driver);
    }
}
