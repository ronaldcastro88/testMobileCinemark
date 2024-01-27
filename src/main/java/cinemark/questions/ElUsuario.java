package cinemark.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static cinemark.userinterfaces.NavegacionPage.CAMPO_NOMBRE_USUARIO;
import static cinemark.userinterfaces.NavegacionPage.ICONO_AUTENTICADO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class ElUsuario implements Question<Boolean> {

    public static ElUsuario autenticado() {
        return new ElUsuario();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(Click.on(ICONO_AUTENTICADO),
                WaitUntil.the(CAMPO_NOMBRE_USUARIO, isPresent()).forNoMoreThan(3).seconds());
        return true;
    }
}