package libros;

public class Novela extends Libro {
    private int numPaginas;
    private String genero;

    public Novela(String titulo, String autor, int anioPublicacion, int numPaginas, String genero) {
        super(titulo, autor, anioPublicacion);
        this.numPaginas = numPaginas;
        this.genero = genero;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    @Override
    public String toString() {
        return super.toString() + " - " + numPaginas + " páginas - " + genero;
    }

}
