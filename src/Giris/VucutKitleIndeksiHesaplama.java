package Giris;

import java.util.Scanner;

public class VucutKitleIndeksiHesaplama {
    public static void main(String[] args) {
        double boy;
        double kilo,vki;

        Scanner inp = new Scanner(System.in);
        System.out.println("Boyunuz: ");
        boy = inp.nextDouble();
        System.out.println("Kilonuz: ");
        kilo = inp.nextDouble();

        vki = kilo / (boy * boy);
        System.out.println("Vücut Kitle indeksiniz: " + vki);
    }
}
