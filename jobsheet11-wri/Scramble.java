import java.util.Scanner;

public class Scramble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string (minimum 4 characters): ");
        String input = sc.nextLine();
        sc.close();

        if (input.length() < 4) {
            System.out.println("String must be at least 4 characters long.");
            return;
        }

        char[] chars = input.toCharArray();

        int start = 0;
        int end = chars.length - 1;

        while (start < end) {
            if (start + 1 < end) {
                char temp = chars[start];
                chars[start] = chars[end - 1];
                chars[end - 1] = temp;

                temp = chars[start + 1];
                chars[start + 1] = chars[end];
                chars[end] = temp;
            }

            start += 2;
            end -= 2;
        }

        String scrambledString = new String(chars);
        System.out.println("Scrambled output: " + scrambledString);
    }
}
