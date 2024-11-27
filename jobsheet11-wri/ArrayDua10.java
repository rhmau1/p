import java.util.Scanner;

public class ArrayDua10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int data[][] = new int[4][4];
        int jam[] = { 3, 6, 9, 12 };
        int min[] = { 100, 100, 100, 100 };
        int maks[] = { 0, 0, 0, 0 };
        double total[] = { 0, 0, 0, 0 };
        double rata[] = { 0, 0, 0, 0 };
        for (int i = 0; i < data.length; i++) {
            System.out.printf("jam %s\n", jam[i]);
            for (int j = 0; j < data[0].length; j++) {
                switch (j) {
                    case 0:
                        System.out.println("masukkan suhu: ");
                        data[i][j] = sc.nextInt();
                        if (min[j] > data[i][j]) {
                            min[j] = data[i][j];
                        }
                        if (maks[j] < data[i][j]) {
                            maks[j] = data[i][j];
                        }
                        total[j] += data[i][j];
                        break;
                    case 1:
                        System.out.println("masukkan kelembaban: ");
                        data[i][j] = sc.nextInt();
                        if (min[j] > data[i][j]) {
                            min[j] = data[i][j];
                        }
                        if (maks[j] < data[i][j]) {
                            maks[j] = data[i][j];
                        }
                        total[j] += data[i][j];
                        break;
                    case 2:
                        System.out.println("masukkan kecepatan angin: ");
                        data[i][j] = sc.nextInt();
                        if (min[j] > data[i][j]) {
                            min[j] = data[i][j];
                        }
                        if (maks[j] < data[i][j]) {
                            maks[j] = data[i][j];
                        }
                        total[j] += data[i][j];
                        break;
                    case 3:
                        System.out.println("masukkan index uv: ");
                        data[i][j] = sc.nextInt();
                        if (min[j] > data[i][j]) {
                            min[j] = data[i][j];
                        }
                        if (maks[j] < data[i][j]) {
                            maks[j] = data[i][j];
                        }
                        total[j] += data[i][j];
                        break;
                    default:
                        System.out.println("nilai J tidak valid");
                        break;
                }
                rata[j] = total[j] / data[0].length;
            }
        }
        System.out.println("==================");
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println("==================");
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][2]);
        }
        System.out.println(" ");
        System.out.println("==================");
        System.out.printf("rata-rata suhu: %.2f\n", rata[0]);
        System.out.printf("persentase kelembaban terendah: %s\n", min[1]);
        System.out.printf("nilai maksimum index UV: %s\n", maks[3]);
    }
}
