package cinemark.stepdefinitions;

import cinemark.exceptions.ErrorEnProcesoDeCompra;
import cinemark.factories.Autenticarse;
import cinemark.questions.ElQRDeLaCompra;
import cinemark.tasks.SeleccionarSilla;
import cinemark.tasks.util.HideKeyboard;
import cinemark.tasks.util.PermiteObtenerUbicacion;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.type.Type;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static cinemark.exceptions.ErrorEnProcesoDeCompra.ERROR_EN_LA_INFORMACION_DE_LA_COMPRA;
import static cinemark.userinterfaces.MiSesionPage.*;
import static cinemark.userinterfaces.RegistroPage.campoDinamico;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ProcesoCompraStepDefinitions {

    @Dado("^que (.*) quiere realizar una compra desde la app$")
    public void queQuiereRealizarUnaCompraDesdeLaApp(String actor) {
        theActorCalled(actor).attemptsTo(PermiteObtenerUbicacion.paraElPortalDeCinemark(),
                Autenticarse.conCredencialesValidas());

    }

    @Cuando("^realiza todo el proceso de checkout$")
    public void realizaTodoElProcesoDeCheckout() {
        System.out.println("ENTRÓ AL CUANDO");
        theActorInTheSpotlight().attemptsTo(WaitUntil.the(PELICULA, isPresent()).forNoMoreThan(5).seconds(),
                Click.on(PELICULA),
                Click.on(BOTON_HORARIO),
                WaitUntil.the(SELECTOR_TARIFAS, isPresent()).forNoMoreThan(20).seconds(),
                Click.on(SELECTOR_TARIFAS),
                Click.on(BOTON_CONTINUAR),
                SeleccionarSilla.disponible(),
                //Click.on(SELECTOR_SILLAS),
                //Click.on(BOTON_CONTINUAR),
                WaitUntil.the(BOTON_ACEPTAR_MENSAJE_LOCALIZACION, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(BOTON_ACEPTAR_MENSAJE_LOCALIZACION),
                WaitUntil.the(BOTON_AGREGAR_CARRITO, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(BOTON_AGREGAR_CARRITO),
                Click.on(BOTON_CONTINUAR),
                Click.on(BOTON_CONTINUAR),
                WaitUntil.the(SELECTOR_APELLIDO, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(campoDinamico("6")), Type.theValue("BOGOTA D.C., BOGOTÁ").into(campoDinamico("6")),
                Click.on(campoDinamico("8")),
                Click.on(campoDinamico("6")),
                //WaitUntil.the(CAMPO_CIUDAD, isVisible()).forNoMoreThan(10).seconds(), Click.on(CAMPO_CIUDAD),
                HideKeyboard.hide(),
                Click.on(campoDinamico("10")),
                Click.on(BOTON_CONTINUAR),
                Click.on(SELECTOR_TARJETA),
                Click.on(SELECTOR_TARJETA_GUARDADA),
                Click.on(SELECTOR_CVV),Type.theValue("777").into(SELECTOR_CVV),
                /*Click.on(campoDinamico("2")),
                Type.theValue("APPROVED").into(campoDinamico("2")),
                Click.on(campoDinamico("3")),
                Type.theValue("4111111111111111").into(campoDinamico("3")),
                Click.on(campoDinamico("4")),
                Type.theValue("11/26").into(campoDinamico("4")),
                Click.on(campoDinamico("5")),
                Type.theValue("777").into(campoDinamico("5")),
                Click.on(campoDinamico("7")),*/
                Click.on(BOTON_PAGAR));
        
    }

    @Entonces("^se muestra el QR del tiquete de compra$")
    public void seMuestraElQRDelTiqueteDeCompra() {
        theActorInTheSpotlight().should(seeThat(ElQRDeLaCompra.exitosa())
                .orComplainWith(ErrorEnProcesoDeCompra.class, ERROR_EN_LA_INFORMACION_DE_LA_COMPRA));
    }
}
