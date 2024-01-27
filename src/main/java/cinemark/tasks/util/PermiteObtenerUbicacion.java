package cinemark.tasks.util;

import co.com.devco.automation.mobile.waits.StandBy;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static cinemark.userinterfaces.NavegacionPage.BOTON_OBTENER_UBICACION;
import static cinemark.userinterfaces.NavegacionPage.ICONO_LOGIN;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class PermiteObtenerUbicacion implements Task {

    public static PermiteObtenerUbicacion paraElPortalDeCinemark() {
        return instrumented(PermiteObtenerUbicacion.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(StandBy.visibilityOf(BOTON_OBTENER_UBICACION).forNoMoreThan(10).seconds());
        actor.attemptsTo(Click.on(BOTON_OBTENER_UBICACION),
                StandBy.visibilityOf(ICONO_LOGIN).forNoMoreThan(3).seconds(),
                Click.on(ICONO_LOGIN));
    }
}