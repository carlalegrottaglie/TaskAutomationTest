package com.solvd.carina.demo.gui.carinademo.android;


import com.solvd.carina.demo.gui.carinademo.common.UIElementsBasePage;
import com.solvd.carina.demo.gui.carinademo.common.LoginPageBase;
import com.solvd.carina.demo.gui.carinademo.common.UIElementsBasePage;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.apache.xmlbeans.GDuration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.lang.reflect.Constructor;
import java.time.Duration;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = UIElementsBasePage.class)
public class UIElementsPage extends UIElementsBasePage implements IMobileUtils {

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

    @FindBy(id = "progressBar")
    private ExtendedWebElement progressBar;

    @FindBy(id = "progressBar2")
    private ExtendedWebElement progressBar2;

    @FindBy(id = "seekBar")
    private ExtendedWebElement seekBar;

    @FindBy(id = " switch1")
    private ExtendedWebElement enabled;

    @FindBy(className = "android.widget.ScrollView")
    private ExtendedWebElement container;

    public UIElementsPage(WebDriver driver) {
        super(driver);
    }


    @Override
    public void typeText(String text) {
        name.type(text);
    }

    @Override
    public void typeEmail(String email) {
        this.email.type(email);
    }

    @Override
    public String getEmail(){
        return email.getText();
    }

    @Override
    public String getText(){
        return name.getText();
    }

    @Override
    public String getDate(){
        return date.getText();
    }

    @Override
    public void typeDate(String date) {
        this.date.type(date);
    }

    @Override
    public void clickOnMaleRadioButton() {
        radioButtonMale.click();
    }

    @Override
    public void clickOnFemaleRadioButton() {
        radioButtonFemale.click();
    }

    @Override
    public void clickOnOtherRadioButton() {
        radioButtonFemale.click();
    }

    @Override
    public boolean isFemaleRadioButtonSelected(){
        return radioButtonFemale.isChecked();
    }

    @Override
    public boolean isOthersRadioButtonSelected(){
        return radioButtonFemale.isChecked();
    }

    @Override
    public void checkCopy() {
        copyCheckbox.click();
    }

    @Override
    public boolean isCopyChecked(){
        return copyCheckbox.isChecked();
    }

    public void swipeToFemaleRadioButton() {
        swipe(radioButtonFemale, container, 10);
    }
    @Override
    public void  setProgressBar (int i)
    {
        progressBar.isVisible();

    }
    @Override
    public void  setProgressBar2 (int i)
    {
        progressBar2.isVisible();
        progressBar2.select(i);
    }
    @Override
    public void  setSeekBar (int i)
    {
        seekBar.isVisible();
        seekBar.select(i);
    }
    @Override
    public void  setEnabled ()
    {
        enabled.scrollTo();

    }
    public void swipeToEnabled() {
        swipe(enabled, container, 5);
    }

}
