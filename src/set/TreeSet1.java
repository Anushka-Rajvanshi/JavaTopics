package set;

import java.util.*;

class Animal implements Comparable<Animal>{
    int legs;
    Animal(int n){
        this.legs = n;
    }

    @Override
    public int compareTo(Animal a) {
        if(legs>a.legs){
            return 1;
        } 
        else if(legs<a.legs){
            return -1;
        }
        return 0;
    }
    
}

public class TreeSet1 {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<String>();
        ts.add("Dog");
        ts.add("Cat");
        ts.add("Monkey");
        ts.add("Zebra");
        Iterator i = ts.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
        i = ts.descendingIterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
        ts.add("Lion");
        ts.add("Giraffe");
        ts.add("Horse");
        System.out.println(ts);
        System.out.println("Subset:"+ts.subSet("Dog", "Lion"));
        System.out.println("HeadSet: "+ts.headSet("Monkey", true));
        System.out.println("HeadSet: "+ts.headSet("Monkey"));
        System.out.println("TailSet: "+ts.tailSet("Monkey", false));
        System.out.println("TailSet: "+ts.tailSet("Monkey"));
        System.out.println("Subset: "+ts.subSet("Dog", false, "Monkey", true));

        TreeSet<Animal> ts1 = new TreeSet<Animal>();
        Animal dog = new Animal(4);
        ts1.add(dog);
        Animal octopus = new Animal(8);
        ts1.add(octopus);
        Animal penguin = new Animal(2);
        ts1.add(penguin);
        for(Animal a:ts1){
            System.out.println(a.legs);
        }
    }
    
}
