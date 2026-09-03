package Conditionals;

import java.util.Scanner;

public class FourDigitNumberOrNot {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your Number: ");
        int n= sc.nextInt();

        if(n>999 && n<10000){
            System.out.println("Entered Number Is Four Digit number: "+n);
        }
        else{
           System.out.println("Entered Number Is Not Four Digit Number: "+n); 
        }

        sc.close();
    }  
}
