public class Truk extends Kendaraan {
    private double muatanMaks;

    Truk(String id, String nama, double biaya, boolean tersedia, double muatan) {
        super(id, nama, biaya, tersedia);
        this.muatanMaks = muatan;
    }

    @Override
    protected double hitungBiayaTambahan() {
        return muatanMaks * 50000;
    }
}
