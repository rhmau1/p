import java.util.Scanner;
public class tugas2 {
    public static void main(String[] args) {
        Scanner input10 = new Scanner(System.in);

        String jenis;
        int jumlahBuku, diskon;

        System.out.print("masukkan tipe buku : ");
        jenis = input10.nextLine();
        System.out.print("masukkan jumlah buku : ");
        jumlahBuku = input10.nextInt();
        // if(jenis.equalsIgnoreCase("kamus")){
        //     if(jumlahBuku <= 2){
        //         diskon = 10;
        //         System.out.println("jumlah diskon: " + diskon + "%");
        //     }else{
        //         diskon = 10 + 2;
        //         System.out.println("jumlah diskon: " + diskon + "%");
        //     }
        // }else if(jenis.equalsIgnoreCase("novel")){
        //     if(jumlahBuku <= 3){
        //         diskon = 7 + 1;
        //         System.out.println("jumlah diskon: " + diskon + "%");
        //     }else{
        //         diskon = 7 + 2;
        //         System.out.println("jumlah diskon: " + diskon + "%");
        //     }
        // }else if(!(jenis.equalsIgnoreCase("kamus") || jenis.equalsIgnoreCase("novel"))){ 
        //     if(jumlahBuku > 3 ){
        //         diskon = 5;
        //         System.out.println("jumlah diskon: " + diskon + "%");
        //     }else{
        //         diskon = 0;
        //         System.out.println("jumlah diskon: " + diskon + "%");
        //     }
        // }

        if(jenis.equalsIgnoreCase("kamus") && jumlahBuku <= 2){
            diskon = 10;
            System.out.println("jumlah diskon: " + diskon + "%");
        }else if(jenis.equalsIgnoreCase("kamus") && jumlahBuku > 2){
            diskon = 10 + 2;
            System.out.println("jumlah diskon: " + diskon + "%");
        }else if(jenis.equalsIgnoreCase("novel") && jumlahBuku <= 3){
            diskon = 7 + 1;
            System.out.println("jumlah diskon: " + diskon + "%");
        }else if(jenis.equalsIgnoreCase("novel") && jumlahBuku > 3){
            diskon = 7 + 2;
            System.out.println("jumlah diskon: " + diskon + "%");
        }else if(!jenis.equalsIgnoreCase("kamus") && !jenis.equalsIgnoreCase("novel") && jumlahBuku > 3){
            diskon = 5;
            System.out.println("jumlah diskon: " + diskon + "%");
        }else{
            diskon = 0;
            System.out.println("jumlah diskon: " + diskon + "%");
        }
    }
}
