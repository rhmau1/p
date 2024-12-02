import java.util.Scanner;

public class latsol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan angka pertama: ");
        int a = sc.nextInt();
        System.out.print("masukkan angka kedua: ");
        int b = sc.nextInt();
        // pemutasi(a, b);
        System.out.println("penjumlahan rekursif: " + penjumlahanRekursif(a));
        System.out.println("penjumlahan iteratif: " + penjumlahan(a));
    }

    public static int penjumlahanRekursif(int n) {
        if (n == 1) {
            return 1;
        } else {
            System.out.println("nilai n skrg:" + n);
            return n + penjumlahanRekursif(n - 1);
        }
    }

    public static int penjumlahan(int n) {
        int hasil = 0;
        for (int i = n; i > 0; i--) {
            hasil += i;
        }
        return hasil;
    }

    public static void pemutasi(int a, int b) {
        if (b == 1) {
            System.out.print("(" + a + "-0)");
        } else {
            pemutasi(a, b - 1);
            System.out.print(" * (" + a + "-" + (b - 1) + ")");

            // for (int i = 0; i < b; i++) {
            // if (i == b - 1) {
            // System.out.print("(" + a + "-" + i + ")");
            // } else {
            // System.out.print("(" + a + "-" + i + ")" + " * ");
            // }
            // }
        }
    }
}
