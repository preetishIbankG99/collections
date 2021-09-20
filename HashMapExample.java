package collectionsamples;

import java.util.HashMap;
import java.util.Map;

//HashMap class implements Map Interface
//it allows us to store key value pair
//keys should be unique
//if we try to insert the duplicate key it will replace the element of corresponding key.
//HashMap have one null key and multiple null values
//non synchronized maintains no order
public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer,String>map=new HashMap<Integer, String>();
        map.put(1,"Mango");
        map.put(1,"Orange");//no duplicates keys in HashMap if duplicate it will replace
        map.put(2,"Apple");
        map.put(3,"Banana");
        map.put(4,"Grapes");
        map.put(5,"Strawberry");
        //removing elements
        map.remove(5);

        //replace elements
        map.replace(2,"Guava");
        System.out.println("Iterating HashMap...");
        for(Map.Entry m:map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
