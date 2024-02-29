package com.saucelabs.android;

import com.saucelabs.common.BlackTSPageBase;
import com.saucelabs.common.CartInfoPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import static com.zebrunner.carina.utils.factory.DeviceType.Type.ANDROID_PHONE;

@DeviceType(pageType = ANDROID_PHONE, parentClass = CartInfoPageBase.class)
public class CartInfoPage extends CartInfoPageBase implements IMobileUtils {

    @FindBy(xpath = "//android.widget.EditText[@content-desc='test-First Name']")
    private ExtendedWebElement name;

    @FindBy(xpath = "//android.widget.EditText[@content-desc='test-Last Name']")
    private ExtendedWebElement lastname;

    @FindBy(xpath = "//android.widget.EditText[@content-desc='test-Zip/Postal Code']")
    private ExtendedWebElement zipcode;

    @FindBy(xpath ="//android.widget.TextView[@text='CONTINUE']")
    private ExtendedWebElement continueBtn;

    @Override
    public void typeName(String text) {
        name.type(text);
    }

    @Override
    public void typeLastName(String text) {
        lastname.type(text);
    }

    @Override
    public void typezipCode(String text) {
        zipcode.type(text);
       if (isKeyboardShown()) hideKeyboard();
    }

    @Override
    public void continueBtnClick() {
        continueBtn.click();
    }

    public CartInfoPage(WebDriver driver) {
        super(driver);
    }
}
