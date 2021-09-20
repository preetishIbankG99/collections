package collectionsamples;

import java.util.HashSet;
import java.util.Iterator;

//Hashset Stores elements using mechanism called hashing
//it contains unique Elements only,allows null value,non synchronized
//Hashset doesnot maintains Insertion Order.
//default capacity of HashSet is 16
public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String>set=new HashSet<String>();
        set.add("Java");
        set.add("Php");
        set.add("C#");
        set.add("VBScript");
        set.add("Testing");
        set.add("Java");
        set.add("Gudu");
        //remove specific element from Hashset
        set.remove("Gudu");
        set.remove("Testing");
        Iterator<String> i=set.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
//adding all elements in set by creating set1 object
        HashSet<String>set1=new HashSet<String>();
        set1.add("Testing");
        set1.add("Oracle");
        set.addAll(set1);
        System.out.println("Updated List: "+set);
//Removing all the new elements from HashSet
        set.removeAll(set1);
        System.out.println("After invoking removeAll "+set);

    //    set.removeIf(str->str.contains("Php"));
      //removing all elements available in set
        set.clear();
        System.out.println(""+set);

    }
}
