package com.carina.demo.gui.bajalibros_pages;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends AbstractBajaLibros {

   // private final String specificPageUrl = "https://www.bajalibros.com/AR/Buscar?field=all&q=enga%C3%B1o&language=Espa%C3%B1ol";
    @FindBy(xpath= "//a[@title='El gran engaño - Mariana Mazzucato']")
    private ExtendedWebElement buyBtn2;

    public SearchPage(WebDriver driver) {
        super(driver);
    }

    public void buyBtnClick2()
    {
        buyBtn2.isElementPresent();
        buyBtn2.click();

    }
}
