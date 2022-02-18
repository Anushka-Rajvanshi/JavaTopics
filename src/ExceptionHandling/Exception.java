package exceptionhandling;
class A{
        int divide(int a, int b){
            return a/b;
        }
}
class Exception{
    public static void main(String args[]){
        A obj = new A();
        try{
            System.out.println("Try");
            obj.divide(1, 0);
        }
        catch(ArithmeticException e){
            System.out.println("Can't divide by 0");
        }
        finally{
            System.out.println("finally");
        }
    }
}