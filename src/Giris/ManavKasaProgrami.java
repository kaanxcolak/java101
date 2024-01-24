package Giris;

import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args) {
        double armut = 2.14,elma = 3.67, domates = 1.11,muz=0.95,patlican=5.00;
        double a,e,d,m,p,toplam;
        Scanner inp = new Scanner(System.in);
        System.out.print("Armut Kaç Kilo? ");
        a = inp.nextInt();

        System.out.print("Elma Kaç Kilo? ");
        e = inp.nextInt();

        System.out.print("Domates Kaç Kilo? ");
        d = inp.nextInt();

        System.out.print("Muz Kaç Kilo? ");
        m = inp.nextInt();

        System.out.print("Patlican Kaç Kilo? ");
        p = inp.nextInt();


        toplam = armut * a + elma * e + domates * d + muz * m + patlican * p ;
        System.out.println("Toplam: " + toplam);

    }
}
