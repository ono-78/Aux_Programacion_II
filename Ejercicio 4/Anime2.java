public class Principal {

    public static void main(String[] args) {

        Anime a1 = new Anime("Naruto", "Accion", 220);
        Anime a2 = new Anime("One Piece", "Aventura", 1000);

        Televisor t1 = new Televisor("Samsung", 55, "OLED");
        Televisor t2 = new Televisor("LG", 65, "IPS");

        Instrumento i1 = new Instrumento("Guitarra", "Madera", "Cuerda");
        Instrumento i2 = new Instrumento("Flauta", "Metal", "Aire");

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(i1);
        System.out.println(i2);
    }
}
