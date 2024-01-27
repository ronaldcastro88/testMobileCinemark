package cinemark.factories;

import cinemark.tasks.IniciarSesion;

import static cinemark.data.DataAutenticacion.usuarioQueExiste;
import static net.serenitybdd.screenplay.Tasks.instrumented;


public class Autenticarse {

    private Autenticarse() {
        throw new IllegalStateException("not instantiable class");
    }

    public static IniciarSesion conCredencialesValidas() {
        return instrumented(IniciarSesion.class, usuarioQueExiste());
    }
}