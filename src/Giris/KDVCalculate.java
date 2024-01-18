package Giris;

import java.util.Scanner;

public class KDVCalculate {
    public static void main(String[] args) {
        /*double fiyat;
        Scanner input = new Scanner(System.in);
        fiyat = input.nextDouble();
        System.out.println("KDV'siz Fiyat: " + fiyat);
        double kdvFiyat = fiyat + fiyat * 0.18;
        System.out.println("KDV'li Fiyat: " + kdvFiyat);*/
        //------------------------------------------------------
        double tutar, kdvOran = 0.18, kdvTutar,kdvliTutar;
        Scanner inp = new Scanner(System.in);
        System.out.print("Ücret Tutarını Giriniz: ");
        tutar = inp.nextDouble();
        kdvTutar = tutar * kdvOran;
        kdvliTutar = tutar + kdvTutar;

        System.out.println("KDV Oranı: " + kdvOran);
        System.out.println("KDV Tutarı: " + kdvTutar);
        System.out.println("KDV'li Tutar: " + kdvliTutar);
        System.out.println("KDV'siz Tutar: " + tutar);



    }
}
