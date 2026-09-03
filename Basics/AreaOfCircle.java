package Basics;

import java.util.Scanner;
public class AreaOfCircle {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your Circle Radius: ");
        int radius= sc.nextInt();
        float Area= 3.14f*radius*radius;

        System.out.print("Area Of Circle Is: " +Area);

        sc.close();;
    }
}
