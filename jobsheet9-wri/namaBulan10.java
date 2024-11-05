import java.util.Scanner;

public class namaBulan10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String namaBulan[] = { "jan", "feb", "mar", "apr", "mei", "jun", "jul", "agust", "sept", "okt", "nov", "des" };
        System.out.print("masukkan angka antara 1 - 12: ");
        int angka = sc.nextInt();

        if (angka > 0 && angka < 13) {
            System.out.println(namaBulan[angka - 1]);
        } else {
            System.out.println("angka harus antara 1 - 12");
        }
    }
}
