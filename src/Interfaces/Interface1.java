package Interfaces;
interface Area{
    void getArea();
} 

class Square implements Area{
    int s = 10;
    public void getArea(){
        System.out.println(s*s);
    }
}

class Circle implements Area{
    int r = 10;
    public void getArea(){
        System.out.println(3.14*r*r);
    }
}

class Interface1{
    public static void main(String args[]){
        Square sq = new Square();
        sq.getArea();
        Circle c = new Circle();
        c.getArea();
    }
}