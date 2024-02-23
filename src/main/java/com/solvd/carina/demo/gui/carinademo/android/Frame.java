package com.solvd.carina.demo.gui.carinademo.android;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class Frame extends AbstractPage {

   @FindBy( id = "Navigate up")
    protected ExtendedWebElement navigateUp;

    @FindBy( id = "toolbar")
    protected ExtendedWebElement toolbar;

    @FindBy( id= "design_navigation_view")
    protected ExtendedWebElement uielements;

    @FindBy( id = "com.solvd.carinademoapplication:id/design_menu_item_text")
    protected ExtendedWebElement uielements2;

    protected Frame(WebDriver driver) {
        super(driver);
    }

    public void navigatorUpClick()
    { navigateUp.click();
         }
}
