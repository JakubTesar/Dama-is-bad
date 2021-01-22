package com.company;

public class Jenompocernych {
    public static void jenompocernych (int pole[][], int SouPY, int SouPX){

        if (pole[SouPY][SouPX] == 2) {
            System.out.println("Špatné pole (Můžeš jenom po černých)");
            Vypisovanifunkce.vypisonvani(pole);
        }
    }
}
