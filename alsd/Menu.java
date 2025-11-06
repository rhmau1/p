package alsd;

import java.util.Scanner;

public class Menu {
    Scanner input = new Scanner(System.in);

    Makanan dataMakanan[] = {
            new Makanan("001", "Nasi Goreng", 15000, 10),
            new Makanan("002", "Mie Goreng", 15000, 10),
            new Makanan("003", "Bakso", 15000, 10),
            new Makanan("004", "Soto", 15000, 10),
    };

    Transaksi dataTransaksi[] = new Transaksi[0];

    void tampilDataMakanan() {
        for (Makanan makanan : dataMakanan) {
            System.out.println("-------------------");
            makanan.tampil();
        }
    }

    int beli(String kode, int jumlah) {
        int total = 0;
        for (int i = 0; i < dataMakanan.length; i++) {
            if (dataMakanan[i].kode.equalsIgnoreCase(kode)) {
                total = dataMakanan[i].harga * jumlah;
                System.out.println("Total yang harus dibayar adalah: " + total);
                System.out.println("------------------");
                break;
            } else {
                System.out.println("Data tidak ditemukan");
            }
        }
        return total;
    }

    void tambahDataTransaksi(String kode, int jumlah, int totalHarga, int bayar, boolean status) {
        System.out.println("tes");
        if (dataTransaksi.length == 0) {
            dataTransaksi = new Transaksi[1];
            dataTransaksi[0] = new Transaksi(kode, jumlah, totalHarga, bayar, status);
            System.out.println("DATA BARU 1");
        } else {
            Transaksi temp[] = new Transaksi[dataTransaksi.length];
            for (int i = 0; i < dataTransaksi.length; i++) {
                temp[i] = dataTransaksi[i];
            }
            dataTransaksi = new Transaksi[temp.length + 1];
            for (int i = 0; i < dataTransaksi.length; i++) {
                dataTransaksi[i] = temp[i];
            }
            dataTransaksi[dataTransaksi.length - 1] = new Transaksi(kode, jumlah, totalHarga, bayar, status);
            System.out.println("masuk");
        }
        System.out.println(dataTransaksi.length);
    }

    void tampilDataTransaksi() {
        System.out.println("-------------------Data Seluruh Transaksi-------------------");
        System.out.println("length skrg: " + dataTransaksi.length);
        for (Transaksi transaksi : dataTransaksi) {
            transaksi.tampil();
            System.out.println("-------------------");
        }
    }
}
