package com.saucelabs.android;

import com.saucelabs.common.HomePageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import static com.zebrunner.carina.utils.factory.DeviceType.Type.ANDROID_PHONE;

@DeviceType(pageType = ANDROID_PHONE, parentClass = HomePageBase.class)
public class HomePage extends HomePageBase implements IMobileUtils {

    @FindBy(className = "android.widget.ScrollView")
    private ExtendedWebElement container;
    @FindBy(xpath = "//android.view.ViewGroup[@content-desc='test-Modal Selector Button']/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView")
    private ExtendedWebElement sortBtn;

    @FindBy(xpath = "//android.widget.TextView[@text='Price (low to high)']")
    private ExtendedWebElement priceLowToHighBtn;

    @FindBy(xpath = "(//android.widget.TextView[@text='ADD TO CART'])[1]")
    private ExtendedWebElement addBlackTS;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc='test-Item'])[3]/android.view.ViewGroup/android.widget.ImageView")
    private ExtendedWebElement selectBlackPicTS;

    @FindBy(xpath = "//android.widget.TextView[@content-desc='test-Item title' and @text='Sauce Labs Bolt T-Shirt']")
    private ExtendedWebElement selectBlackLabelTS;

    @Override
    public void swipeToAddBlackTS() {
        while (!addBlackTS.isVisible()) {
            swipe(addBlackTS, container, 1);
        }

    }

    @Override
    public void swipeToAddBlackPLabelTS() {
        while (!selectBlackLabelTS.isVisible()) {
            swipe(selectBlackLabelTS, container, 1);
        }

    }

    @Override
    public void sortBtn() {
        sortBtn.click();
    }

    @Override
    public void priceLowToHighBtnClick() {
        priceLowToHighBtn.click();
    }

    @Override
    public void addBlackTSClick() {
        addBlackTS.clickIfPresent();
    }

    @Override
    public void selectBlackPicTSClick() {
       selectBlackPicTS.click();
    }

    @Override
    public void selectBlackLabelTSClick() {
        selectBlackLabelTS.click();
    }



    public HomePage(WebDriver driver) {
        super(driver);
    }
}
