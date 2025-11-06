import java.util.Scanner;

public class no5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double arr[][] = new double[3][5];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("mahasiswa ke-" + (i + 1));
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print("masukkan nilai ke-" + (j + 1) + ": ");
                arr[i][j] = sc.nextDouble();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("mahasiswa ke-" + (i + 1));
            double rataPerMhs = 0;
            for (int j = 0; j < arr[0].length; j++) {
                System.out.println("nilai ke-" + (j + 1) + " adalah: " + arr[i][j]);
                rataPerMhs += arr[i][j];
            }
            System.out.println("rata-rata mahasiswa ke-" + (i + 1) + " adalah: " + (rataPerMhs / arr[0].length));
        }
    }
}
