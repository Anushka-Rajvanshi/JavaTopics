//abstract
abstract class A{
    abstract void getName();
    void display1(){
        System.out.println("1");
    }
} 
class B extends A{
    void getName(){
        System.out.println("B");
    }
    void display1(){
        System.out.println("one");
    }
}
//final
final class C{
    int x = 10;
    void getX(){
        System.out.println(x);
    }
}
public class Modifier {
    public static void main(String args[]){
        B obj = new B();
        obj.getName();
        obj.display1();
        C obj2 = new C();
        obj2.x = 20;
        obj2.getX();
    }
    
}
