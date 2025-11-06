import java.util.Scanner;

public class no1KonversiSuhu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan suhu dalam celcius: ");
        double celcius = sc.nextDouble();
        double fahrenheit = ((celcius * 9 / 5) + 32);
        System.out.println("hasil konversi celcius ke fahrenheit: " + fahrenheit);
    }
}
