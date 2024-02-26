package com.solvd.carina.demo.gui.carinademo.common;

import com.carina.demo.mobile.gui.pages.common.ChartsPageBase;
import com.carina.demo.mobile.gui.pages.common.MapsPageBase;
import com.carina.demo.mobile.gui.pages.common.UIElementsPageBase;
import com.carina.demo.mobile.gui.pages.common.WebViewPageBase;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public abstract class FrameBasePage extends AbstractPage {


    public FrameBasePage(WebDriver driver) {
        super(driver);
    }

    public abstract void uielementsClick();


    public abstract void FrameBasePage(WebDriver driver);

    public abstract UIElementsPageBase navigateToUIElementsPage();

}
