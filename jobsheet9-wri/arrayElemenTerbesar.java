import java.util.Scanner;

public class arrayElemenTerbesar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int terbesar = 0;
        System.out.print("masukkan panjang array: ");
        int elemen = sc.nextInt();

        int[] array = new int[elemen];
        for (int i = 0; i < array.length; i++) {
            System.out.print("masukkan isi array ke-" + i + ": ");
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] > terbesar) {
                terbesar = array[i];
            }
        }
        System.out.println("elemen terbesar: " + terbesar);
    }
}
