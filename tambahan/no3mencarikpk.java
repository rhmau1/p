import java.util.Scanner;

public class no3mencarikpk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan bilangan pertama: ");
        int bil1 = sc.nextInt();
        System.out.print("masukkan bilangan kedua: ");
        int bil2 = sc.nextInt();

        int kpk;
        if (bil1 > bil2) {
            kpk = bil1;
        } else {
            kpk = bil2;
        }
        while (true) {
            if ((kpk % bil1 == 0) && (kpk % bil2 == 0)) {
                System.out.println("kpk dari " + bil1 + " dan " + bil2 + " adalah: " + kpk);
                break;
            }
            kpk++;
        }
    }
}
