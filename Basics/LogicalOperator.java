package Basics;

public class LogicalOperator {
    public static void main(String[] args){
        int a=20;
        int b=10;

        if(a>b && b>a){                      // logical and
            System.out.println("Anshuman Singh");
        }
        else if(a>b || b>a){                   // logical or
            System.out.println("Ankit Yadav");
        }
        else{
            System.out.println("Sumit Singh");
        }
    }
}
