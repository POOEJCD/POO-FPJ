package Controlador;

import sistemabibliotecas.modelo.*;
import vista.VistaConsola;

public class ControladorBiblioteca {
    private BibliotecaDB modelo;
    private VistaConsola vista;

    public ControladorBiblioteca(BibliotecaDB modelo, VistaConsola vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void iniciar() {
        int opcion;
        do {
            opcion = vista.mostrarMenuPrincipal();
            switch (opcion) {
                case 1 -> vista.mostrarCatalogo(modelo.getCatalogo());
                case 2 -> gestionarPrestamo();
                case 3 -> vista.mostrarMensaje("Gracias por usar el sistema.");
                default -> vista.mostrarMensaje("Opción no válida.");
            }
        } while (opcion != 3);
    }

    private void gestionarPrestamo() {
        String idUsuario = vista.solicitarDato("Ingrese su ID de usuario");
        Usuario usuario = modelo.buscarUsuario(idUsuario);
        if (usuario == null) {
            vista.mostrarMensaje("Error: Usuario no encontrado.");
            return;
        }

        int activos = modelo.getPrestamosActivos(usuario);
        if (activos >= usuario.obtenerLimitePrestamo()) {
            vista.mostrarMensaje("Límite de préstamos alcanzado.");
            return;
        }

        String isbn = vista.solicitarDato("Ingrese el ISBN del libro");
        Libro libro = modelo.buscarLibro(isbn);
        if (libro == null || !libro.isDisponible()) {
            vista.mostrarMensaje("Libro no disponible.");
            return;
        }

        libro.prestar();
        modelo.agregarPrestamo(new Prestamo(usuario, libro));
        vista.mostrarMensaje("Préstamo registrado.");
    }
}
