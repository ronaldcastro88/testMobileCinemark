package cinemark.stepdefinitions;

import cinemark.exceptions.ErrorDeAutenticacion;
import cinemark.questions.EnLaApp;
import cinemark.tasks.RegistrarUsuario;
import cinemark.tasks.util.PermiteObtenerUbicacion;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import static cinemark.exceptions.ErrorDeAutenticacion.REGISTRO_FALLIDO;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RegistrarUsuariosStepDefinitions {
    @Dado("^que (.*) quiere usar la app de Cinemark$")
    public void queLuisaQuiereUsarLaAppDeCinemark(String actor) {
        theActorCalled(actor).attemptsTo(PermiteObtenerUbicacion.paraElPortalDeCinemark());
    }

    @Cuando("^realiza el proceso de registro$")
    public void realizaElProcesoDeRegistro() {
        theActorInTheSpotlight().attemptsTo(RegistrarUsuario.enLaApp());
    }

    @Entonces("^debe mostrar al usuario en el portal privado$")
    public void debeMostrarAlUsuarioEnElPortalPrivado() {
        theActorInTheSpotlight().should(seeThat(EnLaApp.autenticado())
                .orComplainWith(ErrorDeAutenticacion.class, REGISTRO_FALLIDO));
    }
}