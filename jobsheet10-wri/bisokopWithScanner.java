import java.util.Scanner;

public class bisokopWithScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("menu:");
            System.out.println("1. input data penonton");
            System.out.println("2. tampilkan data penonton");
            System.out.println("3. keluar");
            System.out.print("masukkan pilihan: ");

            int pilihan = sc.nextInt();
            sc.nextLine();
            switch (pilihan) {
                case 1:
                    while (true) {
                        System.out.print("masukkan nama: ");
                        String nama = sc.nextLine();
                        System.out.print("masukkan baris: ");
                        int baris = sc.nextInt();
                        System.out.print("masukkan kolom: ");
                        int kolom = sc.nextInt();
                        sc.nextLine();

                        if ((baris - 1) >= penonton.length || (kolom - 1) >= penonton[0].length) {
                            System.out.println("baris / kolom tidak valid");
                            continue;
                        } else if (penonton[baris - 1][kolom - 1] != null) {
                            System.out.println("baris / kolom sudah terisi");
                            continue;
                        } else {
                            penonton[baris - 1][kolom - 1] = nama;
                        }

                        System.out.print("input penonton lainnya? (y/n): ");
                        String next = sc.nextLine();
                        if (next.equalsIgnoreCase("y")) {
                            continue;
                        } else if (next.equalsIgnoreCase("n")) {
                            break;
                        } else {
                            System.out.println("pilihan tidak valid");
                            break;
                        }
                    }
                    break;
                case 2:
                    for (int i = 0; i < penonton.length; i++) {
                        String[] tampilBaris = new String[penonton[i].length];

                        for (int j = 0; j < penonton[0].length; j++) {
                            tampilBaris[j] = (penonton[i][j] == null) ? "***" : penonton[i][j];
                        }
                        System.out
                                .println("penonton pada baris ke-" + (i + 1) + " : " + String.join(", ", tampilBaris));

                    }
                    break;
                case 3:
                    System.out.println("terima kasih");
                    break;
                default:
                    System.out.println("pilihan tidak valid");
                    break;
            }

            if (pilihan == 3 || pilihan < 1 || pilihan > 3) {
                break;
            }
        }
    }
}
