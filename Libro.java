package sistemabibliotecas.modelo;

public class Libro extends Material implements Prestable {
    private boolean disponible = true;

    public Libro(String titulo, String autor, String isbn) {
        super(titulo, autor, isbn);
    }

    public boolean isDisponible() {
        return disponible;
    }

    @Override
    public void prestar() {
        if (disponible) {
            this.disponible = false;
        }
    }

    @Override
    public void devolver() {
        this.disponible = true;
    }

    @Override
    public String toString() {
        return "[Libro Fisico] " + super.toString() + ", Disponible: " + disponible;
    }
}
