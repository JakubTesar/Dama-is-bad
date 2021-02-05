package com.company;

// 0 bílý kámem
// 1 černý kámen
// 2 bílé pole
// 3 černé pole
public class IfPosunnovaniBily {
    public static boolean ifposunovanibily(int pole[][], int SouPY, int SouPX) {

        boolean output = true;


        if (pole[SouPY][SouPX] == 0) {
            System.out.println("Špatné pole (Nemůžeš táhnout na svůj kámen)");
            output = false;
        }
        if (pole[SouPY][SouPX] == 2) {
            System.out.println("Špatné pole (Můžeš skákat jenom po černých polích)");
            output = false;
        }

        return output;
    }
}
