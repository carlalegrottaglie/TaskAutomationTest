package com.saucelabs.android;

import com.saucelabs.common.CartOverviewPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import static com.zebrunner.carina.utils.factory.DeviceType.Type.ANDROID_PHONE;

@DeviceType(pageType = ANDROID_PHONE, parentClass = CartOverviewPageBase.class)
public class CartOverviewPage extends CartOverviewPageBase implements IMobileUtils {

   @FindBy (xpath = "//android.view.ViewGroup[@content-desc='test-FINISH']")
   private ExtendedWebElement finishBtn;

    @FindBy(className = "android.widget.ScrollView")
    private ExtendedWebElement container;

    @Override
    public void finishBtnClick() {
        finishBtn.click();
    }

    public void swipeToFinishBtn() {
        while (!finishBtn.isVisible())
        swipe(finishBtn, container, 1);
    }
    public CartOverviewPage(WebDriver driver) {
        super(driver);
    }

}
