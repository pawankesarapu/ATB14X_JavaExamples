package Ex_03_Examples_Oprators;

import java.sql.SQLOutput;

public class Lab_13_Unary_operators {
    public static void main(String[] args) {
        int A = +20;
        int B = -100;
        int Result = A+B;
        System.out.println(Result);
        int C = 10;
         C = C+1;
        System.out.println(C);
        int E=34;
        E++;
        System.out.println(E);
        int F=40;
        F--;
        System.out.println(F);
        boolean test= true;
        test = !test;
        System.out.println(test);
        int G =5;
        G = ~G;
        System.out.println(G);
    }
}
