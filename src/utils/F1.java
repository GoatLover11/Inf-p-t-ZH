package utils;

/*
* 1. feladat:
* Írjon egész Java függvényt, amely generál 13 darab [1,50] közé eső egész számot, amit eltárol egy M nevű tömbben, és megadja, hogy az M tömbben hány darab hárommal osztható szám van!
*Írjon utasítást, amely kiírja, hogy a 13 véletlen szám között (vagyis M tömbben) hány darab hárommal osztható szám van!
* */

import java.util.Random;

public class F1 {
    public static void main(String[] args) {
        int i = gen();
    }

    public static int gen(){
        int []M = new int[13];
        for (int i = 0; i < M.length; i++) {
            M[i] = 1 + new Random().nextInt(49);
            System.out.println(i + ": " + M[i]);
        }
        int hoszt = 0;
        for (int i : M){
            if (i % 3 == 0)
                hoszt++;
        }
        System.out.println("3 mal osztható: " + hoszt);
        return hoszt;
    }
}

