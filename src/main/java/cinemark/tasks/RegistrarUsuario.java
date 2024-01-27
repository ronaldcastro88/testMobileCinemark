package cinemark.tasks;

import cinemark.tasks.util.ConvierteDatos;
import co.com.devco.automation.mobile.waits.StandBy;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.type.Type;

import static cinemark.userinterfaces.NavegacionPage.ICONO_AUTENTICADO;
import static cinemark.userinterfaces.RegistroPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RegistrarUsuario implements Task {

    public static Performable enLaApp() {
        return instrumented(RegistrarUsuario.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(StandBy.visibilityOf(BOTON_REGISTRARSE).forNoMoreThan(3).seconds(),
                Click.on(BOTON_REGISTRARSE),
                StandBy.visibilityOf(CAMPO_NOMBRE).forNoMoreThan(2).seconds(),
                Click.on(CAMPO_NOMBRE),Type.theValue("Ramiro test APP").into(CAMPO_NOMBRE),
                Click.on(CAMPO_PRIMER_APELLIDO),Type.theValue("Cardenas test APP").into(CAMPO_PRIMER_APELLIDO),
        ConvierteDatos.aleatorio());
        String numeroAleatorio = actor.recall("numeroAleatorio");
        System.out.println("Número aleatorio de 10 caracteres: " + numeroAleatorio);
        String correo = numeroAleatorio + "@yopmail.com";
        actor.attemptsTo(
                Click.on(CAMPO_CORREO_ELECTRONICO),Type.theValue(correo).into(CAMPO_CORREO_ELECTRONICO),
                Click.on(CAMPO_CONFIRMACION_CORREO_ELECTRONICO),Type.theValue(correo).into(CAMPO_CONFIRMACION_CORREO_ELECTRONICO),
                Click.on(CAMPO_CELULAR),Type.theValue(numeroAleatorio).into(CAMPO_CELULAR),
                Click.on(CAMPO_DIRECCION),Type.theValue("Dirección test APP").into(CAMPO_DIRECCION),
                Click.on(CAMPO_GENERO),
                Click.on(GENERO_MASCULINO),
                Click.on(campoDinamico("10")),
                Click.on(BOTON_ACEPTAR),
                Click.on(campoDinamico("12")),
                Type.theValue(numeroAleatorio).into(campoDinamico("8")),
                Click.on(CAMPO_TEATRO),
                Click.on(CAMPO_TEATRO_FLORESTA),
                Click.on(campoDinamico("11")),
                Click.on(campoDinamico("7")),
                Click.on(campoDinamico("7")), Type.theValue("Test2023+").into(campoDinamico("7")),
                Click.on(campoDinamico("7")),
                Click.on(CAMPO_CONTINUAR),
                StandBy.visibilityOf(ICONO_AUTENTICADO).forNoMoreThan(10).seconds());
    }
}