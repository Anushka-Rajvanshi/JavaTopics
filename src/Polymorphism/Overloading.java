class Sum{
    int add(int a, int b){
        return a+b;
    }
    int add(int a, int b, int c){
        return a+b+c;
    }

}

class Overloading{
    public static void main(String args[]){
        Sum obj = new Sum();
        System.out.println(obj.add(1,2,3));
        System.out.println(obj.add(2,3));
    }
}