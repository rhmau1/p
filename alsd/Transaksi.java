package alsd;

public class Transaksi {
    String kode;
    int jumlah, totalHarga, bayar;
    boolean status;

    Transaksi(String kode, int jumlah, int totalHarga, int bayar, boolean status) {
        this.kode = kode;
        this.jumlah = jumlah;
        this.totalHarga = totalHarga;
        this.bayar = bayar;
        this.status = status;
    }

    void tampil() {
        System.out.println("Kode: " + this.kode);
        System.out.println("Jumlah: " + this.jumlah);
        System.out.println("Total Harga: " + this.totalHarga);
        System.out.println("Bayar: " + this.bayar);
        System.out.println("Status: " + this.status);
    }
}
