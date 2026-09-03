package Basics;

import java.util.Scanner;
public class ASCIIValue {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Your Character For Their ASCII Value: ");
        char c= sc.next().charAt(0);
        int ASCII =(int)c;

        System.out.println("ASCII Value Of "+c+" is : "+ASCII);


        sc.close();
    }   
}
