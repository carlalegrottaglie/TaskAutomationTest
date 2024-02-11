package com.carina.demo.gui.bajalibros_pages;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.awt.*;
import java.awt.event.InputEvent;

public class BookPage extends AbstractBajaLibros  {

    public ExtendedWebElement getBuyBtn() {
        return buyBtn;
    }

  //  @FindBy(xpath = "//*[@id='buyDetailButton']")
//*[@id="buyDetailButton"]

//<a class="primary-btn comprar" href="javascript:void(0);" id="buyDetailButton" title="Permite iniciar el proceso de compra" onclick="cart_add('Ugly Love. Pídeme cualquier cosa menos amor', 'https://images.bajalibros.com/oGsalF7t2sBt-8FXO26P3HBo1zM=/fit-in/50x78/filters:fill(f8f8f8):quality(90)/d2d6tho5fth6q4.cloudfront.net/extast2253237_f699aa6767bbd8c683fb5e85f540f86cde347b67.jpg', 8099.99, 2313648); return false;">Comprar</a>

  //  <a class="primary-btn comprar" href="javascript:void(0);" id="buyDetailButton" title="Permite iniciar el proceso de compra" onclick="cart_add('Ugly Love. Pídeme cualquier cosa menos amor', 'https://images.bajalibros.com/oGsalF7t2sBt-8FXO26P3HBo1zM=/fit-in/50x78/filters:fill(f8f8f8):quality(90)/d2d6tho5fth6q4.cloudfront.net/extast2253237_f699aa6767bbd8c683fb5e85f540f86cde347b67.jpg', 8099.99, 2313648); return false;">Comprar</a>

   // @FindBy(xpath = "//*[contains(@onclick, 'cart_add')]")
  //  @FindBy(css = "[onclick*='cart_add']")
  // @FindBy(xpath = "//*[@text='Comprar']")
   // @FindBy(className= "#a.bybDetailButton.primary-btn comprar")
   // @FindBy(xpath= "@title='Permite iniciar el proceso de compra'")
    //@FindBy(partialLinkText = "comprar")
   // @FindBy(xpath = "//a[text()='%s']")
    //@FindBy(xpath= "//div[@class='detail-ebook desktop']//div[@class='col-detail price hide-on-small-only']//div[@class='content-price']//div[1]//a[1]")
    @FindBy(css = "body > div:nth-child(9) > div:nth-child(1) > div:nth-child(4) > div:nth-child(4) > div:nth-child(1) > div:nth-child(2) > a:nth-child(2)")
    private ExtendedWebElement buyBtn;

    public BookPage(WebDriver driver) {
        super(driver);
    }

    public void buyBtnClick()
    {
       buyBtn.click();

    }
    public void buyBtnClick2() throws AWTException, InterruptedException {
//
//        WebElement element = driver.findElement(By.id("buyDetailButton"));
//
//        Actions act=new Actions(driver);
//        act.moveToElement(element).click().perform();

       // buyBtn.click();
        // Find the "Comprar" element
        String pageSource = driver.getPageSource();
        if (pageSource.contains("Comprar")) {
            // Get the position of the text on the page
            int indexOfText = pageSource.indexOf("Comprar");
            Point textPosition = new Point(indexOfText, 0); // Assuming the text starts at (indexOfText, 0)

            // Create a Robot instance to control mouse
            Robot robot = new Robot();

            // Move the mouse cursor to the position of the text
            robot.mouseMove(textPosition.x, textPosition.y);

            // Simulate left mouse button click
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            System.out.println("'Comprar' was found.");

        } else {
            System.out.println("Text 'Comprar' not found on the page.");
        }


    }



}
