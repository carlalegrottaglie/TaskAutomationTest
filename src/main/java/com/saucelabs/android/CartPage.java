package com.saucelabs.android;

import com.saucelabs.common.CartPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import static com.zebrunner.carina.utils.factory.DeviceType.Type.ANDROID_PHONE;


@DeviceType(pageType = ANDROID_PHONE, parentClass = CartPageBase.class)
public class CartPage extends CartPageBase implements IMobileUtils {

    @FindBy(xpath = "//android.widget.TextView[@text='CHECKOUT']")
    private ExtendedWebElement checkoutBtn;

    @FindBy(className = "android.widget.ScrollView")
    private ExtendedWebElement container;

    public CartPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void checkoutBtnClick() {
        checkoutBtn.click();
    }

    @Override
    public void swipeToCheckoutBtn() {
        while (!checkoutBtn.isVisible()) {
            swipe(checkoutBtn, container, 1);
        }
    }
}
