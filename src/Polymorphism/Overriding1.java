class Animal{
    String name = "Animal";
    void display(){
        System.out.println("Animal eats.");
    }
}

class Camel extends Animal{
    String name = "Camel";
    void display(){
        System.out.println("Camel drinks");
    }
}
class Overriding1{
    public static void main(String args[]){
        Animal a = new Camel();
        a.display();
        System.out.println(a.name);
    }
}