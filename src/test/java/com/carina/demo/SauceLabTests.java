package com.carina.demo;

import com.saucelabs.android.CartInfoPage;
import com.saucelabs.android.CartOverviewPage;
import com.saucelabs.android.CartPage;
import com.saucelabs.common.*;
import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import org.testng.annotations.Test;

public class SauceLabTests implements IAbstractTest, IMobileUtils {

    @Test
    public void wrongLoginTest()
    {
        LoginPageBase loginPageBase = initPage(getDriver(), LoginPageBase.class);
        loginPageBase.typeUsername("Carla");
        loginPageBase.typePassword("ffsfsgadsd");
        loginPageBase.clickLoginBtn();
        loginPageBase.isWrongMsgPresent();
    }
    @Test
    public void rightLoginTest()
    {
        LoginPageBase loginPageBase = initPage(getDriver(), LoginPageBase.class);
        loginPageBase.typeUsername("standard_user");
        loginPageBase.typePassword("secret_sauce");
        loginPageBase.clickLoginBtn();
        loginPageBase.isWrongMsgPresent();
        HomePageBase homePageBase = initPage(getDriver(), HomePageBase.class);
    }

    @Test
    public void buySthTest()
    {
        LoginPageBase loginPageBase = initPage(getDriver(), LoginPageBase.class);
        loginPageBase.typeUsername("standard_user");
        loginPageBase.typePassword("secret_sauce");
        loginPageBase.clickLoginBtn();
        loginPageBase.isWrongMsgPresent();
        HomePageBase homePageBase = initPage(getDriver(), HomePageBase.class);
        AbstractLabelBasePage abstractLabelBasePage = initPage(getDriver(), AbstractLabelBasePage.class);
        homePageBase.swipeToAddBlackTS();
        homePageBase.addBlackTSClick();
        homePageBase.sortBtn();
        homePageBase.priceLowToHighBtnClick();homePageBase.swipeToAddBlackPLabelTS();
        homePageBase.selectBlackLabelTSClick();
        BlackTSPageBase blackTSPageBase = initPage(getDriver(), BlackTSPageBase.class);
        blackTSPageBase.swipeToAddToCartBlackTS();
        blackTSPageBase.addToCartBlackTSClick();
        abstractLabelBasePage.cartBtnClick();
        CartPageBase cartPageBase = initPage(getDriver(), CartPageBase.class);
        cartPageBase.swipeToCheckoutBtn();
        cartPageBase.checkoutBtnClick();
        CartInfoPageBase cartInfoPage = initPage(getDriver(), CartInfoPageBase.class);
        cartInfoPage.typeName("Carla");
        cartInfoPage.typeLastName("Legrottaglie");
        cartInfoPage.typezipCode("1414");
        cartInfoPage.continueBtnClick();
        CartOverviewPageBase cartOverviewPage = initPage(getDriver(), CartOverviewPageBase.class);
        cartOverviewPage.swipeToFinishBtn();
        cartOverviewPage.finishBtnClick();
        CheckoutCompletePageBase checkoutCompletePageBase = initPage(getDriver(), CheckoutCompletePageBase.class);
        checkoutCompletePageBase.isorderDispachedMsgPresent();

    }

}
