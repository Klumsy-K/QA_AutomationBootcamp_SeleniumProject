package Challenges;
 import java.util.Arrays;
 import java.util.Random;
public class Challenges3 {

    public static void main (String[] args){

        System.out.println(Arrays.toString(generateArray(10)));

    }

    public static int[] generateArray (int length){
       Random rand = new Random();
       int[] arr = new int[length];
       for (int i = 0; i < length; i ++){
           arr[i] = rand.nextInt(0,60);
       }
       return arr;
    }

    public static int[] reverseSort (int[] arr){

        int[] arrRev = new int[arr.length];


    return arrRev;
    }
}
