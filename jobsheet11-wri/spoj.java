import java.util.Scanner;

public class spoj {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            int input;

            System.out.print("input bilangan: ");
            input = sc.nextInt();
            int length = 0;
            if (input == 42) {
                break;
            } else {
                length++;
                int[] arr = new int[length];
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = input;
                }
                for (int j = 0; j < arr.length; j++) {
                    System.out.println(arr[j]);
                }
            }

        }

    }
}
