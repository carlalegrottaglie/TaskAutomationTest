package com.carina.demo.gui.bajalibros_pages;

import com.carina.demo.gui.bajalibros_pages.components.CartForm;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import javax.naming.ldap.ExtendedRequest;

public class HomePage extends AbstractBajaLibros {



    @FindBy(css = "html.webp body.www div.container-books.home div.container div.wrap.landing div.carousel-standard div#basic347.frame ul.clearfix li a")
    private ExtendedWebElement book1;
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void book1Click()
    {
        book1.click();

    }
}