package empleados;

public class Diseniador extends Empleado{
    public Diseniador(String nombre, Double salario, String departamento) {
        super(nombre, salario, departamento);
    }

    public double calcularSalario() {
        return getSalario() * 1.2;
    }

}
