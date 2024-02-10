package com.carina.demo.gui.bajalibros_pages.components;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class CartForm extends AbstractUIObject {


    @FindBy(xpath = "//*[@id='confirmBuyFooter']")
    private ExtendedWebElement confirmBuyFooterBtn;

    @FindBy(xpath ="/html/body/div[10]/ul/li[1]/div[3]/a")
    private ExtendedWebElement eliminateBookBtn;

    //#itemBlock2046958 > div:nth-child(3) > a:nth-child(1)
    public CartForm(WebDriver driver) {
        super(driver);
    }

    public void confirmBuyFooterBtnClick()
    {
        confirmBuyFooterBtn.click();
    }
}
