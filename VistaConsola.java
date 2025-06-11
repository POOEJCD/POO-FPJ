package vista;

import sistemabibliotecas.modelo.Libro;

import java.util.List;
import java.util.Scanner;

public class VistaConsola {
    private Scanner scanner = new Scanner(System.in);

    public int mostrarMenuPrincipal() {
        System.out.println("\n--- SISTEMA DE GESTION BIBLIOTECARIA ---");
        System.out.println("1. Ver catálogo de libros");
        System.out.println("2. Solicitar un préstamo");
        System.out.println("3. Salir");
        System.out.print("Seleccione una opción: ");
        return Integer.parseInt(scanner.nextLine());
    }

    public String solicitarDato(String mensaje) {
        System.out.print(mensaje + ": ");
        return scanner.nextLine();
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void mostrarCatalogo(List<Libro> libros) {
        System.out.println("\nCatálogo de libros:");
        for (Libro libro : libros) {
            System.out.println("→ " + libro);
        }
    }
}
