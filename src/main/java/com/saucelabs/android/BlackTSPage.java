package com.saucelabs.android;

import com.saucelabs.common.BlackTSPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import static com.zebrunner.carina.utils.factory.DeviceType.Type.ANDROID_PHONE;

@DeviceType(pageType = ANDROID_PHONE, parentClass = BlackTSPageBase.class)
public class BlackTSPage extends BlackTSPageBase implements IMobileUtils {
    @FindBy(xpath = "//android.widget.TextView[@text='ADD TO CART']")
    private ExtendedWebElement addToCartBlackTS;

    @FindBy(className = "android.widget.ScrollView")
    private ExtendedWebElement container;

    public BlackTSPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void addToCartBlackTSClick() {
        addToCartBlackTS.click();
    }

    @Override
    public void swipeToAddToCartBlackTS() {
        while (!addToCartBlackTS.isVisible()) {
            swipe(addToCartBlackTS, container, 1);
        }
    }
}
