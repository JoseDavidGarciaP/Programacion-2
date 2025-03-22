package empleados;

public class Gerente extends Empleado{
    public Gerente(String nombre, Double salario, String departamento) {
        super(nombre, salario, departamento);
    }

    @Override
    public double calcularSalario() {
        return getSalario() * 2;
    }

}
