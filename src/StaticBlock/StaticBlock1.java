package staticblock;
class A{
    static int i;
    static String name;
    static{
        i = 10;
        name = "A";
    }
}

class StaticBlock1{
    public static void main(String args[]){
        System.out.println(A.i+" "+A.name);
    }
}