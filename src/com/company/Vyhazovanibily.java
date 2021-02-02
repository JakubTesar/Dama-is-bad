package com.company;

// 0 bílý kámem
// 1 černý kámen
// 2 bílé pole
// 3 černé pole
public class Vyhazovanibily {
    public static int vyhozeni2(int[][] pole, int SouVY, int SouVX, int SouPY, int SouPX, int black, boolean tah) {

        if (pole[SouPY][SouPX] == 1) {

            if (pole[SouPX + 1][SouPY + 1] == 3) {
                pole[SouPX + 1][SouPY + 1] = 0;
                pole[SouVY][SouVX] = 3;
                pole[SouPX][SouPY] = 3;
                black -= 1;
                Vypisovanifunkce.vypisonvani(pole);

            } else if (pole[SouPX - 1][SouPY + 1] == 3) {
                pole[SouPX - 1][SouPY + 1] = 0;
                pole[SouPX][SouPY] = 3;
                pole[SouVY][SouVX] = 3;
                black -= 1;
                Vypisovanifunkce.vypisonvani(pole);

            }
        }
        return black;
    }
}
