public class Array1d {
    public static void main(String[] args) {
        char[] arr = new char[15];
        char karakter = 'A';
        for (int i = 0; i < arr.length; i++) {
            arr[i] = karakter;
            karakter++;
        }

        int index = 0;

        for (int i = 1; i <= 5; i++) {
            int s = 5 - i;
            for (int j = 1; j <= s; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(arr[index]);
                index++;
            }
            System.out.println();
        }
    }
}
