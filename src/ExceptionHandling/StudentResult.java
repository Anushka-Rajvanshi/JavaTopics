package exceptionhandling;

import java.util.*;

class InvalidInputException extends Throwable{

    public InvalidInputException(String str){
        super(str);
    }
}

class Student{
    int marks[] = new int[5];
    Student(int arr[]) throws InvalidInputException{
        for(int i=0; i<5; i++){
            if(arr[i]>100 || arr[i]<0){
                throw new InvalidInputException("Invalid Marks.");
            }
            marks[i] = arr[i];
        }
    }
    void getResult(){
        int ans=0;
        for(int m: marks){
            ans += m;
        }
        System.out.println("Your percentage is: "+(float)(ans/5));
    }

}

public class StudentResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks: ");
        int m[] = new int[5];
        for(int i=0; i<5; i++){
            m[i] = sc.nextInt();
        }
        try{
            Student s = new Student(m);
            s.getResult();
        }
        catch (InvalidInputException e){
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}
