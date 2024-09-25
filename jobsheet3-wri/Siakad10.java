import java.util.Scanner;;

public class Siakad10 {
    public static void main(String[] args) {
        Scanner input10 = new Scanner(System.in);
        String nama, nim, kelas;
        // char kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUjian, nilaiAkhir, uts, uas;        

        System.out.print("masukkan nama : ");
        nama = input10.nextLine();
        System.out.print("masukkan nim : ");
        nim = input10.nextLine();
        System.out.print("masukkan kelas : ");
        // kelas = input10.nextLine().charAt(0);
        kelas = input10.nextLine();
        System.out.print("masukkan nomor absen : ");
        absen = input10.nextByte();
        System.out.print("masukkan nilai kuis : ");
        nilaiKuis = input10.nextDouble();
        System.out.print("masukkan nilai tugas : ");
        nilaiTugas = input10.nextDouble();
        // System.out.print("masukkan nilai ujian : ");
        // nilaiUjian = input10.nextDouble();

        System.out.print("masukkan nilai uts : ");
        uts = input10.nextDouble();
        System.out.print("masukkan nilai uas : ");
        uas = input10.nextDouble();

        // nilaiAkhir = (nilaiKuis + nilaiTugas + nilaiUjian) / 3;
        nilaiAkhir = ((nilaiKuis*0.2) + (nilaiTugas*0.15) + (uts*0.3) + (uas*0.35));

        System.out.println("mahasiswa dengan nama " + nama + " (NIM " + nim + ") Kelas " + kelas + " nomor absen " + absen );
        System.out.println("nilai akhir : " +nilaiAkhir);
    }
}
