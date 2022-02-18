class A{
    //instance
    int x;
    //static
    static int cnt =0;
    void getDouble(){
        //local
        int ans = 2*x;
        System.out.println("Double is: "+ans);
    }
    A(){
        cnt++;
    }
    void getTotal(){
        System.out.println(cnt);
    }
}

public class VariableTypes {
    public static void main(String args[]){
        A obj = new A();
        obj.x = 4;
        obj.getDouble();
        obj.getTotal();
        A obj2 = new A();
        obj2.x = 8;
        obj2.getTotal();
    }
    
}
