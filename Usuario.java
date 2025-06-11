package sistemabibliotecas.modelo;

public abstract class Usuario {
    private String id;
    private String nombre;
    private String password;

    public Usuario(String id, String nombre, String password) {
        this.id = id;
        this.nombre = nombre;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public abstract int obtenerLimitePrestamo();
}
