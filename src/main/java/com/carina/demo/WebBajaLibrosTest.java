package com.carina.demo;

import com.carina.demo.gui.bajalibros_pages.HomePage;
import com.carina.demo.gui.bajalibros_pages.LoginPage;
import com.carina.demo.gui.bajalibros_pages.RegistrationPage;
import com.carina.demo.gui.bajalibros_pages.components.CartForm;
import com.zebrunner.carina.core.IAbstractTest;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class WebBajaLibrosTest implements IAbstractTest {

   @Test(dataProvider = "Creds")

    public void LoginTest(String semail, String passw){
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
   public void LoginTestWrongPass(){
      LoginPage loginPage = new LoginPage(getDriver());
      loginPage.open();
      loginPage.typeEmail("clegrott@hotmail.com");
      loginPage.typePass("jfjsllkjslkdjf");
      loginPage.clickLoginBtn();
      // assertFalse(loginPage.isPassErrorMessage(), "Error message is not present");
      assertFalse(loginPage.isPassErrorMessage(), "Password error message is not present");
   }
   @Test
   public void LoginTestWrongEmail(){
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
      RegistrationPage registrationPage= loginPage.clickCreateBtn();
      registrationPage.typeName("Carla");
   }
   @DataProvider(name = "Creds")
   public Object[][] dataprovider() {
      return new Object[][]{
              {"clegrott@hotmail.com","*7YiAP4G6YPmi$J"},
              {"TUID", "Data2"},
              {"TUID2", "Data3"}
      };
   }

   @Test
   public void cartTest()
   {
      HomePage homePage = null;
      homePage.getDriver().get("https://www.bajalibros.com/AR");
      CartForm cartForm = null;
      cartForm = homePage.getCartForm();
      cartForm.confirmBuyFooterBtnClick();

   }
}
