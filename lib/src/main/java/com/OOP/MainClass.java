package com.OOP;

import com.OOP.Pewarisan.Pewarisan;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Pewarisan pewarisan = new Pewarisan();
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        switch (i) {
            case 1:
                pewarisan.hitungSegitiga();
                break;
            case 2:
                pewarisan.hitungPersegi();
                break;
            default:
                System.out.print("Salah");
        }
    }
}


