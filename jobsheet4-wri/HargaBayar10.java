import java.util.Scanner;
public class HargaBayar10 {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int harga, jumlah;
    double disc, total, bayar, jmlDisc;

    String merkBuku;
    int halamanBuku;

    System.out.println("masukkan harga barang yang dibeli");
    harga = input.nextInt();
    System.out.println("masukkan jumlah-jumlah barang yang dibeli");
    jumlah = input.nextInt();

    System.out.println("masukkan nama merk buku yang ingin dibeli:");
    merkBuku = input.nextLine();

    System.out.println("masukkan jumlah halaman buku");
    halamanBuku = input.nextInt();

    System.out.println("Masukkan persentase diskon (misalnya, 0.1 untuk 10%):");
    disc = input.nextDouble();

    total = harga*jumlah;
    jmlDisc = total*disc;
    bayar = total - jmlDisc;

    System.out.println("merk buku yang anda beli adalah " + merkBuku);
    System.out.println("jumlah halaman buku yang anda beli adalah " + halamanBuku);
    System.out.println("diskon yang anda dapatkan adalah: " + jmlDisc);
    System.out.println("jumlah yang harus anda bayar adalah: " +bayar);
}
}

/*
 * tambah input merk buku
 * jumlah halaman buku
 * ubah diskon jadi inputan juga
 */
