package com.company;

// 0 bílý kámem
// 1 černý kámen
// 2 bílé pole
// 3 černé pole
public class Posunovanibilyho {
    public static boolean posunovani2(int[][] pole, int SouVY, int SouVX, int SouPY, int SouPX, boolean tah) {

        boolean output = false;

        // if (SouPY - 1 == SouVY && Math.abs(SouVX - SouPX) == 0) {
        //     pole[SouPY][SouPX] = 0;
        //     pole[SouVY][SouVX] = 3;
        // }
        if (pole[SouPY][SouPX] == 3) {
            if (pole[SouVY][SouVX] == pole[SouPY - 1][SouPX + 1]) {
                if (pole[SouPY][SouPX] == 3) {
                    pole[SouPY][SouPX] = 0;
                    pole[SouVY][SouVX] = 3;
                    output= true;
                }
            }


            if (pole[SouVY][SouVX] == pole[SouPY - 1][SouPX - 1]) {
                if (pole[SouPY][SouPX] == 3) {
                    pole[SouPY][SouPX] = 0;
                    pole[SouVY][SouVX] = 3;
                    output= true;
                }
            }
        }
        return output;
    }
}
