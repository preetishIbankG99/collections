package collectionsamples;

import java.util.Iterator;
import java.util.LinkedHashSet;

//LinkedHashSet contains Unique Elements only like HashSet
//permits Null elements
//nonsynchronized
//maintatins insertion order
public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<String>lset=new LinkedHashSet<>();
        lset.add("one");
        lset.add("two");
        lset.add("three");
        lset.add("four");
        lset.add("five");
        Iterator<String>i=lset.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}
