package object;
class Fruit{
  void getColor(String str){
     System.out.println(str);
   }
}
class Apple extends Fruit{
  String color;
}
class Object{
  public static void main(String args[]){
    Apple A = new Apple();
    A.color = "Red";
    A.getColor(A.color);
    new Fruit().getColor("Blue");
  }
}
