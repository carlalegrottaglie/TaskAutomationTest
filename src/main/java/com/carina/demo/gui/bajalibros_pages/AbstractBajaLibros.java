package com.carina.demo.gui.bajalibros_pages;

import com.carina.demo.gui.bajalibros_pages.components.CartForm;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

abstract class AbstractBajaLibros extends AbstractPage {

    private final CustomSearchContext  searchContext = new CustomSearchContext () ;


    @FindBy(xpath = "//div[@class='header-search']//input[@id='searchKeyword']")
    protected ExtendedWebElement searchText;
    @FindBy(xpath = "//*[@id='nav-cart']")
    protected ExtendedWebElement cartBtn;
    //h2[normalize-space()='Mi Carrito']
    @FindBy(className= "//h2[normalize-space()='Mi Carrito']")
    protected CartForm cartForm;

    protected AbstractBajaLibros(WebDriver driver) {
        super(driver);
    }


    public CartForm getCartForm() {
        return cartForm= new CartForm(getDriver(),searchContext);
    }


    public void cartBtnClick()
    {
        cartBtn.click();

    }


    public void searchTextType(String text)
    {
        searchText.type(text);
    }
}


