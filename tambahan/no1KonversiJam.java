import java.util.Scanner;

public class no1KonversiJam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("masukkan detik yang ingin dikonversi: ");
        int detik = sc.nextInt();
        int jam = detik / 60 / 60;
        int menit = (detik / 60) % 60;
        detik = detik % 60;
        System.out.println("detik: " + detik);
        System.out.println("menit: " + menit);
        System.out.println("jam: " + jam);

        System.out.println(jam + ":" + menit + ":" + detik);
    }
}
