package support;

public class JavaPractice {

    //        methods

    public static void sum(int a, int b) {
        System.out.println("The sum of the integers is " + (a + b));

    }
    public static void diff(int a, int b) {
        System.out.println("The difference of the integers is " + (a - b));

    }
    public static void mult(int a, int b) {
        System.out.println("The product of both integers is " + (a * b));

    }
    public static void div(int a, int b) {
        float fa = (float) a;
        float fb = (float) b;
        System.out.println("The quotient of the integers is " + (fa / fb));
    }
    public static void modulo(int a, int b) {
        System.out.println("The simple division remainder for the integers is " + (a % b));
    }



    public static void main (String[] args) {

//        vars
        String string = "Redyska";
        String otherstring = "Tsybulia";
        int a = 1;
        int b = 100;
        float x = 1.0F;
        boolean bool = true;


//        sout vars
        System.out.println("The string values are " + string + " and " + otherstring);
        System.out.println("The boolean value is " + bool);
        System.out.println("The int values are " + a + " and " + b);
        System.out.println("The float value is " + x);

//        arithmetic

        sum (a,b);
        diff (a,b);
        mult (a,b);
        div (a,b);

//        logic

        System.out.println("a > b is " + (a > b));
        System.out.println("a < b is " + (a < b));
        System.out.println("a = b is " + (a == b));
        System.out.println("a is NOT equal b is " + (a != b));

        System.out.println("a is greater OR equal to b is " + ((a > b) || (a == b)));
        System.out.println(("a is UNEQUAL to b AND we have a string :) " + (a != b) + ", also the string's name is " + otherstring));





    }
}
