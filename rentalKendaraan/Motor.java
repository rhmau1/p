public class Motor extends Kendaraan {
    Motor(String id, String nama, double biaya, boolean tersedia) {
        super(id, nama, biaya, tersedia);
    }

    @Override
    protected double hitungBiayaTambahan() {
        return 20000;
    }
}
