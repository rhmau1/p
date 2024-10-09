import java.util.Scanner;;

public class Kafe {
    public static void main(String[] args) {
        Scanner input10 = new Scanner(System.in);

        boolean keanggotaan;
        String menu;
        char ukuranCup;
        int jumlah;
        double diskon, totalHarga, nominalBayar;        

        System.out.print("masukkan menu: ");
        menu = input10.nextLine();
        System.out.print("masukkan ukuran cup: ");
        ukuranCup = input10.next().charAt(0);
        System.out.print("masukkan jumlah: ");
        jumlah = input10.nextInt();
        System.out.print("masukkan keanggotaan (true/false) : "); 
        keanggotaan = input10.nextBoolean();    

        double hargaMenu = 0;
        switch (menu.toLowerCase()) {
            case "kopi":
                hargaMenu = 12000;
                break;
            case "teh":
                hargaMenu = 7000;
                break;
            case "coklat":
                hargaMenu= 20000;
                break;            
        }

        totalHarga = hargaMenu * jumlah;

        switch (ukuranCup) {
            case 'S':                
                break;
            case 'M':
                totalHarga += 0.25 * totalHarga;
                break;
            case 'L': 
                totalHarga += 0.4 * totalHarga;   
                break;         
        }

        diskon = keanggotaan ? 0.1 : 0;
        nominalBayar = totalHarga - (diskon * totalHarga);

        System.out.println("item pembelian: " + jumlah + menu + " dengan ukuran cup " + ukuranCup);
        System.out.println("nominal bayar: " + nominalBayar);
    }
}
