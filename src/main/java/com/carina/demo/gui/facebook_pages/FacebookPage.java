package com.carina.demo.gui.facebook_pages;

import com.carina.demo.gui.bajalibros_pages.HomePage;
import com.carina.demo.gui.facebook_pages.components.FacebookNewAccount;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.reporters.EmailableReporter;

public class FacebookPage extends AbstractPage {

    @FindBy(xpath ="//*[@id='email']")
    private ExtendedWebElement email;

    @FindBy(xpath ="//*[@id='pass']")
    private ExtendedWebElement pass;

    @FindBy(xpath = "//*[@id='u_0_0_Dw']")
    private ExtendedWebElement createBtn;
    @FindBy(xpath = "/html/body/div[3]/div[2]/div/div")
    private FacebookNewAccount facebookNewAccount;


    public FacebookPage(WebDriver driver) {
        super(driver);
    }
    public void clickCreateNewAcoount()
    {
        createBtn.click();
        //new HomePage(getDriver());
    }

    public FacebookNewAccount getFacebookNewAccount()
{ return facebookNewAccount;}


}
