package com.company;

public class Vypisovanifunkce {

    public static void vypisonvani (int pole[][]){
        for (int i = 0; i < pole.length; i++) {
            for (int j = 0; j < pole.length; j++) {
                if (pole[i][j] == 0){
                    System.out.print("⚫ ");
                }
                if (pole[i][j] == 1){
                    System.out.print("⚪ ");
                }
                if (pole[i][j] == 2){
                    System.out.print("⬛ ");
                }
                if (pole[i][j] == 3){
                    System.out.print("⬜ ");
                }
                if (pole[i][j] == 4){
                    System.out.print("0️⃣");
                }
                if (pole[i][j] == 5){
                    System.out.print("1️⃣");
                }
                if (pole[i][j] == 6){
                    System.out.print("2️⃣");
                }
                if (pole[i][j] == 7){
                    System.out.print("3️⃣");
                }
                if (pole[i][j] == 8){
                    System.out.print("4️⃣");
                }
                if (pole[i][j] == 9){
                    System.out.print("5️⃣");
                }
                if (pole[i][j] == 10){
                    System.out.print("6️⃣");
                }
                if (pole[i][j] == 11){
                    System.out.print("7️⃣");
                }
                if (pole[i][j] == 12){
                    System.out.print("8️⃣");
                }
                if (pole[i][j] == 13){
                    System.out.print("1️⃣");
                }
                if (pole[i][j] == 14){
                    System.out.print("2️⃣");
                }
                if (pole[i][j] == 15){
                    System.out.print("3️⃣");
                }
                if (pole[i][j] == 16){
                    System.out.print("4️⃣");
                }
                if (pole[i][j] == 17){
                    System.out.print("5️⃣");
                }
                if (pole[i][j] == 18){
                    System.out.print("6️⃣");
                }
                if (pole[i][j] == 19){
                    System.out.print("7️⃣");
                }
                if (pole[i][j] == 20){
                    System.out.print("8️⃣");
                }
                if (pole[i][j] == 21){
                    System.out.print("\uD83D\uDC69");
                }
                if (pole[i][j] == 22){
                    System.out.print("\uD83D\uDC69\uD83C\uDFFF");
                }
            }
            System.out.println();
        }
    }
}
