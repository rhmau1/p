import java.util.Scanner;

public class matriks {
    static int[][] matriksHasil;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriks1 = new int[3][3];
        int[][] matriks2 = new int[3][3];

        System.out.println("matriks ke 1");
        input(sc, matriks1);
        System.out.println("matriks ke 2");
        input(sc, matriks2);

        System.out.println("transpose");
        transpose(matriks1);
        // determinan
        int determinan = matriks1[0][0] * matriks1[1][1] - matriks1[1][0] * matriks1[0][1];
        System.out.println("determinan: " + determinan);

        System.out.println("perkalian");
        perkalian(matriks1, matriks2);
        printHasil(matriksHasil);
        // System.out.println("penjumlahan");
        // penjumlahan(matriks1, matriks2);
        // printHasil(matriksHasil);
        // System.out.println("pengurangan");
        // pengurangan(matriks1, matriks2);
        // printHasil(matriksHasil);
    }

    public static void input(Scanner sc, int[][] matriks) {
        for (int i = 0; i < matriks.length; i++) {
            for (int j = 0; j < matriks[0].length; j++) {
                System.out.print("Masukkan angka baris ke-" + (i + 1) + " kolom ke-" + (j + 1) + " : ");
                matriks[i][j] = sc.nextInt();
            }
        }
    }

    public static void transpose(int[][] matriks) {
        int[][] temp = new int[matriks[0].length][matriks.length];
        for (int i = 0; i < matriks.length; i++) {
            for (int j = 0; j < matriks[0].length; j++) {
                temp[j][i] = matriks[i][j];
            }
        }
        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < temp[0].length; j++) {
                System.out.print(temp[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void perkalian(int[][] matriks1, int[][] matriks2) {
        matriksHasil = new int[matriks1.length][matriks2[0].length];
        for (int i = 0; i < matriks1.length; i++) {
            for (int j = 0; j < matriks2[0].length; j++) {
                matriksHasil[i][j] = 0;
                for (int k = 0; k < matriks1[0].length; k++) {
                    matriksHasil[i][j] += matriks1[i][k] * matriks2[k][j];
                }
            }
        }
    }

    public static void penjumlahan(int[][] matriks1, int[][] matriks2) {
        for (int i = 0; i < matriksHasil.length; i++) {
            for (int j = 0; j < matriksHasil[0].length; j++) {
                matriksHasil[i][j] = matriks1[i][j] + matriks2[i][j];
            }
        }
    }

    public static void pengurangan(int[][] matriks1, int[][] matriks2) {
        for (int i = 0; i < matriksHasil.length; i++) {
            for (int j = 0; j < matriksHasil[0].length; j++) {
                matriksHasil[i][j] = matriks1[i][j] - matriks2[i][j];
            }
        }
    }

    public static void printHasil(int[][] matriksHasil) {
        for (int i = 0; i < matriksHasil.length; i++) {
            for (int j = 0; j < matriksHasil[0].length; j++) {
                System.out.print(matriksHasil[i][j] + " ");
            }
            System.out.println();
        }
    }
}
