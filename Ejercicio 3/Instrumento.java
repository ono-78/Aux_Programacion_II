public class Instrumento {

    private String nombre;
    private String material;
    private String tipo;

    public Instrumento(String nombre, String material, String tipo) {
        this.nombre = nombre;
        this.material = material;
        this.tipo = tipo;
    }

    public String toString() {
        return nombre + " - " + material + " - " + tipo;
    }
}
