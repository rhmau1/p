public class namaLengkap {
    public static void main(String[] args) {
        char[] karakter = { 'F', 'i', 'j', 'r', 'i', 'a', 't', 'i', 'R', 'a', 'h', 'm', 'a', 't', 'u', 'r', 'R', 'i',
                'z', 'q', 'i' };
        char arr[][] = new char[8][5];
        int indexKarakter = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = karakter[indexKarakter];
                indexKarakter = (indexKarakter + 1) % karakter.length;

            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
