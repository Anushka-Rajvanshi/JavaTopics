package flowcontrol;
public class Loops {
    public static void main(String args[]){
        int arr[] = new int[]{1,2,3,4,5,6,7,8,9,10};
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

        int sum=0,i=0;
        do{
            sum += arr[i];
            i++;
        }while(i<arr.length);
        System.out.println("Sum is:"+sum);

        while(i>0){
            System.out.println(arr[i-1]);
            i--;
        }

        for(int n:arr){
            System.out.println(2*n);
        }

    }
    
}

