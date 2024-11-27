import java.util.Scanner;

public class fpb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("masukkan bilangan pertama: ");
        int a = sc.nextInt();
        System.out.println("masukkan bilangan kedua: ");
        int b = sc.nextInt();
        if (a <= 0 && b <= 0) {
            System.out.println("tidak valid");
            return;
        }
        System.out.println("hasil fpb: " + fpb(a, b));
    }

    public static int fpb(int a, int b) {
        int sisaBagi = 0;

        if (a == 0) {
            return b;
        }
        if (b == 0) {
            return a;
        }

        if (is_prima(a) || is_prima(b)) {
            if (a % b == 0) {
                return b;
            }
            if (b % a == 0) {
                return a;
            }
            return 1;
        }
        if (is_prima(a) && is_prima(b)) {
            return 1;
        }
        if (a > b) {
            sisaBagi = a % b;
            while (sisaBagi != 0) {
                b = a;
                a = sisaBagi;
                sisaBagi = b % a;
            }
            return a;
        } else {
            sisaBagi = b % a;
            while (sisaBagi != 0) {
                a = b;
                b = sisaBagi;
                sisaBagi = a % b;
            }
            return b;
        }
    }

    public static boolean is_prima(int bilangan) {
        boolean is_prima = false;
        int jmlDibagi = 0;
        for (int i = 1; i <= bilangan; i++) {
            if (bilangan % i == 0) {
                jmlDibagi += 1;
            }
        }
        if (jmlDibagi == 2) {
            is_prima = true;
        } else {
            is_prima = false;
        }
        return is_prima;
    }
}
