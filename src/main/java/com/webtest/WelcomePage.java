package com.webtest;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WelcomePage extends AbstractPage {

    @FindBy(css = "area[alt='Cats']")
    private ExtendedWebElement catPic;

    //<area alt="Cats" coords="225,240,295,310" href="Catalog.action?viewCategory=&amp;categoryId=CATS" shape="RECT" letxxpath="letX">

    @FindBy(xpath ="//img[@src='../images/cats_icon.gif']")
    private ExtendedWebElement catText;

    public void catPicClick() {
        catPic.click();
    }

    public void catTextClick() {
        catText.click();
    }

    public WelcomePage(WebDriver driver) {
        super(driver);
    }
}
