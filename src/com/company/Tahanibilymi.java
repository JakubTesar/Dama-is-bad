package com.company;
// 0 bílý kámem
// 1 černý kámen
// 2 bílé pole
// 3 černé pole
public class Tahanibilymi {
    public static void tahanirule2 (int pole[][], int SouVY, int SouVX){
        if (pole[SouVY][SouVX] == 1) {
            System.out.println("Špatné pole (Můžeš táhnout jenom s Bílými)");
            Vypisovanifunkce.vypisonvani(pole);
        }
    }
}
