package passbyvalue;
class A{
    String name = "A";
    void getName(A obj){
        obj.name = "B";
    }
}

public class PassByValueObject {
    public static void main(String args[]){
        A obj1 = new A();
        System.out.println(obj1.name);
        obj1.getName(obj1);
        System.out.println(obj1.name);
    }
}
