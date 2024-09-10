import java.util.Scanner;;

public class Pemilihan2PercobaanDua10 {
    public static void main(String[] args) {
        Scanner input10 = new Scanner(System.in);
        
        double sudut1, sudut2, sudut3, totalSudut;
        System.out.print("masukkan sudut pertama: ");
        sudut1 = input10.nextDouble();
        System.out.print("masukkan sudut kedua: ");
        sudut2 = input10.nextDouble();
        System.out.print("masukkan sudut ketiga: ");
        sudut3 = input10.nextDouble();

        totalSudut = sudut1 + sudut2 + sudut3;

        if(totalSudut == 180){
            if ((sudut1 == sudut2) && (sudut1 == sudut3)) {
                System.out.println("segitiga sama sisi");
            }
            else if((sudut1 == sudut2) || (sudut1 == sudut3) || (sudut2 == sudut3)){
                System.out.println("segitiga sama kaki");
            }
            else if((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 90)){
                System.out.println("segitiga siku siku");
            }else{
                System.out.println("segitiga sembarang");
            }
        }else{
            System.out.println("bukan segitiga");
        }
    }
}
