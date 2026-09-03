package Basics;

import java.util.Scanner;
public class TernaryOperator {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your Number: ");
        int a= sc.nextInt();

        System.out.print((a%2==0)? "Even" : "Odd");       // Ternary Operator

        sc.close();
    }
}
