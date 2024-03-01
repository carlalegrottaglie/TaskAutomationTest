package com.carina.demo;

import com.webtest.*;
import com.zebrunner.carina.core.IAbstractTest;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class WebTest implements IAbstractTest {

   WebDriver driver = getDriver();
    @Test
    public void wrongLoginTest()
    {
        HomePage homePage= new HomePage(getDriver());
        homePage.openURL("https://petstore.octoperf.com/actions/Catalog.action");
        homePage.waitForJSToLoad(10);
        homePage.singInBtnClick();
        LoginPage loginPage= new LoginPage(driver);
        loginPage.typeUsername("Carlos");
        loginPage.typePassword("4587");
        loginPage.loginBtnClick();
        Assert.assertTrue(loginPage.isWrongMsgPresent(), "The message did´t appeared");

    }

    @Test
    public void rightLoginTest()
    {
        HomePage homePage= new HomePage(driver);

        homePage.openURL("https://petstore.octoperf.com/actions/Catalog.action");
        homePage.waitForJSToLoad(10);
        homePage.singInBtnClick();
        LoginPage loginPage= new LoginPage(driver);
        loginPage.typeUsername("Carla");
        loginPage.typePassword("1234");
        loginPage.loginBtnClick();
        Assert.assertEquals("https://petstore.octoperf.com/actions/Catalog.action",
                driver.getCurrentUrl(), "Login is fail");
        Assert.assertTrue(loginPage.isWelcomeMsgPresent(), "The message did´t appeared");

    }
    @Test
    public void registrationDuplicate()
    {
        HomePage homePage= new HomePage(driver);

        homePage.openURL("https://petstore.octoperf.com/actions/Catalog.action");
        homePage.waitForJSToLoad(10);
        homePage.singInBtnClick();
        LoginPage loginPage= new LoginPage(driver);
        loginPage.regiterBtnClick();
        RegistrationPage registrationPage = new RegistrationPage(driver);
        registrationPage.userIDType ("Carla");
        registrationPage.newPasswordType ("1234");
        registrationPage.repeatPasswordType ("1234");
        registrationPage.firstNameType ("Carla");
        registrationPage.lastNameType ("Legrottaglie");
        registrationPage.emailType ("c@g.c");
        registrationPage.phoneType ("12534522");
        registrationPage.address1Type ("Street 1 nro 123");
        registrationPage.address2Type ("Street 2 nri 256");
        registrationPage.cityType ("Caba");
        registrationPage.stateType ("caba");
        registrationPage.zipType ("14140");
        registrationPage.countryType ("Argentina");
        registrationPage.languagePreferenceSelect ("english");
        registrationPage.favouriteCategorySelect ("CATS");
        registrationPage.enableMyListEnable ();
        registrationPage.enableMyBannerEnable ();
        registrationPage.NewAccountBtnClick();
        Assert.assertEquals("https://petstore.octoperf.com/actions/Catalog.action",
                driver.getCurrentUrl(), "Registration failed, current url is " + driver.getCurrentUrl() +
                "and is not https://petstore.octoperf.com/actions/Catalog.action");
    }

    @Test
    public void registrationOk()
    {
        HomePage homePage= new HomePage(driver);

        homePage.openURL("https://petstore.octoperf.com/actions/Catalog.action");
        homePage.waitForJSToLoad(10);
        homePage.singInBtnClick();
        LoginPage loginPage= new LoginPage(driver);
        loginPage.regiterBtnClick();
        RegistrationPage registrationPage = new RegistrationPage(driver);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd_HHmmss");
        String currentDate = dateFormat.format(new Date());
        registrationPage.userIDType ("Carla" + currentDate);
        registrationPage.newPasswordType ("1234");
        registrationPage.repeatPasswordType ("1234");
        registrationPage.firstNameType ("Carla");
        registrationPage.lastNameType ("Legrottaglie");
        registrationPage.emailType ("c@g.c");
        registrationPage.phoneType ("12534522");
        registrationPage.address1Type ("Street 1 nro 123");
        registrationPage.address2Type ("Street 2 nri 256");
        registrationPage.cityType ("Caba");
        registrationPage.stateType ("caba");
        registrationPage.zipType ("1414");
        registrationPage.countryType ("Argentina");
        registrationPage.languagePreferenceSelect ("english");
        registrationPage.favouriteCategorySelect ("CATS");
        registrationPage.enableMyListEnable ();
        registrationPage.enableMyBannerEnable ();
        registrationPage.NewAccountBtnClick();
        registrationPage.pause(30);
        Assert.assertEquals("https://petstore.octoperf.com/actions/Catalog.action",
                driver.getCurrentUrl(), "Registration failed");
    }

    @Test
    public void buyTest()
    {
        HomePage homePage= new HomePage(getDriver());

        homePage.openURL("https://petstore.octoperf.com/actions/Catalog.action");
        homePage.waitForJSToLoad(10);
        homePage.singInBtnClick();
        LoginPage loginPage= new LoginPage(driver);
        loginPage.typeUsername("Carla");
        loginPage.typePassword("1234");
        loginPage.loginBtnClick();

        WelcomePage welcomePage = new WelcomePage(driver);
       // welcomePage.openURL("https://petstore.octoperf.com/actions/Catalog.action");
        welcomePage.waitForJSToLoad(10);
       // welcomePage.catPicClick();
        //WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(30));
        //WebElement button = wait2.until(ExpectedConditions.elementToBeClickable(By.cssSelector("area:nth-child(5)")));

       // button.click();
      //  driver.findElements(By.cssSelector("area:nth-child(5)")).size();
        welcomePage.catTextClick();
        CatsPage catsPage = new CatsPage(driver);
        catsPage.persianCatClick();
        PersianCatPage persianCatPage = new PersianCatPage(driver);
        persianCatPage.persianFemaleAddClick();
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        shoppingCartPage.quantityType("3");
        shoppingCartPage.updateCartBtnClick();
        shoppingCartPage.checkoutBtnClick();
        PaymentDetailsPage paymentDetailsPage = new PaymentDetailsPage(driver);
        paymentDetailsPage.continueBtnClick();
        PaymentConfirmPage paymentConfirmPage = new PaymentConfirmPage(driver);
        paymentConfirmPage.confirmBtnClick();
        Assert.assertTrue(paymentConfirmPage.isConfirmationMsgPresent(),
                "The process is confirmed");

    }
}
