package cinemark.models;

public class Usuario {
    private String clave;
    private String correo;

    public Usuario() {
        this.clave = "1245";
        this.correo = "correo@vali.do";
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                ", clave='" + clave + '\'' +
                ", correo='" + correo + '\'' +
                '}';
    }
}