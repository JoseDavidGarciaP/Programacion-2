import gestion.Biblioteca;
import libros.Libro;
import libros.LibroTexto;
import libros.Novela;
import libros.Revista;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        mostrarMenu(biblioteca);
    }

    public static void mostrarMenu(Biblioteca biblioteca) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 4) {
            System.out.println("\nMenú de Biblioteca:");
            System.out.println("1. Agregar libro");
            System.out.println("2. Buscar libro por título");
            System.out.println("3. Mostrar todos los libros");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    System.out.println("\nSeleccione el tipo de libro:");
                    System.out.println("1. Libro de texto");
                    System.out.println("2. Novela");
                    System.out.println("3. Revista");
                    System.out.print("Ingrese una opción: ");
                    int tipoLibro = scanner.nextInt();
                    scanner.nextLine(); 

                    System.out.print("Ingrese el título del libro: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Ingrese el autor del libro: ");
                    String autor = scanner.nextLine();
                    System.out.print("Ingrese el año de publicación del libro: ");
                    int anioPublicacion = scanner.nextInt();
                    scanner.nextLine(); 

                    switch (tipoLibro) {
                        case 1: // Libro de texto
                            System.out.print("Ingrese el número de páginas: ");
                            int numPaginasTexto = scanner.nextInt();
                            scanner.nextLine();
                            System.out.print("Ingrese el tema del libro de texto: ");
                            String tema = scanner.nextLine();
                            biblioteca.agregarLibro(new LibroTexto(titulo, autor, anioPublicacion, numPaginasTexto, tema));
                            System.out.println("Libro de texto agregado exitosamente.");
                            break;
                        case 2: // Novela
                            System.out.print("Ingrese el número de páginas: ");
                            int numPaginasNovela = scanner.nextInt();
                            scanner.nextLine();
                            System.out.print("Ingrese el género de la novela: ");
                            String genero = scanner.nextLine();
                            biblioteca.agregarLibro(new Novela(titulo, autor, anioPublicacion, numPaginasNovela, genero));
                            System.out.println("Novela agregada exitosamente.");
                            break;
                        case 3: // Revista
                            System.out.print("Ingrese el número de artículos de la revista: ");
                            int numArticulos = scanner.nextInt();
                            scanner.nextLine();
                            System.out.print("Ingrese la editorial de la revista: ");
                            String editorial = scanner.nextLine();
                            biblioteca.agregarLibro(new Revista(titulo, autor, anioPublicacion, numArticulos, editorial));
                            System.out.println("Revista agregada exitosamente.");
                            break;
                        default:
                            System.out.println("Opción no válida. No se agregó ningún libro.");
                    }
                    break;

                case 2:
                    System.out.print("\nIngrese el título del libro a buscar: ");
                    String tituloBusqueda = scanner.nextLine();
                    Libro libroEncontrado = biblioteca.buscarLibroPorTitulo(tituloBusqueda);
                    if (libroEncontrado != null) {
                        System.out.println("Libro encontrado: " + libroEncontrado);
                    } else {
                        System.out.println("Libro no encontrado.");
                    }
                    break;

                case 3:
                    System.out.println("\nLista de todos los libros:");
                    biblioteca.mostrarTodosLosLibros();
                    break;

                case 4:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }

        scanner.close();
    }
}
