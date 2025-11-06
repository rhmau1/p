import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Kendaraan> inventaris = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        Mobil mobil1 = new Mobil("123ABC", "Mobil 1", 10000, true, true);
        Mobil mobil2 = new Mobil("456DEF", "Mobil 2", 20000, false, true);
        Motor motor1 = new Motor("AS12", "Motor", 12000, true);
        Motor motor2 = new Motor("DF45", "Motor 2", 34000, true);
        Truk truk1 = new Truk("9012SD", "Truk 1", 23000, true, 2);
        Truk truk2 = new Truk("KO1231", "truk 2", 21000, true, 2);

        inventaris.add(truk1);
        inventaris.add(motor1);
        inventaris.add(motor2);
        inventaris.add(mobil1);
        inventaris.add(mobil2);

        int pilihan;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Tampilkan semua kendaraan");
            System.out.println("2. Hitung biaya untuk kendaraan tertentu");
            System.out.println("3. Cari kendaraan berdasarkan jenis");
            System.out.println("0. Keluar");
            System.out.print("Masukkan pilihan: ");

            pilihan = sc.nextInt();
            sc.nextLine(); // flush newline

            switch (pilihan) {
                case 1:
                    for (Kendaraan kendaraan : inventaris) {
                        kendaraan.tampilkanDetail();
                    }
                    break;

                case 2:
                    System.out.print("Input ID kendaraan: ");
                    String id = sc.nextLine();
                    System.out.print("Input jumlah hari: ");
                    int hari = sc.nextInt();
                    sc.nextLine();

                    boolean found = false;
                    for (Kendaraan kendaraan : inventaris) {
                        if (kendaraan.getId().equalsIgnoreCase(id)) {
                            // bikin if lagi untuk cek status tersedianya
                            // setelah ketemu tersedia maka update tersedianya jadi false sebagai tanda
                            // kendaraannya berhasil disewa
                            System.out.println(
                                    "Biaya total untuk " + kendaraan.getId() +
                                            " selama " + hari + " hari: " +
                                            kendaraan.hitungBiayaTotal(hari));
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Kendaraan dengan ID tersebut tidak ditemukan.");
                    }
                    break;

                case 3:
                    System.out.print("Masukkan jenis kendaraan (Mobil/Motor/Truk): ");
                    String jenis = sc.nextLine();

                    boolean adaJenis = false;

                    for (Kendaraan kendaraan : inventaris) {
                        if (jenis.equalsIgnoreCase("Mobil") && kendaraan instanceof Mobil ||
                                jenis.equalsIgnoreCase("Motor") && kendaraan instanceof Motor ||
                                jenis.equalsIgnoreCase("Truk") && kendaraan instanceof Truk) {

                            kendaraan.tampilkanDetail();
                            adaJenis = true;
                        }
                    }

                    if (!adaJenis) {
                        System.out.println("Jenis tidak valid atau tidak ditemukan.");
                    }
                    break;

                case 0:
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }

        } while (pilihan != 0);

        sc.close();
    }
}
