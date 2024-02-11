package com.carina.demo.gui.bajalibros_pages.components;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;


public class CartForm extends AbstractUIObject {
   // @FindBy(css = "html.webp body.www.menu-active div#menu.z-depth-3.sidemenues div.menu-footer div.row div.col.s12 a#confirmBuyFooter.action-confirm-checkout")
    @FindBy(partialLinkText ="<a class=\"action-confirm-checkout\" href=\"/AR/Confirmar\" title=\"Confirma los pedidos del carrito de compra\" id=\"confirmBuyFooter\">Finalizar compra</a>")
   // <a class="action-confirm-checkout" href="/AR/Confirmar" title="Confirma los pedidos del carrito de compra" id="confirmBuyFooter">Finalizar compra</a>
    private ExtendedWebElement confirmBuyFooterBtn;

    @FindBy(xpath = "//*[name()='path' and @id='Stroke-3']")
    private ExtendedWebElement eliminateBookBtn;


    public CartForm(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }


    public void confirmBuyFooterBtnClick() {
        confirmBuyFooterBtn.click();
    }

    public void eliminateBookBtnClick() {
        eliminateBookBtn.click();
    }

}
