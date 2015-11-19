package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner podaj = new Scanner(System.in);

        System.out.println("Podaj, ktory wyraz ci�gu Fibonacci'ego chcesz wyliczyc.");
        int i = podaj.nextInt();
        podaj.close();
        //warunek do spe�nienia
        if (i <= 50)
        {
            System.out.print(i + " wyraz ci�gu Fibonacci'ego obliczony metod� Iteracyjn� jest rowny : "+It(i));
            System.out.println(i + " Wyraz ci�gu Fibonacci'ego obliczony metod� Rekurencyjn� jest rowny : " + Re(i));
        }
        else
        {
        System.out.println("Zbyt dlugi czas obliczania ciagu!");
        }
    }


    // wyliczanie
    // Rrekruracja =Re ; Iterytacja = It
    public static long Re(long n){
        if(n==1 || n==0){
            return n;
        }
        else
            return Re(n - 2) + Re(n - 1);
    }
    public static long It(long n){
        if(n==0) return 0;
        long a, b, c ;
        a = 1;
        b = 1;
        if(n<=2) return a;
        // p�tla for
       for (int i=0; i < n-2; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }


}

