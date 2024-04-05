package support;

public class ArraysCo {

//methods

    public static void hrReport (String[] names, int[] employeeID, boolean[] isVampire){

        int newestID = 0;
        int newestIndex = 0;

        System.out.println("EMPLOYEE ROSTER");
        System.out.println();

        for (int i = 0; i < employeeID.length; i ++){

            System.out.println((i+1) +". " + names[i] + ". ID# " + employeeID[i]);

            if (isVampire[i] == true){

                System.out.println(" Definitely not a vampire.");
            }

        }
//let's welcome the fresh hire

        for (int i = 0; i < employeeID.length; i ++){

            if (employeeID[i] > newestID) {
                newestID = employeeID[i];
                newestIndex= i;
            }
        }
        System.out.println();
        System.out.println("A warm welcome to our newest employee, " + names[newestIndex] + "!");

    }

    public static void isItFridayYet(String[] workdays){

        System.out.println();
        System.out.println("IS IT FRIDAY YET");
        System.out.println();

        int i = 0;
        while (workdays[i] != "FRIDAY") {
            System.out.println(workdays[i]);
            i++;
        }

        System.out.println();

        if (workdays[i] == "FRIDAY"){
            System.out.println();
            System.out.println("TGIF");
        }
    }


//calling the methods
    public static void main (String[] args){

        String[] names = {"Schmendrick", "Chester", "Synthia", "Slaygor"};
        int [] employeeID = {127, 5, 99, 6};
        boolean[] isVampire = {false,false,false,true};
        String[] workdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "FRIDAY"};

        hrReport(names,employeeID,isVampire);

        isItFridayYet(workdays);

    }


}
