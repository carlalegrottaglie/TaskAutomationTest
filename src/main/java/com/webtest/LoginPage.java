package com.webtest;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends AbstractPage {
   @FindBy(xpath = "//*[@id='Catalog']/a")
   private ExtendedWebElement registerBtn;

    @FindBy(xpath = "//*[@name='username']")
    private ExtendedWebElement username;

    @FindBy(xpath = "//*[@id='Catalog']/form/p[2]/input[2]")
    private ExtendedWebElement password;

    @FindBy(xpath = "//*[@id='Catalog']/form/input")
    private ExtendedWebElement loginBtn;

    @FindBy(xpath = "//div[@id='Content']/ul/li")
    public ExtendedWebElement wrongMsg;

    @FindBy(css = "#WelcomeContent")
    public ExtendedWebElement welcomeMsg;

    public boolean isWelcomeMsgPresent()
    {
        return isElementWithTextPresent(welcomeMsg,"Welcome");
    }
    public boolean isWrongMsgPresent() {
        return isElementWithTextPresent(wrongMsg,"Invalid username or password. Signon failed");
    }
    public void typeUsername(String string)
    {
        username.type(string);
    }

    public void typePassword(String string)
    {
        password.type(string);
    }

    public void loginBtnClick()
    {
        if (loginBtn.isVisible())
            loginBtn.click();
    }
   public void regiterBtnClick()
   {
       if (registerBtn.isVisible())
            registerBtn.click();
   }


    public LoginPage(WebDriver driver) {
        super(driver);
    }
}
