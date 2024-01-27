package cinemark.stepdefinitions;

import cinemark.exceptions.ErrorDeAutenticacion;
import cinemark.factories.Autenticarse;
import cinemark.questions.ElUsuario;
import cinemark.tasks.util.PermiteObtenerUbicacion;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import static cinemark.exceptions.ErrorDeAutenticacion.INICIO_DE_SESION_FALLIDO;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AutenticacionStepDefinitions {
    @Dado("^que (.*) quiere hacer uso del portal privado$")
    public void queQuiereHacerUsoDelPortalPrivado(String actor) {
        theActorCalled(actor).entersTheScene();
    }

    @Cuando("^ingresa correctamente sus credenciales$")
    public void ingresaCorrectamenteSusCredenciales() {
        theActorInTheSpotlight().attemptsTo(PermiteObtenerUbicacion.paraElPortalDeCinemark(),
                Autenticarse.conCredencialesValidas());
    }

    @Entonces("^debe mostrar al usuario autenticado$")
    public void debeMostrarAlUsuarioAutenticado() {
        theActorInTheSpotlight().should(seeThat(ElUsuario.autenticado())
                .orComplainWith(ErrorDeAutenticacion.class, INICIO_DE_SESION_FALLIDO));
    }
}