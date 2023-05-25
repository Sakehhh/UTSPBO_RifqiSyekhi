package UTS_PBO;

public class OnePiece extends Anime {
    private String studio, status;

    public OnePiece(String judul, String author, String studio, String status) {
        super(judul, author);
        this.studio = studio;
        this.status = status;
    }

    public OnePiece(String studio, String status) {
        this.studio = studio;
        this.status = status;
    }

    @Override
    public void tampilAnime() {
        super.tampilAnime();
        System.out.println("Studio: " + studio);
        System.out.println("Status anime saat ini: " + status);
    }
}