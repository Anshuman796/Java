package Conditionals;

import java.util.Scanner;

public class SideOfTriangleOrNot {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Three Sides Of Triangle: ");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();

        if(a+b>c && a+c>b && b+c>a){
            System.out.println("Enterd Sides Are Sides Of Triangle");
        }
        else{
            System.out.println("Entered Sides Are Not Sides Of Triangle");
        }

        sc.close();
    }
}
