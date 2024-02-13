package com.carina.demo.gui.facebook_pages.components;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class FacebookNewAccount extends AbstractUIObject {

    @FindBy(xpath ="//*[@id='u_c_b_qc']")
    private ExtendedWebElement nombre;
    protected FacebookNewAccount(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

}

