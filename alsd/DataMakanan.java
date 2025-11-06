package alsd;

public class DataMakanan {
    Makanan[] lisMakanan;
    int idx;

    DataMakanan(int total) {
        lisMakanan = new Makanan[total];
    }

    void tambah(Makanan mkn) {
        if (idx < lisMakanan.length) {
            lisMakanan[idx] = mkn;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    void tampil() {
        for (Makanan mkn : lisMakanan) {
            mkn.tampil();
            System.out.println("------------------");
        }
    }

    void cariNamaMakanan(String key) {
        for (int i = 0; i < lisMakanan.length; i++) {
            if (lisMakanan[i].nama.contains(key)) {
                lisMakanan[i].tampil();
                System.out.println("------------------");
            }
        }
    }
}
