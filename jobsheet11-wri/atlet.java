import java.util.Scanner;

public class atlet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahPoliteknik;

        System.out.print("Masukkan jumlah politeknik yang mendaftar: ");
        jumlahPoliteknik = sc.nextInt();

        String[][] data = new String[4][5];
        int i = 0;
        while (i < jumlahPoliteknik) {
            // Input nama atlet untuk setiap cabang olahraga
            for (int cabor = 0; cabor < data.length; cabor++) {
                String namaCabor = "";
                if (cabor == 0) {
                    namaCabor = "Badminton";
                } else if (cabor == 1) {
                    namaCabor = "Tenis Meja";
                } else if (cabor == 2) {
                    namaCabor = "Basket";
                } else if (cabor == 3) {
                    namaCabor = "Bola Voli";
                }
                for (int atlet = 0; atlet < data[0].length; atlet++) {
                    System.out.print("Masukkan nama atlet ke " + (atlet + 1) + " untuk cabang " +
                            namaCabor + " dari politeknik ke " + (i + 1) + ": ");
                    data[cabor][atlet] = sc.next();
                }
            }

            // Mengurutkan nama atlet secara ascending di setiap cabang olahraga
            for (int cabor = 0; cabor < data.length; cabor++) {
                for (int j = 0; j < data[0].length - 1; j++) {
                    for (int k = 0; k < data[0].length - 1 - j; k++) {
                        // Bandingkan nama atlet di posisi k dengan posisi k+1
                        if (data[cabor][k].compareTo(data[cabor][k + 1]) > 0) {
                            // Tukar nama atlet jika tidak dalam urutan ascending
                            String temp = data[cabor][k];
                            data[cabor][k] = data[cabor][k + 1];
                            data[cabor][k + 1] = temp;
                        }
                    }
                }
            }

            // Menampilkan nama atlet yang sudah diurutkan
            System.out.println("\nData atlet yang sudah diurutkan secara ascending:");
            for (int j = 0; j < data.length; j++) {
                String namaCabor = "";
                switch (j) {
                    case 0:
                        namaCabor = "Badminton";
                        break;
                    case 1:
                        namaCabor = "Tenis Meja";
                        break;
                    case 2:
                        namaCabor = "Basket";
                        break;
                    case 3:
                        namaCabor = "Bola Voli";
                        break;
                    default:
                        break;
                }
                System.out.println("Cabang " + namaCabor + ": ");
                for (int k = 0; k < data[0].length; k++) {
                    System.out.print(data[j][k] + " ");
                }
                System.out.println();
            }
            i++;
        }
    }
}
