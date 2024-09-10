import java.util.Scanner;
public class Gaji10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jmlMasuk, jmlTdkMasuk, totalGaji;
        int gaji = 40000, potGaji= 25000;

        System.out.println("Masukkan jumlah hari masuk kerja anda");
        jmlMasuk = input.nextInt();
        System.out.println("masukkan jumlah hari tidak masuk kerja anda");
        jmlTdkMasuk = input.nextInt();

        totalGaji = (jmlMasuk*gaji) - (jmlTdkMasuk*potGaji);

        System.out.println("gaji yang anda terima adalah: " + totalGaji);
    }
}
