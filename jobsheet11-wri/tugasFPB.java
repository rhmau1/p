import java.util.Scanner;
public class tugasFPB {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] jmlBil = new int[2];
        
        for (int i = 0; i < jmlBil.length; i++) {
            System.out.print("Masukkan bilangan ke-" + (i+1) + " : ");
            jmlBil[i] = sc.nextInt();
        }
        int fpb = proses(jmlBil[0], jmlBil[1]);
        System.out.println("FPB dari " + jmlBil[0] + " dan " + jmlBil[1] + " adalah " + fpb );
    }
    public static int proses(int a, int b) {
        while (b != 0) {
        // perulangan akan berhenti dilakukan saat b == 0
            int sisa = a % b;
            // variabel sisa akan menyimpan sisa hasil bagi dari pembagian a dan b
            a = b;
            // variabel a diperbarui dengan nilai b
            b = sisa;
            // variabel b diperbarui dengan nilai sisa
        }
        return a;
        // mengembalikan nilai a, yang merupakan FPB dari bilangan awal
    }
}