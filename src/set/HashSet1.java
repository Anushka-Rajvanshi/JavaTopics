package set;

import java.util.*;

public class HashSet1 {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<Integer>();
        hs.add(1);
        hs.add(3);
        hs.add(5);
        hs.add(8);
        System.out.println(hs);
        hs.remove(8);
        HashSet<Integer> hs2 = new HashSet<Integer>();
        hs2.add(10);
        hs2.add(12);
        hs2.add(1);
        hs.addAll(hs2);
        Iterator<Integer> i = hs.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
        hs.removeIf(a -> a%2==0);
        System.out.println(hs);
        hs.clear();
        System.out.println(hs.isEmpty());
    }
}
