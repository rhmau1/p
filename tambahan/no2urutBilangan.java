import java.util.Scanner;

public class no2urutBilangan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan bilangan pertama: ");
        int a = sc.nextInt();
        System.out.print("masukkan bilangan kedua: ");
        int b = sc.nextInt();
        System.out.print("masukkan bilangan ketiga: ");
        int c = sc.nextInt();

        if (a >= b && a >= c) {
            if (b >= c) {
                System.out.println("urutan: " + c + "-" + b + "-" + a);
            } else {
                System.out.println("urutan: " + b + "-" + c + "-" + a);
            }
        } else if (b >= a && b >= c) {
            if (a >= c) {
                System.out.println("urutan: " + c + "-" + a + "-" + b);
            } else {
                System.out.println("urutan: " + a + "-" + c + "-" + b);
            }
        } else if (c >= a && c >= b) {
            if (a >= b) {
                System.out.println("urutan: " + b + "-" + a + "-" + c);
            } else {
                System.out.println("urutan: " + a + "-" + b + "-" + c);
            }
        } else {
            System.out.println("urutan: " + a + "-" + b + "-" + c);
        }
    }
}
