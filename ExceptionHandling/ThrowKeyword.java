package ExceptionHandling;

import java.util.Scanner;

public class ThrowKeyword {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        try{
            if(age<18){
                throw new ArithmeticException("Age is Less Than 18");  
            }                 // ArithmeticException e = new ArithmeticException("Error")
            System.out.println("Eligible");
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }


        sc.close();
    }
}
