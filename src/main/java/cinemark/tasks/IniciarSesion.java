package cinemark.tasks;

import cinemark.models.Usuario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.type.Type;
import net.thucydides.core.annotations.Step;

import static cinemark.userinterfaces.NavegacionPage.*;


public class IniciarSesion implements Task {
    private final Usuario usuario;

    public IniciarSesion(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    @Step("{0} intenta iniciar sesi\u00F3n con sus datos #usuario")

    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(CAMPO_CORREO_ELECTRONICO),
                Type.theValue("ronald@yopmail.com").into(CAMPO_CORREO_ELECTRONICO),
                Click.on(CAMPO_CONTRASENA), Type.theValue("Test2023+").into(CAMPO_CONTRASENA),
                Click.on(BOTON_INICIAR_SESION));
        System.out.println("TÉRMINO DE DILIGENCIAR EL FORMULARIO");
    }
}