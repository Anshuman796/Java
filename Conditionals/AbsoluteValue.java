package Conditionals;

import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Negative Number: ");
        int n= sc.nextInt();

        int absolute = -n;
        System.out.println("Absolute Value Of "+n+"Is : "+absolute);

        sc.close();
    }   
}
