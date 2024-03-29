package com.carina.demo;

import com.carina.demo.gui.bajalibros_pages.*;
import com.carina.demo.gui.bajalibros_pages.components.CartForm;
import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.utils.IWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.lang.reflect.Field;


import java.awt.*;
import java.time.Duration;
import java.util.ArrayList;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class WebBajaLibrosTest implements IAbstractTest {



   @Test(dataProvider = "Creds")
   public void LoginTest(String semail, String passw) {
      LoginPage loginPage = new LoginPage(getDriver());
      loginPage.open();
      loginPage.typeEmail(semail);
      loginPage.typePass(passw);
      // Wait until the login button is clickable
      WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10)); // Use Duration object
      wait.until(ExpectedConditions.elementToBeClickable(loginPage.getLoginBtn()));

      loginPage.clickLoginBtn();


      // assertTrue(loginPage.isEmailErrorMessage(), "Error message is present");
      // assertTrue(loginPage.isPassErrorMessage(), "Password error message present");

   }

   @Test
   public void LoginTestWrongPass() {
      LoginPage loginPage = new LoginPage(getDriver());
      loginPage.open();
      loginPage.typeEmail("clegrott@hotmail.com");
      loginPage.typePass("jfjsllkjslkdjf");
      loginPage.clickLoginBtn();
      // assertFalse(loginPage.isPassErrorMessage(), "Error message is not present");
      assertFalse(loginPage.isPassErrorMessage(), "Password error message is not present");
   }

   @Test
   public void LoginTestWrongEmail() {
      LoginPage loginPage = new LoginPage(getDriver());
      loginPage.open();
      loginPage.typeEmail("c");
      loginPage.typePass("jfjsllkjslkdjf");
      loginPage.clickLoginBtn();
      // assertFalse(loginPage.isPassErrorMessage(), "Error message is not present");
      assertFalse(loginPage.isEmailErrorMessage(), "Email error message is not present");
   }

   @Test
   public void CreateUserTest() {
      LoginPage loginPage = new LoginPage(getDriver());
      loginPage.open();
      RegistrationPage registrationPage = loginPage.clickCreateBtn();
      registrationPage.typeName("Carla");
   }

   @DataProvider(name = "Creds")
   public Object[][] dataprovider() {
      return new Object[][]{
              {"clegrott@hotmail.com", "*7YiAP4G6YPmi$J"},
              {"TUID", "Data2"},
              {"TUID2", "Data3"}
      };
   }


   @Test
   public void searchTest() throws AWTException, InterruptedException {

        HomePage homePage = new HomePage(getDriver());

      homePage.openURL("https://www.bajalibros.com/AR");
      homePage.waitForJSToLoad(10);

      homePage.searchTextType("el gran engaño");
     homePage.searchBtnClick();
      SearchPage searchPage= new SearchPage(getDriver());
      searchPage.buyBtnClick2();


   }




   @Test
   public void cartTest() throws AWTException, InterruptedException {

//      LoginPage loginPage = new LoginPage(getDriver());
//      loginPage.open();
//      loginPage.typeEmail("clegrott@hotmail.com");
//      System.out.println("********Valor!" + loginPage.getEmailField().getText());
//
//      loginPage.typePass("*7YiAP4G6YPmi$J");
//      Wait<WebDriver> waiter = new FluentWait<>(getDriver()).
//              withTimeout(Duration.ofSeconds(5))
//              .pollingEvery(Duration.ofMillis(500));
//
//      loginPage.clickLoginBtn();

      HomePage homePage = new HomePage(getDriver());

      homePage.openURL("https://www.bajalibros.com/AR");
      homePage.waitForJSToLoad(10);

      try {
         //wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("html.webp body.www div.container-books.home div.container div.wrap.landing div.carousel-standard div#basic347.frame ul.clearfix li a")));
         homePage.book1Click();// Now, the element is present, you can proceed with your actions
      } catch (NoSuchElementException e) {
         // Handle the exception here, for example, logging an error message
         System.out.println("Element is not present: " + e.getMessage());
      }


      BookPage bookPage = new BookPage(getDriver());

      bookPage.waitForJSToLoad(10);
      bookPage.buyBtnClick();
 //     bookPage.buyBtnClick2();
      bookPage.cartBtnAutoOpen();
         //homePage.cartBtnClick();
         CartForm cartForm =bookPage.getCartForm();

      cartForm.isUIObjectPresent();
      AbstractUIElementLister abstractUIElementLister= new AbstractUIElementLister();
      abstractUIElementLister.list(bookPage);
     // cartForm.assertUIObjectPresent();


      System.out.println(bookPage.allElementsPresent());
//      bookPage.assertElementWithTextPresent(cartForm.getConfirmBuyFooterBtn(),"Finalizar");
//      bookPage.assertElementWithTextPresent(cartForm.getEliminateBookBtn(),"Mi Carrito");
//
//      cartForm.eliminateBookBtnClick();
         cartForm.confirmBuyFooterBtnClick();

   }
   @Test
   public void buyTest() throws AWTException, InterruptedException {

      HomePage homePage = new HomePage(getDriver());
      homePage.openURL("https://www.bajalibros.com/AR/Ugly-Love-Pideme-cualquier-cos-Colleen-Hoover-eBook-2313648");
      BookPage bookPage = new BookPage(getDriver());


      bookPage.waitForJSToLoad(10);
      bookPage.buyBtnClick();


//   homePage.cartBtnClick();

//    //  cartForm.eliminateBookBtnClick();

      // cartForm.waitUntil(ExpectedConditions.visibilityOf((WebElement) cartForm), 1000) ;
      // bookPage.cartBtnClick();
      CartForm cartForm = homePage.getCartForm();
      cartForm.eliminateBookBtnClick();
      cartForm.confirmBuyFooterBtnClick();

      //homePage.searchTextType("hola");


   }
}
