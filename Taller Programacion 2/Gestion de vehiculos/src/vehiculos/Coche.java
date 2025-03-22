package vehiculos;

public class Coche extends Vehiculo {
    private int numPuertas;

    public Coche(String marca, String modelo, int anio, int numPuertas) {
        super(marca, modelo, anio);
        this.numPuertas = numPuertas;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }
    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Número de puertas: " + numPuertas);
    }

}
