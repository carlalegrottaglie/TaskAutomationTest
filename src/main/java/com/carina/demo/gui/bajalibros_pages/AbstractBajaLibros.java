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


    @FindBy(xpath = "//div[@class='header-search']//input[@id='searchKeyword']")
    protected ExtendedWebElement searchText;

    @FindBy(xpath = "/html/body/header/div[2]/div[1]/div[2]/form/button[1]")
    protected ExtendedWebElement searchBtn;
    @FindBy(xpath = "//*[@id='nav-cart']")
    protected ExtendedWebElement cartBtn;
    //h2[normalize-space()='Mi Carrito']
    //@FindBy(xpath = "//h2[normalize-space()='Mi Carrito']")
    @FindBy(xpath= "//div[@class='detail-ebook desktop']//div[@class='col-detail price hide-on-small-only']//div[@class='content-price']//div[1]//a[1]")
  //  @FindBy(css = "body > div:nth-child(9) > div:nth-child(1) > div:nth-child(4) > div:nth-child(4) > div:nth-child(1) > div:nth-child(2) > a:nth-child(2)")
    private ExtendedWebElement buyBtn;
    protected CartForm cartForm;

    protected AbstractBajaLibros(WebDriver driver) {
        super(driver);
        CustomSearchContext searchContext = new CustomSearchContext();
        cartForm= new CartForm(getDriver(), searchContext);
    }


    public CartForm getCartForm() {
        cartBtn.isElementPresent();
        return cartForm;
    }

    public void cartBtnAutoOpen()
    {
        cartBtn.isElementPresent();


    }

    public void cartBtnClick()
    {
        cartBtn.isElementPresent();
        cartBtn.click();

    }

    public void searchBtnClick()
    {
        searchBtn.isElementPresent();
        searchBtn.click();

    }

    public void searchTextType(String text)
    {
        searchText.type(text);
    }
}


