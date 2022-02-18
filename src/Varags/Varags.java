package varags;
class A{
    void display(String name, String... args){
        System.out.println(name);
        for(String s:args){
            System.out.println(s);
        }
    }
}

class Varags{
    public static void main(String args[]){
        A obj = new A();
        obj.display("A");
        obj.display("A","B","C");
        obj.display("A","B");
    }
}