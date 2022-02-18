package polymorphism;

class Vehicle{
    void display(){
        System.out.println("It is a vehicle");
    }
}
class TwoWheeler extends Vehicle{
    void display(){
        System.out.println("It is a two wheeler");
    }
}

class Bike extends TwoWheeler{
    void display(){
        System.out.println("It is a bike.");
    }
}

public class Transport {
    public static void main(String args[]){
        Vehicle v;
        v = new TwoWheeler();
        v.display();                     
        v = new Bike();
        v.display();
    }  
}
