package com.webtest;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class PersianCatPage extends AbstractPage {
    @FindBy(xpath = "//*[@id='Catalog']/table/tbody/tr[2]/td[5]/a")
    private ExtendedWebElement persianFemaleAdd;
    public void persianFemaleAddClick()
    {
       persianFemaleAdd.click();
    }
    public PersianCatPage(WebDriver driver) {
        super(driver);
    }
}
