package com.company;

// 0 bílý kámem
// 1 černý kámen
// 2 bílé pole
// 3 černé pole
public class Vyhazovanicerni {
    public static int vyhozeni1(int[][] pole, int SouVY, int SouVX, int SouPY, int SouPX, int white, boolean tah) {

        if (pole[SouPY][SouPX] == 0) {

            if (pole[SouPY + 1][SouPX - 1] == 3) {
                pole[SouPY + 1][SouPX - 1] = 1;
                pole[SouVY][SouVX] = 3;
                pole[SouPY][SouPX] = 3;
                white -= 1;
                Vypisovanifunkce.vypisonvani(pole);

            } else if (pole[SouPY + 1][SouPX + 1] == 3) {
                pole[SouPY + 1][SouPX + 1] = 1;
                pole[SouPY][SouPX] = 3;
                pole[SouVY][SouVX] = 3;
                white -= 1;
                Vypisovanifunkce.vypisonvani(pole);

            }
        }
        return white;
    }
}
