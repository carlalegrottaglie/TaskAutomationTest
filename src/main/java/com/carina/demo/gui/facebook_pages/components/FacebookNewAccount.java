package com.carina.demo.gui.facebook_pages.components;

import com.carina.demo.gui.bajalibros_pages.CustomSearchContext;
import com.carina.demo.gui.bajalibros_pages.components.CartForm;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class FacebookNewAccount extends AbstractUIObject {

    @FindBy(xpath = "//*[@name = 'firstname']")
    private ExtendedWebElement  firstNameInputField;

    @FindBy(xpath ="//*[@name = 'lastname']")
    private ExtendedWebElement lastNameInputField;

    @FindBy(xpath ="//*[@name = 'reg_email__']")
    private ExtendedWebElement emailInputField;

    @FindBy(xpath ="//*[@id = 'password_step_input']")
    private ExtendedWebElement passwordInputField;

    @FindBy(xpath ="//*[@name = 'birthday_day']")
    private ExtendedWebElement dayDropdown;

    @FindBy(xpath ="//*[@name = 'birthday_month']")
    private ExtendedWebElement monthDropdown;

    @FindBy(xpath ="//*[@name = 'birthday_year']")
    private ExtendedWebElement yearDropdown;

    @FindBy(xpath ="//*[@name = 'sex' and @value= '1']")
    private ExtendedWebElement femaleRadioButton;

    @FindBy(xpath ="//*[@name = 'sex' and @value= '2']")
    private ExtendedWebElement maleRadioButton;

    @FindBy(xpath ="//*[@name = 'sex' and @value = '3']")
    private ExtendedWebElement customGenderRadioButton;
    @FindBy(xpath ="//*[@name = 'websubmit']")
    private ExtendedWebElement signUpButton;

    public ExtendedWebElement getDayDropdown() {
        return dayDropdown;
    }

    public void setDayDropdown(ExtendedWebElement dayDropdown) {
        this.dayDropdown = dayDropdown;
    }

    public void typeName(String name) {
        firstNameInputField.isElementPresent();
        firstNameInputField.type(name);

    }


    public void typeLastName(String lastName) {
        lastNameInputField.isElementPresent();
        lastNameInputField.type(lastName);
    }

    public void typeEmail(String email) {
        emailInputField.isElementPresent();
        emailInputField.type(email);
    }

    public void typePassword(String password) {
        passwordInputField.isElementPresent();
        passwordInputField.type(password);
    }

    public void selectBirthMonth(String month) {
        monthDropdown.isElementPresent();
        monthDropdown.select(String.valueOf(month));
    }

    public void selectBirthDay(String day) {
        dayDropdown.isElementPresent();
        dayDropdown.select(String.valueOf(day));
    }

    public void selectBirthYear(String year) {
        yearDropdown.isElementPresent();
        yearDropdown.select(String.valueOf(year));
    }

    public void selectMaleGender() {
        maleRadioButton.isElementPresent();
        maleRadioButton.click();
    }

    public void selectFemaleGender() {
        femaleRadioButton.isElementPresent();
        femaleRadioButton.click();
    }

    public void selectCustomGender() {
        customGenderRadioButton.isElementPresent();
        customGenderRadioButton.click();
    }

    public void clickSignUpButton() {
        signUpButton.isElementPresent();
        signUpButton.click();
    }

    public FacebookNewAccount(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);



        }
    }



