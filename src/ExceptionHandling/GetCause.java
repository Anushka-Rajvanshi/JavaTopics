package exceptionhandling;
class A {
    static void divide(int a, int b){
        a = a/b;
    }
}
class GetCause{
    public static void main(String args[]){
        try{
            A.divide(1,0);
        }catch(ArithmeticException e){
            // ArithmeticException ex = new ArithmeticException();
            // ex.initCause(e);
            System.out.println("Cause: "+e.getCause());
        }
    }
}