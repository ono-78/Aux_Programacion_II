public class Anime {

    private String nombre;
    private String genero;
    private int nroEpisodios;
    private String[] episodios;

    public Anime(String nombre, String genero, int nroEpisodios) {
        this.nombre = nombre;
        this.genero = genero;
        this.nroEpisodios = nroEpisodios;
        this.episodios = new String[nroEpisodios];
    }

    public String toString() {
        return nombre + " - " + genero + " - " + nroEpisodios + " episodios";
    }
}
