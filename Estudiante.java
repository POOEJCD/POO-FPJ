package sistemabibliotecas.modelo;

public class Estudiante extends Usuario {
    public Estudiante(String id, String nombre, String password) {
        super(id, nombre, password);
    }

    @Override
    public int obtenerLimitePrestamo() {
        return 3;
    }
}
