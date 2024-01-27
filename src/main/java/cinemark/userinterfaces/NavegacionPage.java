package cinemark.userinterfaces;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class NavegacionPage {
    public static final Target COMPRA_EXITOSA = Target.the("Mensaje de espera al cargar la app").located(MobileBy.AccessibilityId(" ¡Tu Compra ha sido confirmada! "));
    public static final Target BOTON_OBTENER_UBICACION = Target.the("Botón para dar permisos de ubicación a la app").located(MobileBy.AccessibilityId("PERMITIR OBTENER UBICACIÓN"));
    public static final Target ICONO_LOGIN = Target.the("Icono que al seleccionado muestra la ventana de autenticación").located(MobileBy.className("android.widget.Button"));
    public static final Target CAMPO_CORREO_ELECTRONICO = Target.the("Campo para ingresar el correo electrónico en el login").located(MobileBy.xpath("//android.widget.FrameLayout[@resource-id='android:id/content']/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[1]"));
    public static final Target CAMPO_CONTRASENA = Target.the("Campo para ingresar la contraseña en el login").located(MobileBy.xpath("//android.widget.FrameLayout[@resource-id='android:id/content']/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[2]"));
    public static final Target BOTON_INICIAR_SESION = Target.the("Botón para iniciar sesión en la app").located(MobileBy.AccessibilityId("INICIAR SESIÓN"));
    public static final Target ICONO_AUTENTICADO = Target.the("Icono que muestra las iniciales del usuario autenticado").located(MobileBy.AccessibilityId("RC"));
    public static final Target CAMPO_NOMBRE_USUARIO = Target.the("Campo que muestra el usuario autenticado").located(MobileBy.AccessibilityId("ronald@yopmail.com"));
    public static final Target BOTON_LOGOUT = Target.the("Campo que muestra el usuario autenticado").located(MobileBy.AccessibilityId("Cerrar sesión"));
    public static final Target BOTON_FINALIZAR = Target.the("Botón para finalizar el proceso").located(MobileBy.AccessibilityId("FINALIZAR"));

    private NavegacionPage() {
        throw new IllegalStateException("user interface class");
    }
}