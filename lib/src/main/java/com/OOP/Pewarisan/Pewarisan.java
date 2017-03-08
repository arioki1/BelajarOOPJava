package com.OOP.Pewarisan;

import java.util.Scanner;

/**
 * BelajarOOPJava Created by arioki on 08/03/2017.
 */
public class Pewarisan {
    public void hitungSegitiga() {
        int a, t;

        Hitung hitung = new Hitung();
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan Alas   :");
        a = sc.nextInt();
        System.out.print("Masukan Tinggi :");
        t = sc.nextInt();
        System.out.print("Luas Segitiga Adalah : "+hitung.segitiga(a,t));
    }
}
