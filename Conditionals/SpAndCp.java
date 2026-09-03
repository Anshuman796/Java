package Conditionals;

import java.util.Scanner;

public class SpAndCp {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Your Selling Price: ");
        int sp= sc.nextInt();
        System.out.print("Enter Your Cost Price: ");
        int cp= sc.nextInt();

        if(sp>cp){
            System.out.println("Profit "+(sp-cp));
        }
        else if(cp>sp){
            System.out.println("Loss "+(cp-sp));
        }
        else{
            System.out.println("No profit no loss "+(sp-cp));
        }

        sc.close();
    }  
}
