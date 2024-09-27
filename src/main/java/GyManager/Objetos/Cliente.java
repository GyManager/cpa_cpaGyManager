package GyManager.Objetos;

public class Cliente {
    private String avatar,nombre,apellido, dni, email, estado;

    public Cliente(String avatar, String nombre, String apellido, String dni, String email, String estado) {
        this.avatar = avatar;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.email = email;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "avatar='" + avatar + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni='" + dni + '\'' +
                ", email='" + email + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }
}
