import java.util.Scanner;
import gestion.Concesionario;
import vehiculos.Vehiculo;

public class App {
    public static void main(String[] args) throws Exception {
        Concesionario concesionario = new Concesionario();
        mostrarMenu(concesionario);
    }

    public static void mostrarMenu(Concesionario concesionario) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menú de Concesionario:");
            System.out.println("1. Agregar Vehículo");
            System.out.println("2. Listar Vehículos");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); 
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la marca del vehículo: ");
                    String marca = scanner.nextLine();
                    System.out.print("Ingrese el modelo del vehículo: ");
                    String modelo = scanner.nextLine();
                    System.out.print("Ingrese el año del vehículo: ");
                    int anio = scanner.nextInt();
                    scanner.nextLine(); 
                    Vehiculo vehiculo = new Vehiculo(marca, modelo, anio);
                    concesionario.agregarVehiculo(vehiculo);
                    System.out.println("Vehículo agregado exitosamente.");
                    break;
                case 2:
                    System.out.println("Lista de Vehículos:");
                    for (Vehiculo v : concesionario.listarVehiculos()) {
                        System.out.println(v);
                    }
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 3);
        scanner.close();
    }
}
