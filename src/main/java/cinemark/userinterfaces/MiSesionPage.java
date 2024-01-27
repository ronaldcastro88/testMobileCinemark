package cinemark.userinterfaces;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class MiSesionPage {

    public static final Target PELICULA = Target.the("Imagen y descripción de la pelicula").located(MobileBy.xpath("//android.widget.ScrollView/android.view.View[9]/android.view.View/android.view.View[1]"));
    public static final Target BOTON_HORARIO = Target.the("Horario de la pelicula").located(MobileBy.AccessibilityId("20:30 PM"));
    public static final Target SELECTOR_TARIFAS = Target.the("Selección de cantidad de sillas").located(MobileBy.xpath("//android.view.View[@content-desc='PK TTConfi\n$ 3.200\n0']/android.widget.Button[2]"));
    public static final Target SELECTOR_APELLIDO = Target.the("Texto con el tema de la sesión").located(MobileBy.xpath("//android.widget.EditText[@text='Castro']"));
    public static final Target BOTON_CONTINUAR = Target.the("Texto con el tema de la sesión").located(MobileBy.AccessibilityId("CONTINUAR"));
    public static final Target BOTON_ACEPTAR_MENSAJE_LOCALIZACION = Target.the("Texto con el tema de la sesión").located(MobileBy.AccessibilityId("ACEPTAR"));
    public static final Target BOTON_AGREGAR_CARRITO = Target.the("Texto con el tema de la sesión").located(MobileBy.xpath("//android.view.View[@content-desc=' COMBO MIO APP IP\n$ 34.700\n0']/android.view.View[2]"));
    public static final Target CAMPO_CIUDAD = Target.the("Texto con el tema de la sesión").located(MobileBy.AccessibilityId("BOGOTA D.C., BOGOTÁ"));
    public static final Target SELECTOR_TARJETA = Target.the("Texto con el tema de la sesión").located(MobileBy.AccessibilityId("Tarjetas guardadas"));
    public static final Target SELECTOR_TARJETA_GUARDADA = Target.the("Texto con el tema de la sesión").located(MobileBy.AccessibilityId("VISA\n**1111"));
    public static final Target SELECTOR_CVV = Target.the("Texto con el tema de la sesión").located(MobileBy.xpath("//android.widget.ImageView[@content-desc=\"**1111\"]/android.widget.EditText"));
    public static final Target CAMPO_NUMERO_TARJETA = Target.the("Texto con el tema de la sesión").located(MobileBy.AccessibilityId("Tarjeta crédito/débito"));
    public static final Target BOTON_PAGAR= Target.the("Texto con el tema de la sesión").located(MobileBy.AccessibilityId("PAGAR"));

    public static final Target SELECTOR_SILLAS(int valor) {
        String xpath = String.format("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[6]/android.view.View/android.view.View[%s]", valor);
        System.out.println("ENTRÓ AL TARGET DE SELECTOR_SILLAS: " + xpath);
        return Target.the(String.format("Campo para ingresar %s", valor)).located(MobileBy.xpath(xpath));
    }
    private MiSesionPage() {
        throw new IllegalStateException("user interface class");
    }
}