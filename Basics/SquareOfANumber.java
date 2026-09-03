package Basics;

import java.util.Scanner;
public class SquareOfANumber {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Your Number: ");
        int n= sc.nextInt();
        int Square= n*n;

        System.out.print("Square Of Given Number: "+Square);

        sc.close();
    }
}
