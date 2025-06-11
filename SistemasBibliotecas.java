package sistemabibliotecas;

import Controlador.ControladorBiblioteca;
import sistemabibliotecas.modelo.*;
import vista.VistaConsola;

public class SistemaBibliotecas {

    public static void main(String[] args) {
        // 1. Crear el Modelo
        BibliotecaDB modelo = new BibliotecaDB();

        // Agregar usuarios de prueba
        modelo.agregarUsuario(new Estudiante("123", "Juan Pérez", "1234"));
        modelo.agregarUsuario(new Profesor("456", "Dra. Ana Gómez", "abcd"));

        // Agregar libros de prueba
        modelo.agregarLibro(new Libro("El Quijote", "Cervantes", "ISBN001"));
        modelo.agregarLibro(new Libro("Java POO", "Oracle", "ISBN002"));

        // 2. Crear la Vista
        VistaConsola vista = new VistaConsola();

        // 3. Crear el Controlador
        ControladorBiblioteca controlador = new ControladorBiblioteca(modelo, vista);

        // 4. Iniciar la aplicación
        controlador.iniciar();
    }
}
