package com.solvd.carina.demo.gui.carinademo.android;

import com.solvd.carina.demo.gui.carinademo.common.HomePageBase;
import com.solvd.carina.demo.gui.carinademo.common.LoginPageBase;
import com.solvd.carina.demo.gui.carinademo.component.ComponentBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = HomePageBase.class)
public class HomePageAndroid extends HomePageBase {

    @FindBy(id = "next_button")
    private Component component;
   @FindBy(id = "next_button")
   private ExtendedWebElement nextBtn;
    public HomePageAndroid(WebDriver driver) {
        super(driver);
    }

    @Override
    public LoginPageBase clickNextBtn() {
      //  swipe(nextBtn, Direction.VERTICAL_DOWN_FIRST);
        nextBtn.click();
        return initPage(LoginPageBase.class);

    }

//    @Override
//    public ComponentBase getComponentBase() {
//        return component;
//    }

}
