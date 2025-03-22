package gestion;

import empleados.Empleado;
import java.util.ArrayList;

public class Empresa {
    private ArrayList<Empleado> empleados;

    public Empresa() {
        this.empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public void mostrarEmpleados() {
        if (empleados.isEmpty()) {
            System.out.println("No hay empleados registrados.");
            return;
        }
        
        System.out.println("\n--- Lista de Empleados ---");
        for (Empleado empleado : empleados) {
            System.out.println("Nombre: " + empleado.getNombre() + 
                                ", Departamento: " + empleado.getDepartamento() + 
                                ", Salario: " + empleado.calcularSalario());
        }
    }

    public double calcularNominaTotal() {
        double total = 0;
        for (Empleado empleado : empleados) {
            total += empleado.calcularSalario();
        }
        return total;
    }
}
