package collectionsamples;

import java.util.Hashtable;
import java.util.Map;

//Java Hashtable class contains unique elements.
        //Java Hashtable class doesn't allow null key or value.
        //Java Hashtable class is synchronized.
        //It inherits Dictionary class and implements the Map interface.
public class HashTableExample {
    public static void main(String[] args) {
        Hashtable<Integer,String> hm=new Hashtable<Integer,String>();

        hm.put(100,"Amit");
        hm.put(102,"Ravi");
        hm.put(101,"Vijay");
        hm.put(103,"Rahul");
        hm.remove(102);

        for(Map.Entry m:hm.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
