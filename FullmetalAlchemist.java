package UTS_PBO;

public class FullmetalAlchemist extends Anime {
    private String studio, status;

    public FullmetalAlchemist(String judul, String author, String studio, String status) {
        super(judul, author);
        this.studio = studio;
        this.status = status;
    }

    @Override
    public void tampilAnime() {
        super.tampilAnime();
        System.out.println("Studio: " + studio);
        System.out.println("Status anime saat: " + status);
    }
}