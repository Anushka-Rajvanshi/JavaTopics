package linkedlist;

import java.util.*;

public class Linkedlist1 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("Apple");
        ll.add("Banana");
        ll.add(1,"Orange");
        System.out.println(ll);
        for(String s: ll){
            System.out.println(s);
        }
        ll.removeFirst();
        ll.removeLast();
        ll.add("Grapes");
        ll.add("Banana");
        ll.add(0,"Grapes");
        System.out.println(ll);
        ll.removeFirstOccurrence("Grapes");
        ll.removeLastOccurrence("Banana");
        System.out.println(ll);

        Iterator i = ll.descendingIterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
        ll.clear();
        System.out.println(ll.isEmpty());
    }
    
}
