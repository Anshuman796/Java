package Basics;
import java.util.Scanner;
public class SumOfTwoNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        int n1= sc.nextInt();
        System.out.print("Enter your Second Number: ");
        int n2= sc.nextInt();

        int sum= n1+n2;
        System.out.println("Sum of two numbers is: "+sum);

        sc.close();
    }   
}
