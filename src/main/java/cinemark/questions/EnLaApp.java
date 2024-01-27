package cinemark.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static cinemark.userinterfaces.NavegacionPage.BOTON_LOGOUT;
import static cinemark.userinterfaces.NavegacionPage.ICONO_AUTENTICADO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;


public class EnLaApp implements Question<Boolean> {

    public static EnLaApp autenticado() {
        return new EnLaApp();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(Click.on(ICONO_AUTENTICADO),
                WaitUntil.the(BOTON_LOGOUT, isPresent()).forNoMoreThan(3).seconds());
        return true;
    }
}