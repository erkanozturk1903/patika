package org.example.Donguler;

import java.util.Scanner;

public class UcveDordeTamBolunme {
    public static void main(String[] args) {
        int input, total = 0;

        Scanner scan = new Scanner(System.in);

        do{
            System.out.println("Lutfen bir sayi giriniz");
            input = scan.nextInt();

            if (input % 2 == 0 && input % 4 == 0) {
                total+=input;

            }

        }while (input % 2 == 0);
        System.out.println("Toplam : "+total);

    }
}
