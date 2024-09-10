import java.util.Scanner;
public class PemilihanPercobaanSatu10 {
    public static void main(String[] args) {
        Scanner input10 = new Scanner(System.in);
        System.out.println("masukkan angka : ");
        int angka = input10.nextInt();

        String check = (angka % 2 == 0) ? "genap" : "ganjil" ;
        System.out.println(check);
        // if(angka % 2 == 0)
        //     System.out.println("Angka " + angka + " bilangan genap");
        // else 
        //     System.out.println("Angka " + angka + " bilangan ganjil");
    }
}
