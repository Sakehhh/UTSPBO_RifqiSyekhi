package UTS_PBO;

public class KaguyasamaWaKokurasetai extends Anime {
    private String studio, status;

    public KaguyasamaWaKokurasetai(String judul, String author, String studio, String status) {
        super(judul, author);
        this.studio = studio;
        this.status = status;
    }

    public KaguyasamaWaKokurasetai(String studio, String status) {
        this.studio = studio;
        this.status = status;
    }

    @Override
    public void tampilAnime() {
        super.tampilAnime();
        System.out.println("Studio: " + studio);
        System.out.println("Status anime saat ini" + status);
    }
}