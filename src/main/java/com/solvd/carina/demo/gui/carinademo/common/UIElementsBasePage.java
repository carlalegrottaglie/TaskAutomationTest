package com.solvd.carina.demo.gui.carinademo.common;


import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public abstract class UIElementsBasePage extends AbstractPage {


    protected UIElementsBasePage(WebDriver driver) {
        super(driver);
    }

    public abstract void typeText(String text);

    public abstract void typeEmail(String email);

    public abstract String getEmail();

    public abstract String getText();

    public abstract String getDate();

    public abstract void typeDate(String date);

    public abstract void clickOnMaleRadioButton();

    public abstract void clickOnFemaleRadioButton();

    public abstract boolean isFemaleRadioButtonSelected();

    public abstract void clickOnOtherRadioButton();

    public abstract boolean isOthersRadioButtonSelected();

    public abstract void checkCopy();

    public abstract boolean isCopyChecked();

    public abstract void swipeToFemaleRadioButton();

    public abstract  void  setProgressBar (int i);

    public  abstract void  setProgressBar2 (int i);
    public abstract  void  setSeekBar (int i);

    public  abstract void  setEnabled ();

    public abstract void swipeToEnabled();
}
