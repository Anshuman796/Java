package Conditionals;

import java.util.Scanner;

public class IntegerOrNot {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Your Real Number: ");
        float n = sc.nextFloat();
        int i=(int)n;

        if(n==i){
            System.out.println("Entered Number is Real Number");
        }
        else{
            System.out.println("Entered Number is Not Real");
        }

        sc.close();
    }
}
