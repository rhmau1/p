public class ContohVariabel10 {
    public static void main(String[] args) {
        String salahSatuHobbySayaAdalah = "mendengarkan musik";
        boolean isPandai = true;
        char jenisKelamin = 'P';
        int _umurSayaSekarang = 17;
        double $ipk = 4.00, tinggi = 151.598;
        System.out.println(salahSatuHobbySayaAdalah);
        System.out.println("Apakah pandai?" + isPandai);
        System.out.println("Jenis kelamin:" + jenisKelamin);
        System.out.println("Umurku saat ini:" + _umurSayaSekarang);
        System.out.println(String.format("Saya berumur %d, dengan tinggi badan %.2f dan ipk", _umurSayaSekarang, tinggi, $ipk));              
    }
}
