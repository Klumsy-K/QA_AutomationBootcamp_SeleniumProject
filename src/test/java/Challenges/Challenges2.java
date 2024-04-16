package Challenges;

import java.util.Arrays;

public class Challenges2 {

    public static void main(String[] args) {

        String revSentence = masterYodaSays("I study WebDriver");
        System.out.println(revSentence);

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

}
