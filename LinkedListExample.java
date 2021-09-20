package collectionsamples;

import java.util.Iterator;
import java.util.LinkedList;

//Linked list class contains duplicate elements
//maintains insertion order
//non synchronized
//can be used as stack,list and queue
public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String>ll=new LinkedList<String>();
        ll.add("gudu");
        ll.add("rubu");
        ll.add("raka");
        ll.add("bubu");
        ll.add("gudu");
        Iterator<String>itr=ll.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());



        }
        //add elements in linkedlist
        ll.add(1,"subu");
        System.out.println(ll);
        LinkedList<String>ll2=new LinkedList<String>();
        ll2.add("jolly");
        ll2.add("rupa");
        ll.addAll(ll2);
        System.out.println(ll);

        //remove
        ll.removeAll(ll2);
        System.out.println(ll);
        ll.remove(0);
        System.out.println(ll);
//descending iterator
        Iterator i=ll.descendingIterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}
