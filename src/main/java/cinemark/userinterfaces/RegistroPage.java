package cinemark.userinterfaces;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegistroPage {
    public static final Target BOTON_REGISTRARSE = Target.the("Botón registrarse que aparece en la ventana de autenticación").located(MobileBy.AccessibilityId("Registrarse"));
    public static final Target CAMPO_CORREO_ELECTRONICO = Target.the("Campo para ingresar el correo electrónico").located(By.xpath("//android.widget.ScrollView/android.widget.EditText[3]"));
    public static final Target CAMPO_CONFIRMACION_CORREO_ELECTRONICO = Target.the("Campo para confirmar el correo electrónico").located(By.xpath("//android.widget.ScrollView/android.widget.EditText[4]"));
    public static final Target CAMPO_CELULAR = Target.the("Campo para ingresar el celular").located(By.xpath("//android.widget.ScrollView/android.widget.EditText[5]"));
    public static final Target CAMPO_DIRECCION = Target.the("Campo para ingresar la dirección").located(By.xpath("//android.widget.ScrollView/android.widget.EditText[6]"));
    public static final Target CAMPO_GENERO = Target.the("Campo para seleccionar el género").located(MobileBy.AccessibilityId("Género (opcional)"));
    public static final Target GENERO_MASCULINO = Target.the("Campo para seleccionar el género masculino").located(MobileBy.AccessibilityId("Masculino"));
    public static final Target BOTON_ACEPTAR = Target.the("Campo para seleccionar el género masculino").located(MobileBy.AccessibilityId("ACEPTAR"));

    public static final Target CAMPO_CIUDAD = Target.the("Campo para seleccionar el tipo de documento").located(MobileBy.xpath("//*[@content-desc=\"Ciudad *\n" +
            "Bogota\"]"));
    public static final Target CAMPO_CIUDAD_BOGOTA = Target.the("Select con los tipos de documentos").located(MobileBy.AccessibilityId("Bogota"));

    public static final Target CAMPO_DOCUMENTO = Target.the("Campo para ingresar el número de documento").located(MobileBy.xpath("//android.widget.EditText[@hint=\"Número de documento *\"]"));
    public static final Target campoDinamico(String valor) {
        String xpath = String.format("//*[contains(@index, '%s')]", valor);
        return Target.the(String.format("Campo para ingresar %s", valor)).located(MobileBy.xpath(xpath));
    }
    public static final Target CAMPO_TEATRO = Target.the("Campo para seleccionar el teatro").located(MobileBy.xpath("//android.widget.Button[@content-desc=\"Teatro de preferencia *\"]"));
    public static final Target CAMPO_TEATRO_FLORESTA = Target.the("Campo para seleccionar el teatro").located(MobileBy.AccessibilityId("Lab v5 Floresta"));

    public static final Target CAMPO_CONTINUAR = Target.the("Campo para ingresar la contraseña").located(MobileBy.AccessibilityId("CONTINUAR"));
    public static final Target CAMPO_NOMBRE = Target.the("Campo para ingresar el nombre").located(By.xpath("//android.widget.ScrollView/android.widget.EditText[1]"));
    public static final Target CAMPO_PRIMER_APELLIDO = Target.the("Campo para ingresar el apellido paterno").located(By.xpath("//android.widget.ScrollView/android.widget.EditText[2]"));
    private RegistroPage() {
        throw new IllegalStateException("user interface class");
    }
}