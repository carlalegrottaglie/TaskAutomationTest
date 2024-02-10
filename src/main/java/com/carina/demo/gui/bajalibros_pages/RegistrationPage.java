package com.carina.demo.gui.bajalibros_pages;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends AbstractPage {

    @FindBy(xpath ="//*[@id= 'name']")
    private ExtendedWebElement eName;

    @FindBy(xpath ="//*[@id='apellido']")
    private ExtendedWebElement eSurname;

    @FindBy(xpath ="//*[@id='email']")
    private ExtendedWebElement eEmail;

    @FindBy(xpath ="//*[@id='password'']")
    private ExtendedWebElement ePass;
//
//    @FindBy(xpath ="//*[@id='FrontuserNacDiaDay')]
//    private ExtendedWebElement eFrontuserNacDiaDay;
//
//    @FindBy(xpath ="//*[@id='FrontuserNacMesMonth']")
//    private ExtendedWebElement eFrontuserNacMesMonth;
//
//    @FindBy(xpath =//*[@id="FrontuserNacAnoYear"]
//    private ExtendedWebElement eFrontuserNacAnoYear;
//
//    @FindBy(xpath =//*[@id="FrontuserUsuariowebPais"]
//    private ExtendedWebElement eEmail;
//
//    @FindBy(xpath =//*[@id="FrontuserUsuariowebSexo"]
//    private ExtendedWebElement eEmail;
//
//    @FindBy(xpath =//*[@id="ex1"]/p[1]/text()
//    //ya está registrado
//    private ExtendedWebElement eEmail;
//
//    @FindBy(className = "button-register-login")
//    private ExtendedWebElement registerBt;

    protected RegistrationPage(WebDriver driver) {
        super(driver);
    }

    public void typeName(String name) {
        eName.type(name);
    }


}
