public class Texto extends Libro {
    private String tipo;

    public Texto(String titulo, String autor, double precio, String tipo) {
        super(titulo, autor, precio);
        this.tipo = tipo;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Tipo de Novela: " + tipo);
    }

    public static void main(String[] args) {
        // Aquí puedes escribir el código para probar la clase Texto
        Texto miLibro = new Texto("Mi Libro", "Autor", 19.99, "Ciencia Ficción");
        miLibro.mostrarInformacion();
    }
}

