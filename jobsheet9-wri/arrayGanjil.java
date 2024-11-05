import java.util.Scanner;

public class arrayGanjil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jmlGanjil = 0;
        System.out.print("masukkan panjang array: ");
        int elemen = sc.nextInt();

        int[] array = new int[elemen];
        int[] ganjil = new int[elemen];
        for (int i = 0; i < array.length; i++) {
            System.out.print("masukkan isi array ke-" + i + ": ");
            array[i] = sc.nextInt();
            if (array[i] % 2 == 1) {
                ganjil[jmlGanjil++] = array[i];
            }
        }
        for (int i = 0; i < ganjil.length; i++) {
            if (ganjil[i] == 0)
                continue;
            System.out.print(ganjil[i] + " ");
        }
    }
}
