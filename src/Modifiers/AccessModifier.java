package modifiers;
class Rectangle{
    protected int l, b;
    Rectangle(){
    }
    Rectangle(int l, int b){
        this.l = l;
        this.b = b;
    }
    public void area(){
        System.out.println(l*b);
    }
}
class Square extends Rectangle{
    Square(int s){
        this.l = s;
        this.b = s;
    }
}

public class AccessModifier {
    public static void main(String args[]){
        Square s = new Square(4);
        Rectangle r = new Rectangle(4,8);
        r.area();
        s.area();
    }
}
