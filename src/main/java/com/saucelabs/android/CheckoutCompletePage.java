package com.saucelabs.android;

import com.saucelabs.common.CheckoutCompletePageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import static com.zebrunner.carina.utils.factory.DeviceType.Type.ANDROID_PHONE;

@DeviceType(pageType = ANDROID_PHONE, parentClass = CheckoutCompletePageBase.class)
public class CheckoutCompletePage extends CheckoutCompletePageBase implements IMobileUtils {

    @FindBy(xpath = "//android.widget.TextView[@text='Your order has been dispatched, and will arrive just as fast as the pony can get there!']")
    private ExtendedWebElement orderDispachedMsg;

    @Override
    public boolean isorderDispachedMsgPresent() {
          return isElementWithTextPresent(orderDispachedMsg,"Your order has been dispatched, and will arrive just as fast as the pony can get there");

    }

    public CheckoutCompletePage(WebDriver driver) {
        super(driver);
    }
}
