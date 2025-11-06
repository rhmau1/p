public abstract class Kendaraan {
    private String id, nama;
    private double biayaHarian;
    private boolean tersedia;

    Kendaraan(String id, String nama, double biaya, boolean tersedia) {
        this.id = id;
        this.nama = nama;
        this.biayaHarian = biaya;
        this.tersedia = tersedia;
    }

    protected abstract double hitungBiayaTambahan();

    public String getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public double getBiayaHarian() {
        return biayaHarian;
    }

    public boolean isTersedia() {
        return tersedia;
    }

    public double hitungBiayaTotal(int hari) {
        if (hari <= 0) {
            throw new IllegalArgumentException("hari sewa harus positif");
        }
        return (biayaHarian * hari) + hitungBiayaTambahan();
    }

    public void tampilkanDetail() {
        System.out.println("ID:" + id + ", Nama: " + nama + ", Biaya Harian: Rp " + biayaHarian + ", Status: "
                + (tersedia ? "tersedia" : "tidak tersedia"));
    }
}
