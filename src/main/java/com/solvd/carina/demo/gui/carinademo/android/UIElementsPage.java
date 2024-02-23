package com.solvd.carina.demo.gui.carinademo.android;


import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class UIElementsPage extends AbstractPage {

    @FindBy(id = "editText")
    private ExtendedWebElement name;
    @FindBy(id = "editText2")
    private ExtendedWebElement email;
    @FindBy(id = "editText3")
    private ExtendedWebElement date;
    @FindBy(id = "checkBox2")
    private ExtendedWebElement copyCheckbox;
    @FindBy(id = "radioButton")
    private ExtendedWebElement radioButtonMale;
    @FindBy(id = "radioButton3")
    private ExtendedWebElement radioButtonFemale;
    @FindBy(id = "radioButton5")
    private ExtendedWebElement radioButtonOther;
    //hacer una lista de elementos de entrada oara varios valores

    @FindBy(id = "progressBar")
    private ExtendedWebElement progressBar;

    @FindBy(id = "progressBar2")
    private ExtendedWebElement progressBar2;

    @FindBy(id = "seekBar")
    private ExtendedWebElement seekBar;

    @FindBy(id = " switch1")
    private ExtendedWebElement enabled;

    private Frame contenedor;

    protected UIElementsPage(WebDriver driver) {
        super(driver);
        contenedor = new Frame(getDriver());

    }

    public Frame getContenedor()
    { return contenedor;}
}
