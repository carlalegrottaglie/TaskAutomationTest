package com.webtest;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends AbstractPage {

    @FindBy(xpath = "//*[@name='username']")
    private ExtendedWebElement userID;

    @FindBy(xpath = "//*[@name='password']")
    private ExtendedWebElement newPassword;

    @FindBy(xpath = "//*[@name='repeatedPassword']")
    private ExtendedWebElement repeatPassword;

    @FindBy(xpath = "//*[@name='account.firstName']")
    private ExtendedWebElement  firstName;

    @FindBy(xpath = "//*[@name='account.lastName']")
    private ExtendedWebElement lastName;

    @FindBy(xpath = "//*[@name='account.email']")
    private ExtendedWebElement  email;

    @FindBy(xpath = "//*[@name='account.phone']")
     private ExtendedWebElement phone;

    @FindBy(xpath = "//*[@name='account.address1']")
    private ExtendedWebElement address1;

    @FindBy(xpath = "//*[@name='account.address2']")
    private ExtendedWebElement address2;

    @FindBy(xpath = "//*[@name='account.city']")
    private ExtendedWebElement city;

    @FindBy(xpath = "//*[@name='account.state']")
    private ExtendedWebElement state;

    @FindBy(xpath = "//*[@name='account.zip']")
    private ExtendedWebElement  zip;

    @FindBy(xpath = "//*[@name='account.country']" )
    private ExtendedWebElement country;

    @FindBy(xpath = "//*[@name='account.languagePreference']")
    private ExtendedWebElement  languagePreference;

    @FindBy(xpath = "//*[@name='account.favouriteCategoryId']")
    private ExtendedWebElement favouriteCategory;


    @FindBy(xpath = "//*[@name='account.listOption']")
    private ExtendedWebElement enableMyList;

    @FindBy(xpath = "//*[@name='account.bannerOption']")
    private ExtendedWebElement  enableMyBanner;

    @FindBy(xpath = "//*[@name='newAccount']")
    private ExtendedWebElement  newAccountBtn;


    public void userIDType (String string)
    {
        userID.type(string);
    }

    public void newPasswordType (String string)
    {
        newPassword.type(string);
    }

    public void repeatPasswordType (String string)
    {
        repeatPassword.type(string);
    }

     public void firstNameType (String string)
    {
        firstName.type(string);
    }



    public void lastNameType (String string)
    {
        lastName.type(string);
    }

    public void emailType (String string)
    {
        email.type(string);
    }

    public void phoneType (String string)
    {
        phone.type(string);
    }

    public void address1Type (String string)
    {
        address1.type(string);
    }

    public void address2Type (String string)
    {
        address2.type(string);
    }


    public void cityType (String string)
    {
        city.type(string);
    }

    public void stateType (String string)
    {
        state.type(string);
    }

    public void zipType (String string)
    {
        zip.type(string);
    }

    public void countryType (String string)
    {
        country.type(string);
    }

    public void languagePreferenceSelect (String string)
    {
        languagePreference.select(string);
    }


    public void favouriteCategorySelect (String string)
    {
        favouriteCategory.select(string);
    }
    public void enableMyListEnable ()
    {
        enableMyList.click();
    }

    public void enableMyBannerEnable ()
    {
        enableMyBanner.click();
    }

    public void NewAccountBtnClick ()
    {
        newAccountBtn.click();
    }

    public RegistrationPage(WebDriver driver) {
        super(driver);
    }
}
