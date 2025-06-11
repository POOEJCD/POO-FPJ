package sistemabibliotecas.modelo;

public abstract class Material {
    private String titulo;
    private String autor;
    private String isbn;

    public Material(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public String toString() {
        return titulo + " - " + autor + " - " + isbn;
    }
}
