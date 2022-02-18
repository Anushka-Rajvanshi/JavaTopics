class A {
    void display() throws ArithmeticException{
    System.out.println("Before throwing exception");
    throw new ArithmeticException("Exception in A");
    }
}
public class Exception3 {
    public static void main(String args[]){
        A obj = new A();
        try{
        obj.display();
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}
