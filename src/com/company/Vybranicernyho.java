package com.company;
// 0 bílý kámem
// 1 černý kámen
// 2 bílé pole
// 3 černé pole
public class Vybranicernyho {
    public static void vybranicernyho (int pole[][], int SouVY, int SouVX){
        if (pole[SouVY][SouVX] == 2) {
            System.out.println("Špatné pole (Na tomto poli není kámen)");
        }
        if (pole[SouVY][SouVX] == 3) {
            System.out.println("Špatné pole (Na tomto poli není kámen)");
        }
    }
}
