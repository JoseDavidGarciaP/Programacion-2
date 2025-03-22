package vehiculos;

public class Moto extends Vehiculo{
    private double cilindrada;

    public Moto(String marca, String modelo, int anio, double cilindrada) {
        super(marca, modelo, anio);
        this.cilindrada = cilindrada;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }
    
    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Cilindrada: " + cilindrada);
    }

}
