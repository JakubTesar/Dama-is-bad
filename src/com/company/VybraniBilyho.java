package com.company;
// 0 bílý kámem
// 1 černý kámen
// 2 bílé pole
// 3 černé pole
public class VybraniBilyho {
    public static boolean vybraniBiliho(int pole[][], int SouVY, int SouVX) {


            boolean output = true;
            if (pole[SouVY][SouVX] == 1) {
                System.out.println("Špatné pole (Můžeš táhnout jenom s černými)");
                output = false;
            }
            if (pole[SouVY][SouVX] == 2) {
                System.out.println("Špatné pole (Na tomto poli není kámen)");
                output = false;

            }
            if (pole[SouVY][SouVX] == 3) {
                System.out.println("Špatné pole (Na tomto poli není kámen)");
                output = false;
            }
            return output;
    }
}
