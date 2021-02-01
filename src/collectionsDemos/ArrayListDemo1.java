package collectionsDemos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo1 {

    public static void main(String[] args) {
        //....3 Ways to Declare ArrayList...
        //ArrayList=new ArrayList();
        //ArrayList <Integer> al=new ArrayList<Integer>();
        //ArrayList <String> al=new ArrayList<String>();
        //List al=new ArrayList():
        ArrayList al = new ArrayList();

        //Add new elements to the ArrayList
        al.add(100);
        al.add("welcome");
        al.add(15.5);
        al.add('A');
        al.add(true);

        System.out.println(al);

        //size()
        System.out.println("Number of elements in array list:" + al.size());

        //remove
        al.remove(1);
        //al.remove("welcome");
        System.out.println("After removing element from Array list: " + al);

        //insert new element
        //add(index,object)
        al.add(2,"Python");
        System.out.print("After adding: " + al);

        //retrieve specific element
        al.get(2);
        System.out.println(al.get(2));

        //change elements/replace
        al.set(2, "C#");
        System.out.println("After replacing element: " + al);

        //search - contains() - returns true/false
        System.out.println(al.contains("C#"));
        System.out.println(al.contains("C++"));

        //isEmpty()
        System.out.println(al.isEmpty());

        //How to read data in arraylist
        //for loop
        System.out.println("Reading elements using for loop.....");
        for (int i=0;i<=al.size();i++); {
            System.out.println(al.get(2));
        }

        //for..each loop
        System.out.println("Reading elements using for each loop....");
        for(Object e:al) {
            System.out.println(e);
        }

        //iterator()
        System.out.println("Reading elements using iterator");
        Iterator it=al.iterator();
        while (it.hasNext())
                   {
            System.out.println(it.next());
        }



    }

}
