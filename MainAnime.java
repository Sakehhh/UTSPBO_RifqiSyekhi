package UTS_PBO;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class MainAnime {
    public static void main(String[] args) {
        int pilih;

        Scanner masuk = new Scanner(System.in);
        System.out.println("=== INFO ANIME TERBAIK ===");
        System.out.println("1. Fullmetal Alchemist");
        System.out.println("2. Kaguya-sama wa Kokurasetai");
        System.out.println("3. One Piece");
        System.out.println("4. Keluar dari Info Anime");
        System.out.println("===========================");

        pilih = masuk.nextInt();

        System.out.println("\n");

        FullmetalAlchemist Mustang = new FullmetalAlchemist("Fullmetal Alchemist", "Hiromu Arakawa", "Bones",
                "Completed");
        KaguyasamaWaKokurasetai Kaguya = new KaguyasamaWaKokurasetai("Kaguya-sama wa Kokurasetai", "Aka Akasaka",
                "A-1 Pictures", "Airing");
        OnePiece Luffy = new OnePiece("One Piece", "Eiichiro Oda", "Toei Animation", "Airing");

        switch (pilih) {
            case 1:
                System.out.println("Fullmetal Alchemist");
                Mustang.tampilAnime();
                System.out.println("Fullmetal Alchemist adalah anime terbaik no 1 menurut situs Myanimelist");

                break;

            case 2:
                System.out.println("Kaguya-sama wa Kokurasetai");
                Kaguya.tampilAnime();
                System.out.println(
                        "Kaguysa-sama wa Kokurasetai adalah anime bergenre romance dan school, menceritakan kehidupan siswa OSIS SMA");

                break;

            case 3:
                System.out.println("One Piece");
                Luffy.tampilAnime();
                System.out.println("One Piece adalah anime yang menceritakan petualangan kelompok bajak laut");

                break;

            case 4:
                JOptionPane.showMessageDialog(null, "Anda Telah Keluar Dari Program Info Anime Terbaik!",
                        "Keluar Program",
                        JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);

                break;

            default:
                System.out.println("Maaf Pilihan Kamu Tidak Ada!");
        }
    }
}