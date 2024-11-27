import java.util.Scanner;

public class tugas2fungsi {
    static int[][] arr = new int[5][7];
    static String[] nama = { "sari", "rina", "yani", "dwi", "lusi" };

    public static void main(String[] args) {
        input();
        tampil();
        rataPerminggu(arr);
        mahasiswaTerbaik(arr, nama);
    }

    public static void input() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("masukkan nilai untuk mahasiswa " + nama[i]);
            for (int j = 0; j < arr[0].length; j++) {
                System.out.println("nilai minggu ke-" + (j + 1));
                arr[i][j] = sc.nextInt();
            }
        }
    }

    public static void tampil() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("nilai untuk mahasiswa " + nama[i]);
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void rataPerminggu(int[][] arr) {
        int[] rataPerminggu = new int[7];
        int tertinggi = 0;
        int mingguKe = 0;
        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr.length; j++) {
                rataPerminggu[i] += arr[j][i];
                if (rataPerminggu[i] > tertinggi) {
                    tertinggi = rataPerminggu[i];
                    mingguKe = i + 1;
                }
            }
            System.out.println("rata-rata nilai minggu ke-" + (i + 1) + " adalah: " +
                    rataPerminggu[i]);
        }
        System.out.println("rata-rata nilai tertinggi terdapat pada minggu ke-" + mingguKe);
    }

    public static void mahasiswaTerbaik(int[][] arr, String[] nama) {
        int tertinggi = 0;
        int mingguKe = 0;
        String namaMahasiswaTerbaik = "";
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] > tertinggi) {
                    tertinggi = arr[i][j];
                    mingguKe = j + 1;
                    namaMahasiswaTerbaik = nama[i];
                }
            }
        }
        System.out.println("nilai tertinggi " + tertinggi + " terdapat pada minggu ke-" + mingguKe
                + " didapatkan oleh mahasiswa " + namaMahasiswaTerbaik);
    }
}
