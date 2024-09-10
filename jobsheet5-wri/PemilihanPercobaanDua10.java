import java.util.Scanner;
public class PemilihanPercobaanDua10 {
    public static void main(String[] args) {
        Scanner input10 = new Scanner(System.in);

        System.out.print("nilai uas : ");
        float uas = input10.nextFloat();
        System.out.print("nilai uts : ");
        float uts = input10.nextFloat();
        System.out.print("nilai kuis : ");
        float kuis = input10.nextFloat();
        System.out.print("nilai tugas : ");
        float tugas = input10.nextFloat();

        float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);

        String message = total < 65 ? "remidi" : "lulus";
        String nilaiHuruf = "";
        if (total <= 39) {
            nilaiHuruf = "E";
        } 
        if (total > 39 && total <= 50){
            nilaiHuruf = "D";
        } 
        if (total > 50 && total <= 60){
            nilaiHuruf = "C";
        } 
        if (total > 60 && total <= 65){
            nilaiHuruf = "C+";
        } 
        if (total > 65 && total <= 73){
            nilaiHuruf = "B";
        } 
        if (total > 73 && total <= 80){
            nilaiHuruf = "B+";
        } 
        if (total > 80 && total <= 100){
            nilaiHuruf = "A";
        }

        System.out.println("nilai akhir adalah : "+total + " sehingga " + message + " dan nilai huruf yang didapat adalah " + nilaiHuruf);
    }
}
