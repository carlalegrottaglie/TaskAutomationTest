package com.saucelabs.android;

import com.saucelabs.common.LoginPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import static com.zebrunner.carina.utils.factory.DeviceType.Type.ANDROID_PHONE;

@DeviceType(pageType = ANDROID_PHONE, parentClass = LoginPageBase.class)
public class LoginPage extends LoginPageBase implements IMobileUtils {
    @FindBy(xpath = "//android.widget.EditText[@content-desc='test-Username']")
    private ExtendedWebElement username;

    @FindBy(xpath = "//android.widget.EditText[@content-desc='test-Password']")
    private ExtendedWebElement password;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc='test-LOGIN']")
    private ExtendedWebElement loginBtn;

    @FindBy(xpath = "//android.widget.TextView[@text='Username and password do not match any user in this service.']")
    private ExtendedWebElement wrongMsg;
    @Override
    public void typeUsername(String text) {
        username.type(text);
    }

    @Override
    public void typePassword(String text) {
    password.type(text);
    }

    @Override
    public void clickLoginBtn() {
        loginBtn.click();
    }

    @Override
    public boolean isWrongMsgPresent() {
       return isElementWithTextPresent(wrongMsg,"Username and password do not match any user in this service");
    }

    public LoginPage(WebDriver driver) {
        super(driver);
    }


}
