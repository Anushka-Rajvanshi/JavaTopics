package operators;
public class Operators {
    public static void main(String args[]){
        //assignment
        int i=2, j=3;

        //arithmetic
        System.out.println("i+j: "+(i+j));
        System.out.println("i-j: "+(i-j));
        System.out.println("i*j: "+(i*j));
        System.out.println("i/j: "+(i/j));
        System.out.println("i%j: "+(i%j));

        //relational
        if(i==j){
            System.out.println("Equal");
        }
        if(i!=j){
            System.out.println("Not equal");
        }
        if(i<j){
            System.out.println(i+" is less than "+j);
        }

        //increament/decreament
        i++;
        --j;

        //logical
        if(i>1 && j>1){
            System.out.println("Both greater than 1.");
        }
        if(i>2|| ++j==3){
            System.out.println(j);
        }

        //ternary
        int mx = i>j?i:j;
        System.out.println("Greater number:"+ mx);
    }
    
}
