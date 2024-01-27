package cinemark.exceptions;

public class ErrorDeAutenticacion extends AssertionError {
    public static final String INICIO_DE_SESION_FALLIDO = "El usuario no pudo iniciar sesión de forma exitosa";
    public static final String REGISTRO_FALLIDO = "El usuario no se registró de manera exitosa";
    public ErrorDeAutenticacion(String message) {
        super(message);
    }

    public ErrorDeAutenticacion(String message, Throwable cause) {
        super(message, cause);
    }
}