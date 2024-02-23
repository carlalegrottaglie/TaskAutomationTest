package com.solvd.carina.demo.gui.carinademo.common;


import com.solvd.carina.demo.gui.carinademo.component.ComponentBase;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class HomePageBase extends AbstractPage implements IMobileUtils {


    protected HomePageBase(WebDriver driver) {
        super(driver);
    }


    public abstract LoginPageBase clickNextBtn();


  //  public abstract ComponentBase getComponentBase();


}
