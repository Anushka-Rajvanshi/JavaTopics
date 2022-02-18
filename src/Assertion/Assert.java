public class Assert {
    public static void main(String args[]){
        int x = 20;
        if(x<15){
            System.out.println("Less than 15");
        }
        else{
            assert x<15 : "Not gereater than 15";
            System.out.println("Not valid");
        }
    }
    
}
