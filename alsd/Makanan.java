package alsd;

public class Makanan {
    String kode, nama;
    int harga, stok;

    Makanan() {
    };

    Makanan(String kode, String nama, int harga, int stok) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    public void tampil() {
        System.out.println("Kode: " + this.kode);
        System.out.println("Nama: " + this.nama);
        System.out.println("Harga: " + this.harga);
        System.out.println("Stok: " + this.stok);
    }
}
