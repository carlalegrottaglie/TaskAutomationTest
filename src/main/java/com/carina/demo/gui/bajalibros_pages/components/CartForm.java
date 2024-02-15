package com.carina.demo.gui.bajalibros_pages.components;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import com.zebrunner.carina.webdriver.locator.Context;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;


public class CartForm extends AbstractUIObject {
   // @FindBy(css = "html.webp body.www.menu-active div#menu.z-depth-3.sidemenues div.menu-footer div.row div.col.s12 a#confirmBuyFooter.action-confirm-checkout")

   // @FindBy(partialLinkText ="<a class=\"action-confirm-checkout\" href=\"/AR/Confirmar\" title=\"Confirma los pedidos del carrito de compra\" id=\"confirmBuyFooter\">Finalizar compra</a>")
   // <a class="action-confirm-checkout" href="/AR/Confirmar" title="Confirma los pedidos del carrito de compra" id="confirmBuyFooter">Finalizar compra</a>
 
   //@FindBy(tagName = "Finalizar compra")
   @FindBy(xpath= "//div[@class='detail-ebook desktop']//div[@class='col-detail price hide-on-small-only']//div[@class='content-price']//div[1]//a[1]")
  // @FindBy(css = "body > div:nth-child(9) > div:nth-child(1) > div:nth-child(4) > div:nth-child(4) > div:nth-child(1) > div:nth-child(2) > a:nth-child(2)")
   private ExtendedWebElement buyBtn;
   //@FindBy(linkText= "<a id=\"confirmBuyFooter\" class=\"action-confirm-checkout\" href=\"/AR/Confirmar\" title=\"Confirma los pedidos del carrito de compra\">")
   @FindBy(xpath= "/html/body/div[10]/div[2]/div[2]/div/a")
    private ExtendedWebElement confirmBuyFooterBtn;
//<a class="action-confirm-checkout" href="/AR/Confirmar" title="Confirma los pedidos del carrito de compra" id="confirmBuyFooter">Finalizar compra</a>
    @FindBy(xpath = "/html[1]/body[1]/div[10]/ul[1]/li[1]/div[3]/a[1]/*[name()='svg'][1]/*[name()='g'][1]/*[name()='g'][1]/*[name()='g'][1]/*[name()='path'][2]")
    private ExtendedWebElement eliminateBookBtn;


   public CartForm(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }
    public ExtendedWebElement getConfirmBuyFooterBtn()
    {return confirmBuyFooterBtn;}

    public ExtendedWebElement getEliminateBookBtn()
    {return eliminateBookBtn;}

    public void confirmBuyFooterBtnClick() {

        confirmBuyFooterBtn.isElementPresent();
        confirmBuyFooterBtn.click();
    }

    public void eliminateBookBtnClick() {

        eliminateBookBtn.isElementPresent();
        eliminateBookBtn.click();
    }


}
