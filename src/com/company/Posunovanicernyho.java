package com.company;
// 0 bílý kámem
// 1 černý kámen
// 2 bílé pole
// 3 černé pole
public class Posunovanicernyho {
    public static void posunovani1 (int[][] pole, int SouVY, int SouVX, int SouPY, int SouPX, boolean tah){
        if (pole[SouPY][SouPX] == 3){
            pole[SouPY][SouPX] = 1;
            pole[SouVY][SouVX] = 3;
            tah = false;
        }
    }
}
