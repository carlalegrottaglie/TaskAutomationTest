package com.carina.demo.gui.facebook_pages;


import com.carina.demo.gui.bajalibros_pages.CustomSearchContext;
import com.carina.demo.gui.facebook_pages.components.FacebookNewAccount;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.carina.demo.gui.bajalibros_pages.*;
import com.carina.demo.gui.bajalibros_pages.components.CartForm;
import com.zebrunner.carina.core.IAbstractTest;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.awt.*;
import java.time.Duration;

public class FacebookPage extends AbstractPage {

    @FindBy(xpath ="//*[@id='email']")
    private ExtendedWebElement email;

    @FindBy(xpath ="//*[@id='pass']")
    private ExtendedWebElement pass;

    @FindBy(xpath = "//*[@text='Create new account']")
    private ExtendedWebElement createNewAccBtn;

    @FindBy(xpath = "//*[@data-testid='open-registration-form-button']")
    private ExtendedWebElement createNewAccBtn2;
    @FindBy(xpath = "/html/body/div[3]/div[2]/div/div")
    private FacebookNewAccount facebookNewAccount;


    public FacebookPage(WebDriver driver) {
        super(driver);
    }
    public FacebookNewAccount clickCreateNewAccount()
    {

//        try {
//            createNewAccBtn.click();
            try {
                createNewAccBtn2.click();
//            } catch (Exception e) {
//                throw new RuntimeException(e);
//            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return getFacebookNewAccount();
    }

    public FacebookNewAccount getFacebookNewAccount()
    {
        return facebookNewAccount;
    }

}
