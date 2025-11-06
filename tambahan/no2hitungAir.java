import java.util.Scanner;

public class no2hitungAir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("masukkan jumlah m kubik air yang digunakan: ");
        int jmlAir = sc.nextInt();
        int hargaBayar = 0;
        if (jmlAir <= 0) {
            System.out.println("jumlah penggunaan air tidak valid");
        } else if (jmlAir <= (50 * 1)) {
            hargaBayar = jmlAir * 1000;
        } else if (jmlAir <= (50 * 2)) {
            hargaBayar = ((50 * 1000) + ((jmlAir - 50) * 1500));
        } else if (jmlAir <= (50 * 3)) {
            hargaBayar = ((50 * 1000) + (50 * 1500) + ((jmlAir - (50 * 2)) * 2000));
        } else {
            hargaBayar = ((50 * 1000) + (50 * 1500) + (50 * 2000) + ((jmlAir - (50 * 3)) * 3000));
        }
        System.out.println(
                "jumlah penggunaan air adalah: " + jmlAir + "m kubik. Harga yang harus dibayar adalah: " + hargaBayar);
    }
}
