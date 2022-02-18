package flowcontrol;
class Grade{
    void CGPA(String str){
        switch (str){
            case "A1":
            System.out.println("10");
            break;
            case "A2":
            System.out.println("9");
            break;
            case "B1":
            System.out.println("8");
            break;
            case "B2":
            System.out.println("7");
            break;
            case "C1":
            System.out.println("6");
            break;
            case "C2":
            System.out.println("5");
            break;
            case "D":
            System.out.println("4");
            break;
            default: System.out.println("Fail");
        }
    }
}
public class FlowControl {
    public static void main(String args[]){
        Grade obj = new Grade();
        obj.CGPA("A1");
        obj.CGPA("E1");
        obj.CGPA("B2");
        int i=2, j=3;
        if(i<j){
            System.out.println("i<j");
        }else if(i>j){
            System.out.println("i>j");
        }else{
            System.out.println("i=j");
        }
    }
    
}
