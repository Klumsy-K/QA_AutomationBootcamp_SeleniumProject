package Challenges;

import java.util.Arrays;
import java.util.Scanner;

public class Challenges2 {

    public static void main(String[] args) {

        String revSentence = masterYodaSays("I study WebDriver");
        System.out.println(revSentence);

//      multiplesOf(5);

        multiTable();


    }

    public static String masterYodaSays (String sentence){
       String[] sentArr = sentence.split(" ");
        System.out.println(Arrays.toString(sentArr));
//        System.out.println(sentArr.length);
        int index = (sentArr.length);
       String[] sentArrRev = new String[index];
       int j=0;
       for (int i = (sentArr.length-1); i >= 0; i --){
               sentArrRev[j] = (sentArr[i]);
           j++;

       }
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
