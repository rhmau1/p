
import java.util.Scanner;

public class rpgGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nyawaPemain, nyawaAwalPemain, nyawaMusuh, kekuatanPemain, kekuatanMusuh, ronde = 1;
        String choice;

        System.out.print("input nyawa awal pemain: ");
        nyawaAwalPemain = sc.nextInt();
        System.out.print("input nyawa musuh: ");
        nyawaMusuh = sc.nextInt();
        System.out.print("input kekuatan pemain: ");
        kekuatanPemain = sc.nextInt();
        System.out.print("input kekuatan musuh: ");
        kekuatanMusuh = sc.nextInt();

        nyawaPemain = nyawaAwalPemain;
        while (nyawaMusuh > 0 && nyawaPemain > 0) {
            System.out.println("Ronde " + ronde);
            System.out.println("pemain menyerang musuh");
            nyawaMusuh -= kekuatanPemain;
            System.out.println("nyawa musuh tersisa: " + nyawaMusuh);
            if (nyawaMusuh <= 0) {
                System.out.println("musuh kalah. Pemain menang");
                return;
            }
            System.out.println("musuh menyerang pemain");
            nyawaPemain -= kekuatanMusuh;
            System.out.println("nyawa pemain tersisa: " + nyawaPemain);

            if (nyawaPemain <= 0) {
                System.out.println("pemain kalah. musuh menang");
                return;
            }
            if (nyawaPemain <= nyawaAwalPemain * 0.2) {
                System.out.println("pemain dalam keadaan kritis");
                System.out.print("apakah anda ingin melarikan diri? (ya/tidak): ");
                choice = sc.next();
                if (choice.equalsIgnoreCase("tidak")) {
                    ronde++;
                    continue;
                } else if (choice.equalsIgnoreCase("ya")) {
                    System.out.println("permainan berakhir");
                    break;
                } else {
                    System.out.println("input tidak valid");
                }
            }
            ronde++;
        }
    }
}
