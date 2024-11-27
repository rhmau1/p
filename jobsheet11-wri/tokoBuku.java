import java.util.Scanner;

public class tokoBuku {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[2][3];
        int terendah = Integer.MAX_VALUE;
        int tokoTermurah = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("buku ke-" + (i + 1));
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print("toko ke-" + (j + 1) + ": ");
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < arr[0].length; i++) {
            int[] total = new int[3];
            for (int j = 0; j < arr.length; j++) {
                total[i] += arr[j][i];
            }
            if (total[i] < terendah) {
                terendah = total[i];
                tokoTermurah = i;
            }
            System.out.println("total toko ke-" + (i + 1) + ": " + total[i]);
        }
        System.out.println("terendah dengan harga: " + terendah + " di toko ke-" + (tokoTermurah + 1));

    }
}
