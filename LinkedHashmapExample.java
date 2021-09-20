package collectionsamples;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

//it contains value based on the key
//it contains unique elements
//it have one null key and multiple null values
//non synchronized
//maintains insertion order
public class LinkedHashmapExample {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String>lh=new LinkedHashMap<>();
    lh.put(100,"Nikhil");
    lh.put(101,"Bena");
    lh.put(102,"Leeks");
    lh.put(103,"Silu");
    for(Map.Entry m:lh.entrySet()){
        System.out.println(m.getKey()+" "+m.getValue());

    }
        System.out.println(lh.keySet());
        System.out.println(lh.values());
        System.out.println("Key Value Pairs "+lh.entrySet());
        //removing
        lh.remove(103);
        System.out.println(lh.entrySet());

    }
}
