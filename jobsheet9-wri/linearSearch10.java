import java.util.Scanner;

public class linearSearch10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int[] arrayInt = { 34, 10, 26, 40, 72, 20, 56, 63 };
        int array[];
        System.out.print("masukkan panjang array: ");
        int jmlElemen = sc.nextInt();
        array = new int[jmlElemen];
        int hasil = 0;

        for (int i = 0; i < array.length; i++) {
            System.out.print("masukkan isi array ke-" + i + ": ");
            array[i] = sc.nextInt();
        }
        System.out.print("masukkan key yang ingin dicari: ");
        int key = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                found = true;
                hasil = i;
                break;
            }
        }
        if (found) {
            System.out.println("key ada dalam array pada posisi indeks ke-" + hasil);
        } else {
            System.out.println("key tidak ditemukan");
        }
    }
}
