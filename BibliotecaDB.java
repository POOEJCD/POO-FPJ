package sistemabibliotecas.modelo;

import java.util.ArrayList;
import java.util.List;

public class BibliotecaDB {
    private List<Usuario> usuarios = new ArrayList<>();
    private List<Libro> libros = new ArrayList<>();
    private List<Prestamo> prestamos = new ArrayList<>();

    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public Usuario buscarUsuario(String id) {
        for (Usuario u : usuarios) {
            if (u.getId().equals(id)) return u;
        }
        return null;
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public Libro buscarLibro(String isbn) {
        for (Libro l : libros) {
            if (l.getIsbn().equals(isbn)) return l;
        }
        return null;
    }

    public List<Libro> getCatalogo() {
        return libros;
    }

    public void agregarPrestamo(Prestamo p) {
        prestamos.add(p);
    }

    public int getPrestamosActivos(Usuario u) {
        int count = 0;
        for (Prestamo p : prestamos) {
            if (p.getUsuario().equals(u)) count++;
        }
        return count;
    }
}
