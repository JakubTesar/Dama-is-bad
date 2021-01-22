package com.company;

public class Posunovanicernyho {
    public static void posunovani1 (int[][] pole, int SouVY, int SouVX, int SouPY, int SouPX, boolean tah){
        if (pole[SouPY][SouPX] == 3){
            pole[SouPY][SouPX] = 1;
            pole[SouVY][SouVX] = 3;
            Vypisovanifunkce.vypisonvani(pole);
            tah = false;
        }
    }
}
