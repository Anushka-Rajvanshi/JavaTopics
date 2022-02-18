package constructor;
class Student{
    int age;
    String name;
    Student(){
        age = 21;
        name = "Anushka";
    }
    //parameterized
    Student (int i, String n){
        age = i;
        name = n;
    }
    //copy object
    Student(Student s){
        age = s.age;
        name = s.name;
    }
}

public class School {
    public static void main(String args[]){
        Student s1 = new Student();
        Student s2 = new Student(22,"Xyz");
        Student s3 = new Student(s1);
        System.out.println(s1.age+" "+s2.age+" "+s3.age);
    }
}
