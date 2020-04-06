package utils;
/*
* s=∑ni=32ii+9

Írjon valós Java függvényt, amely kiszámítja a fenti összeget!
Írjon utasítást, amely kiírja, hogy n=200 esetén mennyi ez az összeg!
* */

public class F4 {
    public static void main(String[] args) {
        System.out.println(szamol(200));
    }
    public static int szamol (int n){
        int s = 0;
        for (int i = 3; i <= n; i++) {
            s += Math.rint((2*i) / (i +9));
        }
        return s;
    }
}
