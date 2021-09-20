package collectionsamples;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {
    public static void main(String[] args) {
        Deque<String>deque=new ArrayDeque<>();
        deque.add("Ravi");
        deque.add("Vijay");
        deque.add("Rakhi");
        deque.offer("Rajat");
        deque.offerFirst("Pattu");
        deque.offerLast("Tussar");
      //delete first element and last element
        deque.pollFirst();
        deque.pollLast();

        //Traversing elements
        for(String str:deque){
            System.out.println(str);
        }

    }
}
