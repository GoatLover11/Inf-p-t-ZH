package utils;

/*
* F2:
*Definiálja a szorzotabla szubrutint (ami kiírja a nxn-es szorzótáblát) egy egész paraméterrel!
*Írassa ki a 20x20-as szorzótáblát!
* */

public class F2 {
    public static void main(String[] args) {
        szorzotabla(20);
    }

    public static void szorzotabla(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(i*j + ", ");
            }
            System.out.println();
        }
    }
}
