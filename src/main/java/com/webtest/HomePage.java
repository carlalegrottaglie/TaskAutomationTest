package com.webtest;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class HomePage extends AbstractPage {

    @FindBy(xpath = "//*[@id='MenuContent']/a[2]")
    private ExtendedWebElement singInBtn;

    public void singInBtnClick()
    { if (singInBtn.isVisible()) singInBtn.click();}

    public HomePage(WebDriver driver) {
        super(driver);
    }
}
