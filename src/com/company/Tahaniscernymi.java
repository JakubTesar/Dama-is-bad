package com.company;

public class Tahaniscernymi {
    public static void tahanirule1 (int pole[][], int SouVY, int SouVX){
        if (pole[SouVY][SouVX] == 0) {
            System.out.println("Špatné pole (Můžeš táhnout jenom s černými)");
            Vypisovanifunkce.vypisonvani(pole);
        }
    }
}
