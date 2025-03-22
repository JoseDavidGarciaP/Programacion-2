package libros;

public class LibroTexto extends Libro {
    private int numPaginas;
    private String tema;

    public LibroTexto(String titulo, String autor, int anioPublicacion, int numPaginas, String tema) {
        super(titulo, autor, anioPublicacion);
        this.numPaginas = numPaginas;
        this.tema = tema;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }
    
    @Override
    public String toString() {
        return super.toString() + " - " + numPaginas + " páginas - " + tema;
    }

}
