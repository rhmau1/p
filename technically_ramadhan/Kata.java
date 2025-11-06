public class Kata {
    public static int[] countPositivesSumNegatives(int[] input) {
        int count = 0;
        int sum = 0;
        int[] hasil = new int[2];
        if (input.length == 0) {
            return null;
        }
        for (int i = 0; i < input.length; i++) {
            if (input[i] > 0) {
                count++;
            } else {
                sum += input[i];
            }
        }
        hasil[0] = count;
        hasil[1] = sum;
        return hasil; // return an array with count of positives and sum of negatives
    }
}