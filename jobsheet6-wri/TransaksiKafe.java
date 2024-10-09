import java.util.Scanner;
public class TransaksiKafe {
    public static void main(String[] args) {
        Scanner input10 = new Scanner(System.in);

        String member;
        String qris;
        int pilihan_menu;
        double diskon, harga, total_bayar; 
        System.out.println("===========================");
        System.out.println("=======MENU KAFE JTI=======");
        System.out.println("===========================");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket bundling (Ricebowl + ice tea)");
        System.out.println("===========================");
        System.out.print("masukkan angka dari menu yang dipilih: ");
        pilihan_menu = input10.nextInt();
        input10.nextLine();
        System.out.print("Apakah punya member (y/n): ");
        member = input10.nextLine();
        System.out.print("Apakah ingin menggunakan qris (y/n): ");
        qris = input10.nextLine();
        System.out.println("===========================");

        if(qris.equalsIgnoreCase("y")){
            System.out.println("mendapatkan potongan harga 1000");
            if(member.equalsIgnoreCase("y")){
                diskon = 0.10;
                System.out.println("besar diskon = 10%");
                if (pilihan_menu == 1) {
                    harga = 14000;
                    System.out.println("harga ricebowl = " + harga);
                }else if (pilihan_menu == 2){
                    harga = 3000;
                    System.out.println("harga ice tea = " + harga);
                }else if (pilihan_menu == 3){
                    harga = 15000;
                    System.out.println("harga bundling = " + harga);
                }else{
                    System.out.println("masukkan pilihan menu dengan benar");
                    return;
                }
    
                total_bayar = harga - (harga * diskon);
                System.out.println("total bayar setelah diskon:  "+ total_bayar);
                total_bayar = total_bayar - 1000;
                System.out.println("total bayar setelah diskon dan potongan 1000:  "+ total_bayar);
            } else if(member.equalsIgnoreCase("n")){
                if (pilihan_menu == 1) {
                    harga = 14000;
                    System.out.println("harga ricebowl = " + harga);
                }else if (pilihan_menu == 2){
                    harga = 3000;
                    System.out.println("harga ice tea = " + harga);
                }else if (pilihan_menu == 3){
                    harga = 15000;
                    System.out.println("harga bundling = " + harga);
                }else{
                    System.out.println("masukkan pilihan menu dengan benar");
                    return;
                }
                System.out.println("total bayar = " + harga);
                harga = harga - 1000;
                System.out.println("total bayar setelah potongan 1000:  "+ harga);
            }else{
                System.out.println("member tidak valid");
            }
        }else if(qris.equalsIgnoreCase("n")){
            System.out.println("tidak menggunakan qris");
            if(member.equalsIgnoreCase("y")){
                diskon = 0.10;
                System.out.println("besar diskon = 10%");
                if (pilihan_menu == 1) {
                    harga = 14000;
                    System.out.println("harga ricebowl = " + harga);
                }else if (pilihan_menu == 2){
                    harga = 3000;
                    System.out.println("harga ice tea = " + harga);
                }else if (pilihan_menu == 3){
                    harga = 15000;
                    System.out.println("harga bundling = " + harga);
                }else{
                    System.out.println("masukkan pilihan menu dengan benar");
                    return;
                }
    
                total_bayar = harga - (harga * diskon);
                System.out.println("total bayar setelah diskon:  "+ total_bayar);
            } else if(member.equalsIgnoreCase("n")){
                if (pilihan_menu == 1) {
                    harga = 14000;
                    System.out.println("harga ricebowl = " + harga);
                }else if (pilihan_menu == 2){
                    harga = 3000;
                    System.out.println("harga ice tea = " + harga);
                }else if (pilihan_menu == 3){
                    harga = 15000;
                    System.out.println("harga bundling = " + harga);
                }else{
                    System.out.println("masukkan pilihan menu dengan benar");
                    return;
                }
                System.out.println("total bayar = " + harga);
            }else{
                System.out.println("member tidak valid");
            }
        }else{
            System.out.println("masukkan pilihan qris dengan benar");
            return;
        }
        
        System.out.println("===========================");
    }
}
