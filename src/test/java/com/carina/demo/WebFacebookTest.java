package com.carina.demo;

import com.carina.demo.gui.facebook_pages.FacebookPage;
import com.carina.demo.gui.facebook_pages.components.FacebookNewAccount;
import com.zebrunner.carina.core.IAbstractTest;
import org.testng.annotations.Test;


public class WebFacebookTest implements IAbstractTest {


        @Test
        public void createNewAccount()
        {
            FacebookPage facebookPage= new FacebookPage(getDriver());
            facebookPage.open();
            FacebookNewAccount facebookNewAccount = facebookPage.getFacebookNewAccount();
            facebookPage.clickCreateNewAccount();
            facebookNewAccount.typeName("Carla");
            facebookNewAccount.typeLastName("Legrottaglie") ;
            facebookNewAccount.typeEmail("clegrott@hotmail.com");
            facebookNewAccount.typePassword("jkfklfjsfjñ");
            facebookNewAccount.selectBirthMonth("2");
            facebookNewAccount.selectBirthDay("7");
            facebookNewAccount.selectBirthYear("1980");
            facebookNewAccount.selectFemaleGender();
            facebookNewAccount.clickSignUpButton();


        }

}
