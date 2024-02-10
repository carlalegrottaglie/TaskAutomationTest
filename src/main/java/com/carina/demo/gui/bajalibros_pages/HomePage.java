package com.carina.demo.gui.bajalibros_pages;

import com.carina.demo.gui.bajalibros_pages.components.CartForm;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import javax.naming.ldap.ExtendedRequest;

public class HomePage extends AbstractPage {

    @FindBy(xpath = "//*[@id='nav-cart']")
     private ExtendedRequest cartBtn;
    @FindBy(className= "header-checkout-side")
    CartForm cartForm;
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public CartForm getCartForm() {
        return new CartForm(getDriver());
    }


   /* public void clickLoginBtn()
    {
        cartBtn.click();

    }*/
}

