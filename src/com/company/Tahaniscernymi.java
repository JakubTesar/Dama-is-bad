package com.company;
// 0 bílý kámem
// 1 černý kámen
// 2 bílé pole
// 3 černé pole
public class Tahaniscernymi {
    public static void tahanirule1 (int pole[][], int SouVY, int SouVX){
        if (pole[SouVY][SouVX] == 0) {
            System.out.println("Špatné pole (Můžeš táhnout jenom s černými)");

        }
    }
}
