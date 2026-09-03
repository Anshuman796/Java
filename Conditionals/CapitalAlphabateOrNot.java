package Conditionals;

import java.util.Scanner;

public class CapitalAlphabateOrNot {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Your alphabate: ");
        char c= sc.next().charAt(0);
        int ASCII = (int)c;

        if(ASCII>=65 && ASCII<=90){
            System.out.println("It is Capital Alphabate: "+ c);
        }
        else{
            System.out.println("It is not Capital Alphabate: "+ c);
        }

        sc.close();
    }
}
