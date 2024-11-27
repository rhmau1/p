import java.util.Scanner;

public class NestedLoop10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double arr[][] = new double[5][7];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("kota ke-" + i);
            for (int j = 0; j < arr[0].length; j++) {
                System.out.println("Hari ke-" + (j + 1) + ": ");
                arr[i][j] = sc.nextDouble();
            }
            System.out.println();
        }
        // for (int i = 0; i < arr.length; i++) {
        // System.out.println("kota ke-" + (i + 1));
        // for (int j = 0; j < arr[0].length; j++) {
        // System.out.print(arr[i][j] + " ");
        // }
        // System.out.println();
        // }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("kota ke-" + (i + 1));
            double rataPerkota = 0;
            for (double suhukota : arr[i]) {
                System.out.print(suhukota + " \n");
                rataPerkota += suhukota;
            }
            System.out.println("rata suhu kota ke-" + (i + 1) + " adalah: " + (rataPerkota / 7));
            System.out.println();
        }
    }
}
