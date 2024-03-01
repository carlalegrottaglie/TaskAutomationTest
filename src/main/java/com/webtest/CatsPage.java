package com.webtest;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class CatsPage extends AbstractPage {
    @FindBy(xpath = "//a[contains(text(),'FL-DLH-02')]")
    private ExtendedWebElement persianCat;
    public void  persianCatClick()
    {
        persianCat.click();
    }
    public CatsPage(WebDriver driver) {
        super(driver);
    }
}
