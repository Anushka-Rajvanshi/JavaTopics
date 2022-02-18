class A{
    static int function2(int a, int b){
        return a/b;
    }
    static void function1(int a, int b){
        try{
            function2(a, b);
        }
        catch(NumberFormatException e){
            System.out.println(e.getMessage());
        }
    }
}

public class Exception2 {
    public static void main(String args[]){
        try{
            A.function1(1,0);
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}
