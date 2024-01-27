package cinemark.tasks;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static cinemark.userinterfaces.MiSesionPage.SELECTOR_SILLAS;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class SeleccionarSilla implements Task {
    public static final Target BOTON_CONTINUAR = Target.the("TARGET DE CONTINUAR BIENNNNN ").located(MobileBy.AccessibilityId("CONTINUAR"));

    public static SeleccionarSilla disponible() {
        return instrumented(SeleccionarSilla.class);
    }

    @Override
    @Step("{0} intenta agendar una sesión de coaching")
    public <T extends Actor> void performAs(T actor) {
        System.out.println("VA A INGRESRA AL WHILE");
        //int bandera=1;
        while (true) {
            System.out.println("INGRESRA AL WHILE");
            try {
                WaitUntil.the(BOTON_CONTINUAR, isEnabled()).forNoMoreThan(20).seconds();
                System.out.println("INGRESRA AL TRY");
                for (int i=1;i<477;i++){
                    System.out.println("INGRESRA AL FOR");
                actor.attemptsTo(Click.on(SELECTOR_SILLAS(i)));
                if (the(BOTON_CONTINUAR).answeredBy(actor).isEnabled()){
                    System.out.println("INGRESRA AL IF");
                    actor.attemptsTo(Click.on(BOTON_CONTINUAR));
                    i=477;
                    System.out.println("CIERRA EL WHILE");
                }
                }
                System.out.println("SALE DEL FOR");
                break;
            } catch (Exception e) {
                System.out.println("El elemento BOTON_ACEPTAR_MENSAJE_LOCALIZACION no está visible aún");
            }
            System.out.println("SALE DEL TRY");
        }
        System.out.println("SALE DEL WHILE");
    }
}