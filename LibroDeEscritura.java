public class LibroDeEscritura extends Libro {
    private String curso;

    public LibroDeEscritura(String titulo, String autor, double precio, String curso) {
        super(titulo, autor, precio);
        this.curso = curso;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Curso: " + curso);
    }

    public static void main(String[] args) {
        
        LibroDeEscritura miLibro = new LibroDeEscritura("Título del Libro", "Autor del Libro", 39.99, "Curso de Escritura");
        miLibro.mostrarInformacion();
    }
}
