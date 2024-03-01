package com.webtest;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends AbstractPage {
    @FindBy(xpath = "//*[@id='Cart']/form/table/tbody/tr[2]/td[5]/input")
    private ExtendedWebElement quantity;
    @FindBy(xpath = "//*[@id='Cart']/form/table/tbody/tr[3]/td[1]/input")
    private ExtendedWebElement updateCartBtn;
    @FindBy(xpath = "//a[normalize-space()='Proceed to Checkout']")
    private ExtendedWebElement checkoutBtn;
    public void checkoutBtnClick()
    {
        checkoutBtn.click();
    }
    public void updateCartBtnClick()
    {
        updateCartBtn.click();
    }
    public void quantityType(String string)
    {
        quantity.sendKeys(Keys.CLEAR);
        quantity.type(string);
    }
    public ShoppingCartPage(WebDriver driver) {
        super(driver);
    }
}
