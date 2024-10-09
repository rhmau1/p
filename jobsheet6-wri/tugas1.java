import java.util.Scanner;
public class tugas1 {
    public static void main(String[] args) {
        Scanner input10 = new Scanner(System.in);
        int bil1, bil2, bil3;

        System.out.print("masukkan bilangan pertama : ");
        bil1 = input10.nextInt();
        System.out.print("masukkan bilangan kedua : ");
        bil2 = input10.nextInt();
        System.out.print("masukkan bilangan ketiga : ");
        bil3 = input10.nextInt();

        // if(bil1 > bil2 && bil1 > bil3){
        //     System.out.println("bilangan terbesar adalah : " + bil1);
        // } else if(bil2 > bil1 && bil2 > bil3){
        //     System.out.println("bilangan terbesar adalah : " + bil2);
        // } else if(bil3 > bil1 && bil3 > bil2){  
        //     System.out.println("bilangan terbesar adalah : " + bil3);
        // } else {
        //     System.out.println("tidak ada bilangan terbesar");
        // }

        if(bil1 > bil2){
            if(bil1 > bil3){
                System.out.println("bilangan terbesar adalah : " + bil1);
            } else {
                System.out.println("bilangan terbesar adalah : " + bil3);
            }
        } else {
            if(bil2 > bil3){
                System.out.println("bilangan terbesar adalah : " + bil2);
            } else {
                System.out.println("bilangan terbesar adalah : " + bil3);
            }
        }
    }
}
