package libros;

public class Revista extends Libro {
    private int numArticulos;
    private String editorial;

    public Revista(String titulo, String autor, int anioPublicacion, int numArticulos, String editorial) {
        super(titulo, autor, anioPublicacion);
        this.numArticulos = numArticulos;
        this.editorial = editorial;
    }

    public int getNumArticulos() {
        return numArticulos;
    }

    public void setNumArticulos(int numArticulos) {
        this.numArticulos = numArticulos;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
    
    @Override
    public String toString() {
        return super.toString() + " - " + numArticulos + " artículos - " + editorial;
    }

}
