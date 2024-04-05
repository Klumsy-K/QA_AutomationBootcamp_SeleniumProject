package support;

import java.util.ArrayList;
import java.util.HashMap;

public class ArrayLists {

    //INSTANTIATE THE PERSONS
    static Person deunan = new Person("Deunan Knute", 26);
    static Person hitomichan = new Person("Hitomi", 20);
    static Person bri = new Person("Briareos Hecatonchires", 34);
    static Person yoshi = new Person("Yoshitsune", 22);


    public static void main(String[] args) {

        //CREATE ARRAY LIST
        ArrayList<Person> personae = new ArrayList<Person>();
        // ADD THE OBJECTS
        personae.add(deunan);
        personae.add(bri);
        personae.add(hitomichan);
        personae.add(yoshi);

        // PRINT OUT NAMES BY INDEX
        for (int i = 0; i < personae.size(); i++) {
            System.out.println(personae.get(i).name);
        }

        // CREATE THE HASHMAP
        HashMap<Integer, ArrayList<Person>> roster = new HashMap<>(4);
        roster.put(4, personae);


        for (int i = 0; i < roster.size(); i++) {
            for (int j = 0; j < roster.size(); j++) {
                System.out.println(j + ". " + (roster.get(j)).get(j).name);
                System.out.println(" age: " + (roster.get(j)).get(j).age);
            }


        }
    }
}
