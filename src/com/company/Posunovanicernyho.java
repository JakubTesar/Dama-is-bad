package com.company;

public class Posunovanicernyho {
    // 0 bílý kámem
// 1 černý kámen
// 2 bílé pole
// 3 černé pole
    public static boolean posunovani1(int[][] pole, int SouVY, int SouVX, int SouPY, int SouPX, boolean tah) {
        boolean output = false;

        if (pole[SouPY][SouPX] == 3) {
            if (SouPY + 1 == SouVY && Math.abs(SouPX - SouVX) == 1) {
                pole[SouPY][SouPX] = 1;
                pole[SouVY][SouVX] = 3;
                output = true;
            }
        }
        return output;
    }
}

