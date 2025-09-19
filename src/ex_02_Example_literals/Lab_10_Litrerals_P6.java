package ex_02_Example_literals;

public class Lab_10_Litrerals_P6 {
    public static void main(String[] args) {
        char A1= 'A';
        char B1= '@';
        char C1 = '_';
        char d1 = '%';
        char e1= ' '; //Blank space
        // escape sequence
        char new_line= '\n';
        char tab_line='\t';
        char back_space='\b';
        char carriage_return='\r';

        System.out.println("pawan"+new_line+"kumar");
        System.out.println("pawan\nkumar");
        System.out.println("pawan"+back_space+"kumar");
        System.out.println("pawan\bkumar");
        System.out.println("pawan"+tab_line+"kumar");
        System.out.println("pawan\tkumar");
        System.out.println("pawan"+carriage_return+"kumar");
        System.out.println("pawan\rkumar");
    }
}
