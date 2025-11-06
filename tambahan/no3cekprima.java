import java.util.Scanner;

public class no3cekprima {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan bilangan yang ingin dicek: ");
        int bil = sc.nextInt();
        boolean isPrima = true;
        if (bil < 2) {
            isPrima = false;
        } else {
            for (int i = 2; i <= bil / 2; i++) {
                if (bil % i == 0) {
                    isPrima = false;
                } else {
                    isPrima = true;
                }
            }
        }
        if (isPrima) {
            System.out.println(bil + " adalah prima");
        } else {
            System.out.println(bil + " adalah bukan prima");
        }
    }
}
