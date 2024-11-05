import java.util.Scanner;

public class arrayterbalik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan panjang array: ");
        int elemen = sc.nextInt();

        int[] array = new int[elemen];
        for (int i = 0; i < array.length; i++) {
            System.out.print("masukkan isi array ke-" + i + ": ");
            array[i] = sc.nextInt();
        }
        for (int i = array.length; i > 0 && i <= array.length; i--) {
            System.out.println("indeks ke-" + (i - 1) + " = " + array[array.length - i]);
        }
    }
}
