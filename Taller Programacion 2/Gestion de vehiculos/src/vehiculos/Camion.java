package vehiculos;

public class Camion extends Vehiculo {
    private double capacidadCarga;

    public Camion(String marca, String modelo, int anio, double capacidadCarga) {
        super(marca, modelo, anio);
        this.capacidadCarga = capacidadCarga;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Capacidad de carga: " + capacidadCarga);
    }

}
