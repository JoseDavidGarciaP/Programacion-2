import gestion.Empresa;
import empleados.Empleado;
import empleados.Gerente;
import empleados.Desarrollador;
import empleados.Diseniador;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        mostrarMenu(empresa);
    }

    public static void mostrarMenu(Empresa empresa) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\n--- Menú Empresa ---");
            System.out.println("1. Agregar empleado");
            System.out.println("2. Mostrar empleados");
            System.out.println("3. Calcular nómina total");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese el salario: ");
                    double salario = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Ingrese el departamento: ");
                    String departamento = scanner.nextLine();
                    System.out.println("Seleccione el tipo de empleado: 1. Gerente, 2. Desarrollador, 3. Diseñador");
                    int tipo = scanner.nextInt();
                    Empleado empleado = null;
                    if (tipo == 1) {
                        empleado = new Gerente(nombre, salario, departamento);
                    } else if (tipo == 2) {
                        empleado = new Desarrollador(nombre, salario, departamento);
                    } else if (tipo == 3) {
                        empleado = new Diseniador(nombre, salario, departamento);
                    }
                    if (empleado != null) {
                        empresa.agregarEmpleado(empleado);
                        System.out.println("Empleado agregado exitosamente.");
                    } else {
                        System.out.println("Opción inválida.");
                    }
                    break;
                case 2:
                    empresa.mostrarEmpleados();
                    break;
                case 3:
                    System.out.println("Nómina total: " + empresa.calcularNominaTotal());
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida, intente nuevamente.");
            }
        } while (opcion != 4);
        scanner.close();
    }
}


