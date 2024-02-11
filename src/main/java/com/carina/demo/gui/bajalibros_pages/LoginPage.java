package com.carina.demo.gui.bajalibros_pages;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;


public class LoginPage extends AbstractPage {

    @FindBy(xpath = "//input[@id = 'FrontuserEmail']")
    private ExtendedWebElement emailInputField;
    // @FindBy(css = "#email")
   // @FindBy(css = "data[Frontuser][password]")
    @FindBy(xpath = "//input[@id='FrontuserPassword']")
    private ExtendedWebElement passInputField;
   // <input type="password" name="data[Frontuser][password]" tabindex="8" id="FrontuserPassword" class="validate browser-default valid" pattern=".{6,}" title="Minimo 6 caracteres" placeholder="">

   // @FindBy(css = "Ingresar")

   // <button class="button-register-login " type="submit" name="Login" tabindex="3">Ingresar</button>
   @FindBy(className = "button-register-login")
    private ExtendedWebElement loginButton;


    @FindBy(xpath = "/html/body/div[2]/div/div/form/div[2]/div[3]/p[1]")
    private ExtendedWebElement emailErrorMessage;


   // /html/body/div[2]/div/div/form/div[2]/div[3]/p[2]
   // @FindBy(xpath = "//*text() = 'La contraseña ingresada es incorrecta, por favor corrige y prueba nuevamente'")
    @FindBy(xpath = "/html/body/div[2]/div/div/form/div[2]/div[3]/p[2]")
    private ExtendedWebElement passErrorMessage;


    @FindBy(xpath ="//*[@id= 'create-account']")
    private ExtendedWebElement createBtn;

    public LoginPage(WebDriver driver) {
        super(driver);
    }


    public void typeEmail(String email)
    {
        emailInputField.type(email);

    }

    public void typePass(String pass)
    {
        passInputField.type(pass);

    }
    public void clickLoginBtn()
    {
       loginButton.click();
        new HomePage(getDriver());
    }

    // Method to get the login button WebElement
    public WebElement getLoginBtn() {
        return driver.findElement(By.name("Login"));
    }

    public boolean isEmailErrorMessage() {
        return emailErrorMessage.isElementPresent();

    }
    public boolean isPassErrorMessage() {
        return passErrorMessage.isElementPresent();

    }

     public RegistrationPage clickCreateBtn()
   {
       createBtn.click();
       return new RegistrationPage(getDriver());

   }


    public ExtendedWebElement getPasswordField() {

        return passInputField;
    }

    public ExtendedWebElement getEmailField() {
        return emailInputField;
    }
}
