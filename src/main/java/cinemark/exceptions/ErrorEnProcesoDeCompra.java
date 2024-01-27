package cinemark.exceptions;

public class ErrorEnProcesoDeCompra extends AssertionError {
    public static final String ERROR_EN_LA_INFORMACION_DE_LA_COMPRA = "La información de la compra no estuvo presente o no coincide con el esperado";


    public ErrorEnProcesoDeCompra(String message) {
        super(message);
    }

    public ErrorEnProcesoDeCompra(String message, Throwable cause) {
        super(message, cause);
    }
}
