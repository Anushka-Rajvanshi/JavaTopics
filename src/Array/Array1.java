package array;
public class Array1{
    public static void main(String args[]){
        int arr1[] = {1,2,3,4,5};

        int arr2[];
        arr2 = new int[]{1,2,3,4,5};

        int arr3[] = new int[5];
        System.arraycopy(arr2, 0, arr3, 0, 5);

        int arr4[] = arr1.clone();
        for(int i: arr4){
            System.out.println(i);
        }
    }
}