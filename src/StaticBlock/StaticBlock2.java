package staticblock;
class A{
    static int i;
    static String name;
    static{
        i=10;
        name ="A";
    }
    A(){
        i=11;
        name = "B";
    }
}

public class StaticBlock2 {
    public static void main(String args[]){
        System.out.println(A.i+" "+A.name);
        A obj = new A();
        System.out.println(A.i+" "+obj.name);
    }
    
}
