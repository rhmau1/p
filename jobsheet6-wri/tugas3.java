import java.util.Scanner;
public class tugas3 {
    public static void main(String[] args) {
        Scanner input10 = new Scanner(System.in);
        int harga;

        System.out.println("masukkan merk: ");
        String merk = input10.nextLine();
        System.out.println("masukkan kategori: ");
        String kategori = input10.nextLine();
        System.out.println("masukkan ukuran: ");
        int ukuran = input10.nextInt();

        if (merk.equalsIgnoreCase("Specs")) {
            if(kategori.equalsIgnoreCase("slip on")){
                if(ukuran >= 36){
                    if(ukuran <= 40){
                        harga = 800000;
                        System.out.println("harga: "+harga);
                    }else{
                        System.out.println("ukuran invalid");
                    }
                }else{
                    System.out.println("ukuran invalid");
                }
            }else if(kategori.equalsIgnoreCase("high top")){
                if(ukuran >= 40){
                    if(ukuran <= 44){
                        harga = 1200000;
                        System.out.println("harga: "+harga);
                    }else{
                        System.out.println("ukuran invalid");
                    }
                }else{
                    System.out.println("ukuran invalid");
                }
            }else{
                System.out.println("kategori invalid");
            }
        }else if(merk.equalsIgnoreCase("910")){
            if(kategori.equalsIgnoreCase("woman")){
                if(ukuran >= 36){
                    if(ukuran <= 41){
                        harga = 1000000;
                        System.out.println("harga: "+harga);
                    }else{
                        System.out.println("ukuran invalid");
                    }
                }else{
                    System.out.println("ukuran invalid");
                }
            }else if(kategori.equalsIgnoreCase("man")){
                if(ukuran >= 41){
                    if(ukuran <= 44){
                        harga = 1800000;
                        System.out.println("harga: "+harga);
                    }else{
                        System.out.println("ukuran invalid");
                    }
                }else{
                    System.out.println("ukuran invalid");
                }
            }else{
                System.out.println("kategori invalid");
            }
        }else if(merk.equalsIgnoreCase("ortus")){
            if(kategori.equalsIgnoreCase("kids")){
                if(ukuran >= 36){
                    if(ukuran <= 40){
                        harga = 750000;
                        System.out.println("harga: "+harga);
                    }else{
                        System.out.println("ukuran invalid");
                    }
                }else{
                    System.out.println("ukuran invalid");
                }
            }else if(kategori.equalsIgnoreCase("adult")){
                if(ukuran >= 40){
                    if(ukuran <= 44){
                        harga = 1500000;
                        System.out.println("harga: "+harga);
                    }else{
                        System.out.println("ukuran invalid");
                    }
                }else{
                    System.out.println("ukuran invalid");
                }
            }else{
                System.out.println("kategori invalid");
            }
        }else{
            System.out.println("merk invalid");
        }
    }
}
