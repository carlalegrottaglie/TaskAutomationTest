package com.webtest;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class PaymentDetailsPage extends AbstractPage {

    @FindBy(xpath = "//*[@id='Catalog']/form/input")
    private ExtendedWebElement continueBtn;

    public void continueBtnClick()
    {
       continueBtn.click();
    }
    public PaymentDetailsPage(WebDriver driver) {
        super(driver);
    }
}
