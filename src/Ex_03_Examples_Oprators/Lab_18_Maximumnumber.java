package Ex_03_Examples_Oprators;

import java.sql.SQLOutput;

public class Lab_18_Maximumnumber {
    public static void main(String[] args) {
        //even number
        int A= 4;
        String result = A%2== 0 ? "even": "odd";
        System.out.println(result);

        //maximum of three numbers
        int n1=2;
        int n2=9;
        int n3= 11;
        String result1= (n1>n2 ? (n1>n3? "n1 is big":"n3 is big"):(n2>n3? "n2 is big": "n3 is big"));
        System.out.println(result1);
        //age group

        int age=59;
        String result2= (age<18? "minor": (age<=60? "adault": "sr citizen"));
        System.out.println(result2);

    }
}
