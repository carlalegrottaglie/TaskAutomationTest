package com.solvd.carina.demo.gui.carinademo.component;

import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;

public class ComponentBase extends AbstractUIObject {
    protected ComponentBase(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }
}
