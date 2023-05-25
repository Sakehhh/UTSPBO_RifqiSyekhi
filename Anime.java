package UTS_PBO;

//Enkapsulasi
public class Anime {
    private String judul;
    private String author;

    public Anime(String judul, String author) {
        this.judul = judul;
        this.author = author;
    }

    public Anime() {

    }

    public void tampilAnime() {
        System.out.println("Judul: " + judul);
        System.out.println("Author: " + author);
    }
}