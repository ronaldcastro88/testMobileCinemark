package cinemark.tasks.util;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;

import java.util.Random;

public class ConvierteDatos implements Performable {

    public static ConvierteDatos aleatorio() {
        return new ConvierteDatos();
    }

    private String generarNumeroAleatorio() {
        String caracteres = "0123456789";
        Random random = new Random();
        StringBuilder numeroAleatorioBuilder = new StringBuilder(10);
        for (int i = 0; i < 10; i++) {
            int indice = random.nextInt(caracteres.length());
            char caracterAleatorio = caracteres.charAt(indice);
            numeroAleatorioBuilder.append(caracterAleatorio);
        }
        System.out.println("EL NÚMERO A RETORNAR ES: " + numeroAleatorioBuilder.toString());
        return numeroAleatorioBuilder.toString();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String numeroAleatorio = generarNumeroAleatorio();
        actor.remember("numeroAleatorio", numeroAleatorio);
    }
}