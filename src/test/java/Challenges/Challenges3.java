package Challenges;
 import java.util.Arrays;
 import java.util.Random;
public class Challenges3 {

    public static void main (String[] args){
        int[] array = generateArray(20, 0, 60);

        System.out.println(Arrays.toString(array));
        System.out.println(findHighest(array));

    }

    public static int[] generateArray (int length, int lowBound, int highBound){
       Random rand = new Random();
       int[] arr = new int[length];
       for (int i = 0; i < length; i ++){
           arr[i] = rand.nextInt(lowBound,highBound);
       }
       return arr;
    }

    public static int findHighest (int[] array){
        int highest = 0;
        for (int i = 0; i < array.length; i ++){
            if (array[i]>=highest){
                highest = array[i];
            }
        }
        return highest;
    }

    public static int[] reverseSort (int[] arr){

        int[] arrRev = new int[arr.length];
        int highest = findHighest(arr);
        arrRev[1] = highest;

        for (int i = 1; i < arr.length; i ++ ){


        }


    return arrRev;
    }
}
