package com.solvd.carina.demo.gui.carinademo.ios;

import com.solvd.carina.demo.gui.carinademo.common.HomePageBase;
import com.solvd.carina.demo.gui.carinademo.common.LoginPageBase;
import com.solvd.carina.demo.gui.carinademo.component.ComponentBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = HomePageBase.class)
public class HomePageIos extends HomePageBase {
    protected HomePageIos(WebDriver driver) {
        super(driver);
    }

    @Override
    public LoginPageBase clickNextBtn()
    {
        throw new UnsupportedOperationException("nOT IMPLEMENT4ED FOT ios");
    }

//    @Override
//    public ComponentBase getComponentBase() {
//        return null;
//    }

}
