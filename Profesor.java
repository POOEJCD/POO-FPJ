package sistemabibliotecas.modelo;

public class Profesor extends Usuario {
    public Profesor(String id, String nombre, String password) {
        super(id, nombre, password);
    }

    @Override
    public int obtenerLimitePrestamo() {
        return 5;
    }
}
