package com.webtest;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class PaymentConfirmPage extends AbstractPage {
    @FindBy(xpath = "//*[@id='Catalog']/a")
    private ExtendedWebElement confirmBtn;
   @FindBy(xpath = "//*[@id='Content']/ul/li")
   private ExtendedWebElement confirmationMsg;
   public boolean isConfirmationMsgPresent()
   {
       return isElementWithTextPresent(confirmationMsg, "Thank you, your order has been submitted.");
   }
    public void confirmBtnClick()
    {
       confirmBtn.click();
    }
    public PaymentConfirmPage(WebDriver driver) {
        super(driver);
    }
}
