package collectionsamples;

import java.util.Map;
import java.util.TreeMap;

//TreeMap Contains only Unique Elements
//Cannot have null key but can have multiple null values
//non synchronized
//maintains ascending order
public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Integer,String>map=new TreeMap<>();
        map.put(100,"Bucket");
        map.put(102,"Tap");
        map.put(101,"Sanitizer");
        map.put(30,"Mug");
        //remove elements
       // map.remove(30);
        for(Map.Entry m:map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
