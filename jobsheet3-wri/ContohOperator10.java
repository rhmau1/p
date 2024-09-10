public class ContohOperator10 {
public static void main(String[] args) {
    int x = 10;
    System.out.println("x++ = " + x++); //dicetak dulu baru ditambah, jadi yang dicetak dulu nilai x yang awal yaitu 10
    System.out.println("setelah evaluasi, x = " + x); //jadi x yang disini sudah ditambah jadi nilai x nya menjadi 11
    x = 10;
    System.out.println("++x = " + ++x); //ditambah dulu baru dicetak, jadi disini ketika dicetak nilai x nya sudah 11
    System.out.println("setelah evaluasi, x = " + x); //jadi nilai x disini juga sudah menjadi 11
    int y = 12;
    System.out.println(x > y || y == x && y <= x); //11 > 12 false or 12 == 11 false 12 <= 11 false -> false or false and false -> false
    int z = x ^ y; // x = 11, y = 12, x = 1011, y = 1100, x^y adalah operator XOR bitwise, dibandingkan tiap binernya, jika sama maka false, jika beda maka true
    System.out.println("hasil dari x ^ y adalah " + z);
    z %= 2;
    System.out.println("hasil akhir " +z);
}
}

