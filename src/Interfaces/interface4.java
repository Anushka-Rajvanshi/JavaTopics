package interfaces;
interface Polygon{
    void getArea();
    default void getPerimeter(int... args){
        int sum=0;
        for(int arg:args){
            sum += arg;
        }
        System.out.println("Permeter is: "+sum);
    }
}
class Triangle implements Polygon{
    int p,b,h;
    Triangle(int x, int y, int z){
        p = x;
        b = y;
        h =z;
    }
    public void getArea(){
        System.out.println("Area is "+0.5*b*h);
    }
}

public class interface4 {
    public static void main(String args[]){
        Triangle obj = new Triangle(3,4,5);
        obj.getArea();
        obj.getPerimeter(3,4,5);
    }
    
}
