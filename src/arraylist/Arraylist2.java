package arraylist;

import java.util.*;

class Student{
    private float percentage;
    private ArrayList<Integer> marks = new ArrayList<Integer>(5);
    Student(List<Integer> m){
        marks.addAll(0,m);
        for(Integer i: marks){
            percentage += i;
        }
        percentage = percentage/5;
    }
    
    float getPercentage(){
        return percentage;
    }
}

public class Arraylist2 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();
        Scanner sc = new Scanner(System.in);
        char c;
        do{
            ArrayList<Integer> m = new ArrayList<Integer>();
            System.out.println("Enter marks of student: ");
            for(int i=0; i<5; i++){
                int x = sc.nextInt();
                m.add(x);
            }
            Student obj = new Student(m);
            System.out.println("Your percentage is: "+ obj.getPercentage());
            list.add(obj);
            System.out.println("Repeat for more students? y/n");
            c = sc.next().charAt(0);
        }while(c=='y');
        System.out.println("Percentage of all students: ");
        for(Student s: list){
            System.out.print(s.getPercentage()+" ");
        }
        System.out.println();
        sc.close();
    }
}
