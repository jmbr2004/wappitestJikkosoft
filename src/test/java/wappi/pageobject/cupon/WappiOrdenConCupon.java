package wappi.pageobject.cupon;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class WappiOrdenConCupon extends PageObject {

	@FindBy(css = "#welcome-coupon")
	WebElementFacade botonCupon;

	@FindBy(xpath = "//input[@id='coupon']")
	WebElementFacade ingCodigoCupon;

	@FindBy(css = "div.home:nth-child(4) div.home-content table.app-table.offers-table tbody:nth-child(2) tr:nth-child(2) td.align-center:nth-child(7) > button.button.success.offers-table-block-button")
	WebElementFacade botonPedir;

	@FindBy(css = "#order-confirm")
	WebElementFacade botonConfirmar;

	@FindBy(css = "app-root:nth-child(1) app-coupon-modal:nth-child(2) div.modal.opened div.modal-content > span.close:nth-child(1)")
	WebElementFacade botonCerrarPopup;

	@FindBy(css = "body:nth-child(2) app-root:nth-child(1) app-coupon-modal:nth-child(2) div.modal.opened > div.modal-content")
	WebElementFacade textoCodigoCupon;

	@FindBy(linkText = "Inicio")
	WebElementFacade botonInicio;
	
	String codigoCupon;

	public void irBotCup() {

		botonCupon.click();
	}

	public void obtenerCofigoCupon() {

		codigoCupon = textoCodigoCupon.findElement(By.xpath("//*[@id=\"coupon-code\"]")).getAttribute("innerHTML");
	}
	
	public void irBotCerCup() {

		botonCerrarPopup.click();
	}
	
	public void irInicio() {

		botonInicio.click();
	}

	public void pedirCompra() {

		botonPedir.click();
	}

	public void confirmarCompraCupon() {
		
		ingCodigoCupon.type(codigoCupon);
		botonConfirmar.click();
	}
}
