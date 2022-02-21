package arraylist;

import java.util.*;

class Arraylist1{
    public static void main(String[] args) {
        ArrayList <String> colors = new ArrayList<String>();
        System.out.println(colors.isEmpty());
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        System.out.println(colors);
        Iterator<String> i = colors.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
        String str = colors.get(1);
        System.out.println(str);
        colors.set(1,"Yellow");
        System.out.println(colors);

        System.out.println(colors.isEmpty());

        ArrayList <String> list2 = new ArrayList<String>();
        list2.add("Black");
        list2.add("White");
        colors.add(0,"Grey");
        colors.addAll(2,list2);
        System.out.println(colors);

        colors.remove(0);
        colors.remove("Blue");
        System.out.println(colors);

        colors.clear();
        System.out.println(colors);
    }

}