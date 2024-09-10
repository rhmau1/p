import java.util.Scanner;;

public class Pemilihan2PercobaanSatu10 {
    public static void main(String[] args) {
        Scanner input10 = new Scanner(System.in);
        
        System.out.println("masukkan tahun yang ingin di cek");
        int tahun = input10.nextInt();
        
        // if((tahun % 4 == 0) && (tahun % 100 != 0)){
        //     System.out.println("tahun kabisat");            
        // }else{
        //     System.out.println("bukan tahun kabisat");
        // }

        if (tahun % 400 == 0) {
            System.out.println("Tahun kabisat");
        } else {
            // Cek apakah tahun habis dibagi 100
            if (tahun % 100 == 0) {
                System.out.println("Bukan tahun kabisat");
            } else {
                // Cek apakah tahun habis dibagi 4
                if (tahun % 4 == 0) {
                    System.out.println("Tahun kabisat");
                } else {
                    System.out.println("Bukan tahun kabisat");
                }
            }
        }
    }
}
