package interfaces;
interface Hello{
    void display1();
}
interface World{
    void display2();
}
class A implements Hello, World{
    public void display1(){
        System.out.println("Hello");
    }
    public void display2(){
        System.out.println("World");
    }
}
class Interface2 {
    public static void main(String args[]){
        A obj = new A();    
        obj.display1();
        obj.display2();
    }
    
}
