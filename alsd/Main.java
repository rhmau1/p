package alsd;

import java.util.Scanner;

public class Main {
    static Makanan dataMakanan[] = {
            new Makanan("001", "Nasi Goreng", 12000, 10),
            new Makanan("002", "Mie Goreng", 13000, 10),
            new Makanan("003", "Bakso", 14000, 10),
            new Makanan("004", "Soto", 15000, 10),
    };

    static Transaksi dataTransaksi[] = new Transaksi[0];

    static void tampilDataMakanan() {
        System.out.printf("%-10s %-20s %-10s %-10s\n", "Kode", "Nama", "Harga", "Stok");
        for (int i = 0; i < dataMakanan.length; i++) {
            System.out.printf("%-10s %-20s %-10s %-10s\n", dataMakanan[i].kode, dataMakanan[i].nama,
                    dataMakanan[i].harga, dataMakanan[i].stok);
        }
    }

    static boolean cekKode(String kode) {
        boolean found = false;
        for (int i = 0; i < dataMakanan.length; i++) {
            if (dataMakanan[i].kode.equalsIgnoreCase(kode)) {
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Kode tidak ditemukan");
        }
        return found;
    }

    static int beli(String kode, int jumlah) {
        int total = 0;
        for (int i = 0; i < dataMakanan.length; i++) {
            if (dataMakanan[i].kode.equalsIgnoreCase(kode)) {
                total = dataMakanan[i].harga * jumlah;
                System.out.println("Total yang harus dibayar adalah: " + total);
                System.out.println("------------------");
                break;
            }
        }
        return total;
    }

    static void tambahDataTransaksi(String kode, int jumlah, int totalHarga, int bayar, boolean status) {
        if (dataTransaksi.length == 0) {
            dataTransaksi = new Transaksi[1];
            dataTransaksi[0] = new Transaksi(kode, jumlah, totalHarga, bayar, status);
        } else {
            Transaksi temp[] = new Transaksi[dataTransaksi.length];
            for (int i = 0; i < dataTransaksi.length; i++) {
                temp[i] = dataTransaksi[i];
            }
            dataTransaksi = new Transaksi[temp.length + 1];
            for (int i = 0; i < temp.length; i++) {
                dataTransaksi[i] = temp[i];
            }
            dataTransaksi[dataTransaksi.length - 1] = new Transaksi(kode, jumlah, totalHarga, bayar, status);
        }
    }

    static void tampilDataTransaksi() {
        System.out.println("-------------------Data Seluruh Transaksi-------------------");
        System.out.printf("%-10s %-10s %-15s %-15s %-10s\n", "Kode", "Jumlah", "Total Harga", "Bayar",
                "Status");
        for (int i = 0; i < dataTransaksi.length; i++) {
            System.out.printf("%-10s %-10s %-15s %-15s %-10s\n", dataTransaksi[i].kode, dataTransaksi[i].jumlah,
                    dataTransaksi[i].totalHarga, dataTransaksi[i].bayar, dataTransaksi[i].status);
        }
        // for (Transaksi transaksi : dataTransaksi) {
        // transaksi.tampil();
        // System.out.println("-------------------");
        // }
    }

    static void urutkanDataTransaksi() {
        for (int i = 1; i < dataTransaksi.length; i++) {
            Transaksi temp = dataTransaksi[i];
            int j = i;
            while (j > 0 && dataTransaksi[j - 1].totalHarga < temp.totalHarga) {
                dataTransaksi[j] = dataTransaksi[j - 1];
                j--;
            }
            dataTransaksi[j] = temp;
            // while (j > 0 && dataTransaksi[j - 1].usia < temp.usia) { DESC
        }
        for (Transaksi transaksi : dataTransaksi) {
            transaksi.tampil();
            System.out.println("-------------------");
        }
    }

    static void cariMakanan(String key) {
        boolean found = false;
        for (int i = 0; i < dataMakanan.length; i++) {
            if (dataMakanan[i].nama.toLowerCase().contains(key)) {
                dataMakanan[i].tampil();
                found = true;
                System.out.println("------------------");
            }
        }
        if (!found) {
            System.out.println("Makanan tidak tersedia");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Menu");
            System.out.println("1. Tampilkan menu makanan");
            System.out.println("2. Beli makanan");
            System.out.println("3. Tampilkan seluruh data transaksi");
            System.out.println("4. Cari menu makanan");
            System.out.println("5. Urutkan data transaksi");
            System.out.println("6. Keluar");

            System.out.print("masukkan pilihan anda: ");
            int pilihan = input.nextInt();
            input.nextLine();
            switch (pilihan) {
                case 1:
                    System.out.println("Tampilkan menu makanan");
                    tampilDataMakanan();
                    break;
                case 2:
                    System.out.println("Beli makanan");
                    System.out.print("Masukkan kode makanan: ");
                    String kode = input.nextLine();
                    boolean found = cekKode(kode);
                    if (!found) {
                        break;
                    }
                    System.out.print("Masukkan jumlah: ");
                    int jumlah = input.nextInt();
                    int totalHarga = beli(kode, jumlah);
                    System.out.print("Masukkan nominal pembayaran: ");
                    int nominal = input.nextInt();
                    boolean status;
                    if (totalHarga > nominal) {
                        System.out.println("Uang anda tidak cukup");
                        System.out.println("Pembelian gagal");
                        status = false;
                    } else if (totalHarga == nominal) {
                        System.out.println("Uang anda pas");
                        System.out.println("Pembelian berhasil");
                        status = true;
                    } else {
                        int kembalian = nominal - totalHarga;
                        System.out.println("Kembalian anda adalah: " + kembalian);
                        System.out.println("Pembelian berhasil");
                        status = true;
                    }
                    System.out.println("------------------");
                    tambahDataTransaksi(kode, jumlah, totalHarga, nominal, status);
                    break;
                case 3:
                    System.out.println("Tampilkan data transaksi");
                    tampilDataTransaksi();
                    break;
                case 4:
                    System.out.println("Cari menu makanan");
                    System.out.print("Apa yang anda cari: ");
                    String cari = input.nextLine();
                    cariMakanan(cari.toLowerCase());
                    break;
                case 5:
                    System.out.println("Urutkan data transaksi");
                    urutkanDataTransaksi();
                    break;
                case 6:
                    System.out.println("Keluar");
                    return;
                default:
                    System.out.println("Pilihan tidak tersedia");
                    break;
            }

        }

    }
}
