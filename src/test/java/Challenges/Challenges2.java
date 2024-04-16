package Challenges;

import java.util.Arrays;
import java.util.Scanner;

public class Challenges2 {

    public static void main(String[] args) {

        String revSentence = masterYodaSays("I study WebDriver");
        // this method returns the required string but doesn't print it.
        // We will print it

        System.out.println(revSentence);

//      multiplesOf(5);

        multiTable();


    }

    public static String masterYodaSays (String sentence){

//      We use two arrays: one is the given string as array;
//      The other is an empty array of matching length.

        String[] sentArr = sentence.split(" ");
        String[] sentArrRev = new String[sentArr.length];
        int j=0;
        for (int i = (sentArr.length-1); i >= 0; i --){
            sentArrRev[j] = (sentArr[i]);
            j++;

//      i finds the index of source array and counts down :
//      j gives the index of result array and counts up

        }

//      Now lets return the result as a regular string again> we will get rid of the commas
//      in the default formatting of Arrays.toString() method using .replace

       return Arrays.toString(sentArrRev).replace(",", "");
    }

//    This method just does the multiplication and presents the results
    private static void multiplesOf (int num){
        for (int i = 1; i <= 10; i ++){
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }

    //        This method asks the user what number he wants to multiply and calls multiplesOf to do its thing..
    public static void multiTable (){
        Scanner userInt = new Scanner(System.in);
        System.out.println("Input integer to multiply: ");
        multiplesOf(userInt.nextInt());
    }

}
