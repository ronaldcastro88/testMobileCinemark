package cinemark.builders;

import cinemark.models.Usuario;


public class UsuarioBuilder {
    private final Usuario usuario = new Usuario();

    public static UsuarioBuilder con() {
        return new UsuarioBuilder();
    }


    public UsuarioBuilder laClave(String clave) {
        this.usuario.setClave(clave);
        return this;
    }

    public UsuarioBuilder elCorreo(String correo) {
        this.usuario.setCorreo(correo);
        return this;
    }

    public Usuario build() {
        return usuario;
    }
}