import java.util.Scanner;;

public class Pemilihan2PercobaanDua10 {
    public static void main(String[] args) {
        Scanner input10 = new Scanner(System.in);
        
        double sudut1, sudut2, sudut3, totalSudut;
        System.out.println("masukkan sudut pertama");
        sudut1 = input10.nextDouble();
        System.out.println("masukkan sudut kedua");
        sudut2 = input10.nextDouble();
        System.out.println("masukkan sudut ketiga");
        sudut3 = input10.nextDouble();

        totalSudut = sudut1 + sudut2 + sudut3;

        if(totalSudut == 180){
            if((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 90)){
                System.out.println("segitiga siku siku");
            }else{
                System.out.println("bukan segitiga siku-siku");
            }
        }else{
            System.out.println("bukan segitiga");
        }
    }
}
