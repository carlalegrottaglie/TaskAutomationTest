package com.carina.demo.gui.bajalibros_pages;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class PaymentPage extends AbstractBajaLibros {

    @FindBy(xpath= "/html[1]/body[1]/div[3]/div[1]/div[2]/div[6]/div[1]/a[1]")
    private ExtendedWebElement confirmBuyBtn;

    protected PaymentPage(WebDriver driver) {
        super(driver);
    }
}
