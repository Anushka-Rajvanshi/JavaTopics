class add{
    static void increase(int x){
        x++;
    }
}

public class PassByValue {
    public static void main(String args[]){
        int x = 10;
        System.out.println(x);
        add.increase(x);
        System.out.println(x);
    }
    
}
