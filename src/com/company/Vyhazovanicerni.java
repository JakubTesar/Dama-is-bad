package com.company;
// 0 bílý kámem
// 1 černý kámen
// 2 bílé pole
// 3 černé pole
public class Vyhazovanicerni {
    public static void vyhozeni1 (int[][] pole, int SouVY, int SouVX, int SouPY, int SouPX, int white, boolean tah){

        if (pole[SouPX][SouPY] == 0) {
            if (pole[SouPX+1][SouPY+1] == 3){
                pole[SouPX+1][SouPY+1] = 1;
                pole[SouPX][SouPY] = 3;
                white =- 1;
                Vypisovanifunkce.vypisonvani(pole);
                System.out.println(white);
                tah = false;
            }
        }
    }
}
