public class Mobil extends Kendaraan {
    private boolean bensin;

    Mobil(String id, String nama, double biaya, boolean tersedia, boolean bensin) {
        super(id, nama, biaya, tersedia);
        this.bensin = bensin;
    }

    @Override
    protected double hitungBiayaTambahan() {
        return bensin ? getBiayaHarian() * 0.1 : 0;
    }
}
