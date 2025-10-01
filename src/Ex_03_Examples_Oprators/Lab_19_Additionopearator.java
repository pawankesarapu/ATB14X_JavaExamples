package Ex_03_Examples_Oprators;

import java.sql.SQLOutput;

public class Lab_19_Additionopearator {
    public static void main(String[] args) {
        int A= 20;
        int B=10;
        String C= "PAWAN";
        String D= "KUMAR";

        int x =10;
        System.out.println(x++ + ++x + --x + x--);

        System.out.println(A+B); // For integers it will do addition //30
        System.out.println(C+D); // For strings it will do concadination //PAWANKUMAR

        System.out.println(A+B+C+D); // A & B are integers declared first so it will do addition and for C & D it will do concadination
        //30PAWANKUMAR
        System.out.println(C+D+A+B); // C&D are strings declared first in this behaviour is different all it will do concadination even it is integers (A & B)
        //PAWANKUMAR2010


    }
}
