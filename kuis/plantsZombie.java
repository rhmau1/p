package kuis;

import java.util.Scanner;

public class plantsZombie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nyawaZombie, seranganZombie, nyawaTanamanLindung, nyawaTanamanSerang, seranganTanamanSerang, ronde = 1;

        System.out.println("Zombie vs Plant");
        System.out.println("============================");
        System.out.println("Status awal pertarungan: ");
        System.out.print("Nyawa Zombie : ");
        nyawaZombie = sc.nextInt();
        System.out.print("Serangan Zombie : ");
        seranganZombie = sc.nextInt();
        System.out.print("Nyawa Tanaman Lindung : ");
        nyawaTanamanLindung = sc.nextInt();
        System.out.print("Nyawa Tanaman Serang : ");
        nyawaTanamanSerang = sc.nextInt();
        System.out.print("Serangan Tanaman Serang : ");
        seranganTanamanSerang = sc.nextInt();
        System.out.println("============================");
        System.out.println("Pertarungan: tanaman vs zombie");
        System.out.println("============================");

        while (nyawaZombie > 0 && nyawaTanamanSerang > 0) {
            System.out.println("============================");
            System.out.println("Ronde " + ronde);
            System.out.println("============================");
            System.out.println("Tanaman penyerang menyerang zombie");
            nyawaZombie -= seranganTanamanSerang;
            System.out.println("Nyawa zombie sekarang: " + nyawaZombie);

            if (nyawaZombie <= 0) {
                System.out.println("Zombie telah mati, tanaman menang");
                return;
            }

            if (nyawaTanamanLindung <= 0) {
                System.out.println("Zombie menyerang tanaman penyerang");
                nyawaTanamanSerang -= seranganZombie;
                System.out.println("Nyawa tanaman penyerang sekarang: " + nyawaTanamanSerang);

                if (nyawaTanamanSerang <= 0) {
                    System.out.println("Tanaman telah hancur, zombie menang");
                    return;
                }
                ronde++;
                continue;
            } else {
                System.out.println("Zombie menyerang tanaman lindung");
                nyawaTanamanLindung -= seranganZombie;
                System.out.println("Nyawa tanaman pelindung sekarang: " + nyawaTanamanLindung);
            }

            ronde++;
        }
    }
}
