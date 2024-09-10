import java.util.Scanner;;
public class PemilihanPercobaanTiga10 {
    public static void main(String[] args) {
        Scanner input10 = new Scanner(System.in);
        double angka1, angka2, hasil;
        char operator;

        System.out.println("masukkan angka pertama : ");
        angka1 = input10.nextDouble();
        System.out.println("masukkan angka kedua");
        angka2 = input10.nextDouble();
        System.out.println("masukkan operator ( + - * / )");
        operator = input10.next().charAt(0);

        switch (operator) {
            case '+':
                hasil = angka1 + angka2;
                System.out.println(angka1 + "+" + angka2 + "=" + hasil);
                break;
            case '-':
                hasil = angka1 - angka2;
                System.out.println(angka1 + "-" + angka2 + "=" + hasil);
                break;
            case '*' : 
                hasil = angka1 * angka2;
                System.out.println(angka1 + "*" + angka2 + "=" + hasil);
                break;
            case '/':
                hasil = angka1 / angka2;
                System.out.println(angka1 + "/" + angka2 + "=" + hasil);
                break;
            default:
                System.out.println("invalid operator");
                break;
        }
    }
}

