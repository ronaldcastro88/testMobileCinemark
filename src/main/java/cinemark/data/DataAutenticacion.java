package cinemark.data;

import cinemark.builders.UsuarioBuilder;
import cinemark.models.Usuario;

public class DataAutenticacion {

    private DataAutenticacion() {
        throw new IllegalStateException("not instantiable class");
    }

    public static Usuario usuarioQueExiste() {
        return UsuarioBuilder.con().elCorreo("ronald@yopmail.com").laClave("Test2023+").build();
    }
}