package empleados;

public class Desarrollador extends Empleado{
    public Desarrollador(String nombre, Double salario, String departamento) {
        super(nombre, salario, departamento);
    }

    @Override
    public double calcularSalario() {
        return getSalario() * 1.5;
    }

}
