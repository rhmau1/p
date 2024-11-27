import java.util.Scanner;

public class tes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[10][6];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print("input" + i + j + " : ");
                int input = sc.nextInt();
                if (input > 0 && input < 6) {
                    arr[i][j] = input;
                } else {
                    System.out.println("hanya menerima input 1-5");
                    j--;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            double[] rataResp = new double[10];
            for (int j = 0; j < arr[0].length; j++) {
                rataResp[i] += arr[i][j];
            }
            System.out.println("rata responden: " + (rataResp[i] / 6));
        }

        for (int i = 0; i < arr[0].length; i++) {
            double[] rataPert = new double[6];
            for (int j = 0; j < arr.length; j++) {
                rataPert[i] += arr[j][i];
            }
            System.out.println("rata pertanyaan: " + (rataPert[i] / 10));
        }

        double rataKeseluruhan = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                rataKeseluruhan += arr[i][j];
            }
        }
        System.out.println("rata keseluruhan: " + (rataKeseluruhan / 60));

        System.out.println("\nArray in table format:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + "\t"); // Print each element followed by a tab for spacing
            }
            System.out.println(); // New line after each row
        }

    }
}
