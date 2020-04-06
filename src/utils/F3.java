package utils;

/*
* F3:
*Definiálja a következő valós-valós matematikai függvényt, használja a Math.exp függvényt!
* Írjon utasítást, amely két tizedes pontossággal kiírja az g függvény értékét a 0 helyen!
* */

import java.text.DecimalFormat;

public class F3 {
    public static void main(String[] args) {
        System.out.println(new DecimalFormat("#.##").format(gx(0)));
    }
    public static float gx(int x){
        double y = 0.0;
        if (x > 1)
            y = (2*x) / (x - 1);
        if (x <= 1)
            y = Math.exp((x - 1));
        return (float)y;
    }
}
