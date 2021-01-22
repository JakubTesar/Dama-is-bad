package com.company;

public class Vyhazovanibily {
    public static void vyhozeni2 (int[][] pole, int SouVY, int SouVX, int SouPY, int SouPX, int black, boolean tah){

        if (pole[SouPX][SouPY] == 0) {
            if (pole[SouPX+1][SouPY+1] == 3){
                pole[SouPX+1][SouPY+1] = 1;
                pole[SouPX][SouPY] = 3;
                black =- 1;
                Vypisovanifunkce.vypisonvani(pole);
                System.out.println(black);
                tah = false;
            }
        }
    }
}
