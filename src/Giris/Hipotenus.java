package Giris;
import java.util.Scanner;

public class Hipotenus {
    public static void main(String[] args) {
        /*int kenar1, kenar2, kenar3, cevre = 2;
        Scanner inp = new Scanner(System.in);
        System.out.println("Kenar uzunlukları giriniz: ");
        kenar1 = inp.nextInt();
        kenar2=inp.nextInt();
        kenar3 = inp.nextInt();
        cevre = ()*/

        int a,b;
        double c;

        Scanner girdi = new Scanner(System.in);
        System.out.print("1. Kenarı Giriniz: ");
        a = girdi.nextInt();
        System.out.print("2. Kenarı Giriniz: ");
        b = girdi.nextInt();

        c = Math.sqrt((a*a) + (b*b));
        System.out.println("Hipotenüs : " + c);

    }
}
