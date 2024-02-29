package com.saucelabs.android;

import com.saucelabs.common.AbstractLabelBasePage;
import com.saucelabs.common.BlackTSPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import static com.zebrunner.carina.utils.factory.DeviceType.Type.ANDROID_PHONE;

@DeviceType(pageType = ANDROID_PHONE, parentClass = AbstractLabelBasePage.class)
public class AbstractLabelPage extends AbstractLabelBasePage implements IMobileUtils {

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc='test-Cart']/android.view.ViewGroup/android.widget.ImageView")
    private ExtendedWebElement cartBtn;
    public AbstractLabelPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void cartBtnClick() {
        cartBtn.click();
    }

}
