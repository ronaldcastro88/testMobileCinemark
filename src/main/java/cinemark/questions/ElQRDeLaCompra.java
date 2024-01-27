package cinemark.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static cinemark.userinterfaces.NavegacionPage.BOTON_FINALIZAR;
import static cinemark.userinterfaces.NavegacionPage.COMPRA_EXITOSA;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class ElQRDeLaCompra implements Question<Boolean> {

    public static ElQRDeLaCompra exitosa() {
        return new ElQRDeLaCompra();
    }

    @Override
    @Step("confirma los datos de la sesión agendada")
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the(COMPRA_EXITOSA, isPresent()).forNoMoreThan(80).seconds(),
                Click.on(BOTON_FINALIZAR));
        return true;
    }
}