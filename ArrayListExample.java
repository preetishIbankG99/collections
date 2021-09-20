package collectionsamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

//Array list class uses dynamic array for storing Elements.we can add or remove elements
//contains duplictae elements
//maintains insertion order
//non synchronized
public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String>al=new ArrayList<String>();
        al.add("mango");
        al.add("banana");
        al.add("grapes");
        al.add("pineapple");
        al.add("mango");//duplicate elements taken
        //System.out.println(al);

        //traversing list through for each loop
//        for(String f:al){
//            System.out.println(f);
//        }

        //Traversing list through Iterator
//        Iterator itr=al.iterator();
//        while(itr.hasNext())
//        {
//            System.out.println(itr.next());
//        }

//get() and set() in arraylist
//        System.out.println("Element present in index 1 "+ al.get(1));
//        al.set(1,"guava");
//
//        for (String f:al){
//            System.out.println(f);
//        }

        //Sorting ArrayList
//        Collections.sort(al);
//        for(String f:al){
//            System.out.println(f);
//        }

        //Iterating Elements in reverse order
        ListIterator<String>ltr=al.listIterator(al.size());
        while(ltr.hasPrevious()){
            System.out.println(ltr.previous());
        }
    }
}
