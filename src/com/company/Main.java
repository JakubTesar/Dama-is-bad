package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int white = 12;
        int black = 12;
        int pole[][] = {
                {4,5,6,7,8,9,10,11,12},
                {13,2,0,2,0,2,0,2,0},
                {14,0,2,0,2,0,2,0,2},
                {15,2,0,2,0,2,0,2,0},
                {16,3,2,3,2,3,2,3,2},
                {17,2,3,2,3,2,3,2,3},
                {18,1,2,1,2,1,2,1,2},
                {19,2,1,2,1,2,1,2,1},
                {20,1,2,1,2,1,2,1,2},};


        // 0 bílý kámem
        // 1 černý kámen
        // 2 bílé pole
        // 3 černé pole


        boolean tah = true;
        int  SouVY;
        int  SouVX;
        int  SouPY;
        int  SouPX;


        while (white !=0 || black !=0){

            if (tah == true ){    // HRAJE ČERNEJ 1.
                Vypisovanifunkce.vypisonvani(pole);

                System.out.println("Teď je na tahu černej");
                System.out.println("Zadej Y pro vybrání kamene");
                SouVY = sc.nextInt();
                System.out.println("Zadej X pro vybrání kamene");
                SouVX = sc.nextInt();

                System.out.println("Zadej Y pro posunutí kamene");
                SouPY = sc.nextInt();
                System.out.println("Zadej X pro posunutí kamene");
                SouPX = sc.nextInt();

                Jenompocernych.jenompocernych(pole, SouPY, SouPX);

                Tahaniscernymi.tahanirule1(pole, SouVY, SouVX);

                Posunovanicernyho.posunovani1(pole, SouVY, SouVX, SouPY, SouPX, tah);

                Vyhazovanicerni.vyhozeni1 (pole, SouVY, SouVX, SouPY, SouPX, white, tah);


            }
            if (tah == false ){    // HRAJE ČERNEJ 1.
                Vypisovanifunkce.vypisonvani(pole);

                System.out.println("Teď je na tahu černej");
                System.out.println("Zadej Y pro vybrání kamene");
                SouVY = sc.nextInt();
                System.out.println("Zadej X pro vybrání kamene");
                SouVX = sc.nextInt();

                System.out.println("Zadej Y pro posunutí kamene");
                SouPY = sc.nextInt();
                System.out.println("Zadej X pro posunutí kamene");
                SouPX = sc.nextInt();

                Jenompocernych.jenompocernych(pole, SouPY, SouPX);

                Tahanibilymi.tahanirule2(pole, SouVY, SouVX);

                Posunovanibilyho.posunovani2(pole, SouVY, SouVX, SouPY, SouPX, tah);

                Vyhazovanibily.vyhozeni2 (pole, SouVY, SouVX, SouPY, SouPX, white, tah);


            }

        }
    }

}
