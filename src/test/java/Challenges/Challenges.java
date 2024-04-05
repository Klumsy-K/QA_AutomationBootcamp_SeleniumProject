package Challenges;

public class Challenges {

    public static void main(String[] args) {

        //print array elements using standard loop
        int[] arr1 = {5,1,4,3,2,8,9};
        int[] arr2 = {};
//      printArrayReverse(arr1);
//      printArraySecond(arr1);
//      printArrayEven(arr1);
//        checkArrayEmpty(arr1);
//        checkArrayEmpty(arr2);
//        checkArrayElem(arr1, 3);
//        cumulativeSum(15);
        FizzBuzz(25);

    }

    static void printArray(int[] arr) {
        for(int i= 0; i < arr.length; i++){
            System.out.print(arr[i]+ " ");
        }


    }

    static void printArrayReverse(int[] arr) {
        for(int i = (arr.length-1); i >= 0; i --){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    static void printArraySecond(int[] arr) {
        for(int i = 0; i < arr.length; i ++){
            if ((i % 2) == 0){
                System.out.print(arr[i]+ " ");
            }
        }
        System.out.println();

    }
    static void printArrayEven(int[] arr) {
        for (int j : arr) {
            if ((j % 2) == 0) {
                System.out.print(j + " ");
            }
        }
        System.out.println();
    }

//   1. CHECK IF ARRAY IS EMPTY
    static void checkArrayEmpty(int[] arr){

//        Let's catch the null array case
        if (arr == null){
            System.out.println("Array is null");
        }

//        Now we check if empty
        if (arr.length == 0){
            System.out.println("Array "+arr.toString()+" is empty");
        }
        else {
            System.out.println("Array "+arr.toString()+" is not empty");
        }
    }

//    2. CHECK FOR PRESENCE OF GIVEN ELEMENT IN AN ARRAY

    static boolean checkArrayElem(int[] arr, int elem){
//       I have thought about adding an internal boolean "elemFound" to flag it true when the element is found
//       and having the loop check for this condition and stop but I guess this is totally unnecessary? The loop
//       will just return true and halt execution? I think that's correct;
        for (int j : arr) {
//            Since there are no fancy conditions we can use the abbreviated form
            if (j == elem) {
                System.out.println("Element "+elem+" was found in array "+arr.toString());
                return true;
            }

        }
        return false;
    }

//    3. CUMULATIVE SUM OF NUMBERS UP TO n

    static int cumulativeSum (int n){
        int sum = 0;
        for (int i = 0; i <= n; i ++){
            sum += i;
        }
        System.out.println("The cumulative sum of integers from 0 to "+n+" is "+sum);
        return sum;
    }

    static void FizzBuzz (int n){

//        METHOD 1 (general)

        for (int i =1; i <=n; i++){
            if((i%3==0)||(i%5==0)){

                if ((i%3==0)&&(i%5==0)){
                    System.out.println("FizzBuzz");
                }
                else if (i%3==0){
                   System.out.println("Fizz");
               }

               else {
                   System.out.println("Buzz");
               }

            }
            else {
                System.out.println(i);
            }
        }

//        METHOD 2 (because the message required is the two messages concatenated we don't ned to check for &&)

        for (int i=1; i <= n; i ++){

//            we can put formatting here
            System.out.println();
            if (i%3==0){
                System.out.print("Fizz");
            }
            if (i%5==0){
                System.out.print("Buzz");
            }
            else if (i%3!=0){
                System.out.print(i);
            }
        }
    }

}
