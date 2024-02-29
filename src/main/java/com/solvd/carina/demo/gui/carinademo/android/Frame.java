package com.solvd.carina.demo.gui.carinademo.android;

import com.carina.demo.mobile.gui.pages.common.UIElementsPageBase;
import com.solvd.carina.demo.gui.carinademo.common.FrameBasePage;
import com.solvd.carina.demo.gui.carinademo.common.UIElementsBasePage;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = FrameBasePage.class)
public class Frame extends FrameBasePage implements IMobileUtils {

   @FindBy( id = "Navigate up")
    protected ExtendedWebElement navigateUp;

    @FindBy( id = "toolbar")
    protected ExtendedWebElement toolbar;

    @FindBy( id= "design_navigation_view")
    protected ExtendedWebElement uielements;

    @FindBy( id = "com.solvd.carinademoapplication:id/design_menu_item_text")
    protected ExtendedWebElement uielements2;

    @FindBy(className = "android.widget.ImageButton")
    private ExtendedWebElement leftMenuButton;

    public Frame(WebDriver driver) {
        super(driver);
    }

    @Override
    public void FrameBasePage(WebDriver driver) {
        this.driver= driver;
    }

@Override
    public void uielementsClick()
    {
        uielements.click();
    }

    @Override
    public UIElementsPageBase navigateToUIElementsPage() {
        leftMenuButton.click();
        uielements.click();
        return initPage(getDriver(), UIElementsPageBase.class);
    }
//
//    @Override
//    public UIElementsBasePage getUiElementsBasePage() {
//        return null;
//    }
//
//    @Override
//    public void setUiElementsBasePage(UIElementsBasePage uiElementsBasePage) {
//        this.uiElementsBasePage= uiElementsBasePage;
//    }

    public void navigatorUpClick()
    { navigateUp.click();          }



}
