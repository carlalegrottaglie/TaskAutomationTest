package com.carina.demo;

import com.solvd.carina.demo.gui.carinademo.common.UIElementsBasePage;
import com.solvd.carina.demo.gui.carinademo.common.FrameBasePage;
import com.solvd.carina.demo.gui.carinademo.common.HomePageBase;
import com.solvd.carina.demo.gui.carinademo.common.LoginPageBase;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.zebrunner.carina.core.IAbstractTest;



import com.zebrunner.carina.utils.mobile.IMobileUtils;

import java.time.Duration;

public class MobileSampleTest implements IAbstractTest, IMobileUtils {

//    @Test()
//    @MethodOwner(owner = "qpsdemo")
//    @TestLabel(name = "feature", value = {"mobile", "regression"})
//    public void testLoginUser() {
//        String username = "Test user";
//        String password = RandomStringUtils.randomAlphabetic(10);
//        WelcomePageBase welcomePage = initPage(getDriver(), WelcomePageBase.class);
//        Assert.assertTrue(welcomePage.isPageOpened(), "Welcome page isn't opened");
//        LoginPageBase loginPage = welcomePage.clickNextBtn();
//        Assert.assertFalse(loginPage.isLoginBtnActive(), "Login button is active when it should be disabled");
//        loginPage.typeName(username);
//        loginPage.typePassword(password);
//        loginPage.selectMaleSex();
//        loginPage.checkPrivacyPolicyCheckbox();
//        CarinaDescriptionPageBase carinaDescriptionPage = loginPage.clickLoginBtn();
//        Assert.assertTrue(carinaDescriptionPage.isPageOpened(), "Carina description page isn't opened");
//    }


//	@Test()
//    @MethodOwner(owner = "qpsdemo")
//    @TestLabel(name = "feature", value = {"mobile", "regression"})
//    public void testWebView() {
//        WelcomePageBase welcomePage = initPage(getDriver(), WelcomePageBase.class);
//        LoginPageBase loginPage = welcomePage.clickNextBtn();
//        loginPage.login();
//        WebViewPageBase webViewPageBase = initPage(getDriver(), WebViewPageBase.class);
//        MobileContextUtils contextHelper = new MobileContextUtils();
//
//        contextHelper.switchMobileContext(View.WEB_CARINA);
//        ContactUsPageBase contactUsPage = webViewPageBase.goToContactUsPage();
//
//        contextHelper.switchMobileContext(View.WEB_BROWSER, View.WEB_CARINA);
//
//        contactUsPage.typeName("John Doe");
//        contactUsPage.typeEmail("some@email.com");
//        contactUsPage.typeQuestion("This is a message");
//        contactUsPage.submit();
//        Assert.assertTrue(contactUsPage.isSuccessMessagePresent());
//    }
//
//    @Test()
//    @MethodOwner(owner = "qpsdemo")
//    @TestLabel(name = "feature", value = {"mobile", "acceptance"})
//    public void testUIElements() {
//        WelcomePageBase welcomePage = initPage(getDriver(), WelcomePageBase.class);
//        LoginPageBase loginPage = welcomePage.clickNextBtn();
//        CarinaDescriptionPageBase carinaDescriptionPage = loginPage.login();
//        UIElementsPageBase uiElements = carinaDescriptionPage.navigateToUIElementsPage();
//        final String text = "some text";
//        final String date = "22/10/2018";
//        final String email = "some@email.com";
//        uiElements.typeText(text);
//        Assert.assertEquals(uiElements.getText(), text, "Text was not typed");
//        uiElements.typeDate(date);
//        Assert.assertEquals(uiElements.getDate(), date, "Date was not typed");
//        uiElements.typeEmail(email);
//        Assert.assertEquals(uiElements.getEmail(), email, "Email was not typed");
//        uiElements.swipeToFemaleRadioButton();
//        uiElements.checkCopy();
//        Assert.assertTrue(uiElements.isCopyChecked(), "Copy checkbox was not checked");
//        uiElements.clickOnFemaleRadioButton();
//        Assert.assertTrue(uiElements.isFemaleRadioButtonSelected(), "Female radio button was not selected!");
//        uiElements.clickOnOtherRadioButton();
//        Assert.assertTrue(uiElements.isOthersRadioButtonSelected(), "Others radio button was not selected!");
//    }


    @Test
    public void loginTest()
    {

        HomePageBase homePage = initPage(HomePageBase.class);
        LoginPageBase loginPage = homePage.clickNextBtn();

        String username = "Carla";
        String password = RandomStringUtils.randomAlphabetic(10);
        loginPage.typeName(username);
        loginPage.typePassword(password);
        loginPage.selectFemaleSex();
        loginPage.checkPrivacyPolicyCheckbox();
        loginPage.login();
    }

    @Test
    public void UIElementsTest()
    {
        HomePageBase homePage = initPage(getDriver(),HomePageBase.class);
        LoginPageBase loginPage = homePage.clickNextBtn();

        String username = "Carla";
        String password = RandomStringUtils.randomAlphabetic(10);
        loginPage.typeName(username);
        loginPage.typePassword(password);
        loginPage.selectFemaleSex();
        loginPage.checkPrivacyPolicyCheckbox();
        loginPage.onlyClickLoginBtn();
        FrameBasePage frame = initPage(FrameBasePage.class);
        frame.navigateToUIElementsPage();
        UIElementsBasePage uiElementsPage = initPage(UIElementsBasePage.class);
        uiElementsPage.typeText("Darth Vader");
        uiElementsPage.typeEmail("GOT@darkside.org");
        uiElementsPage.typeDate("06/06/41");
        uiElementsPage.checkCopy();
        uiElementsPage.swipeToFemaleRadioButton();
        uiElementsPage.clickOnFemaleRadioButton();
        uiElementsPage.swipeToEnabled();
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        WebElement progressBar = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("switch1")));

        //uiElementsPage.setProgressBar(3);
        //uiElementsPage.setProgressBar2(5);
       // uiElementsPage.setSeekBar(6);
        uiElementsPage.setEnabled();
    }
}
