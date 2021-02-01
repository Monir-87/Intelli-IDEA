package collectionsDemos;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class ArrayListDemo5 {

    public static void main(String[] args) {
        ArrayList al = new ArrayList();

        al.add(100);
        al.add("Ferhan");
        al.add("20.5");
        al.add('A');
        al.add(true);

        System.out.println(al);

        System.out.println("Number of elements in array list: " + al.size());

        al.remove(3);
        System.out.println("After removing index 3: " + al);

        al.add(3, "Huma");
        System.out.println("After adding " + al);

        //retrieve specific elements
        al.get(3);
        System.out.println(al.get((3)));

        //change elements/replace
        al.set(0, 50);
        System.out.println("After replacing 100: " + al);

        //isEmpty

        System.out.println(al.isEmpty());

        //How to read data in arrayList

        System.out.println("Reading elements using for loop....");
        for (int i = 3; i <= al.size(); i++) {
            System.out.println(al.get(4));
        }

        //for each loop
        System.out.println("Reading elements using for each loop..");
        for (Object e : al) {
            System.out.print(e);
        }

    }
}



