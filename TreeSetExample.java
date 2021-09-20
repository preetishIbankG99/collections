package collectionsamples;
//maintains ascending order
//contains unique elements
//tree set access and retrieval times are quiet fast
//doesnot allow null value
//non synchronized

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<String>ts=new TreeSet<>();
        ts.add("Ravi");
        ts.add("Kavi");
        ts.add("Chetan");
        ts.add("Zeeshan");
        Iterator<String>itr=ts.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        //retrieve and remove highest and lowest value
        TreeSet<Integer>ts2=new TreeSet<>();
    ts2.add(24);
    ts2.add(66);
    ts2.add(12);
    ts2.add(34);
        System.out.println(ts2.pollFirst());
        System.out.println(ts2.pollLast());
    }
}
