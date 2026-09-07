package ExceptionHandling;

import java.util.Scanner;

public class InputMismatch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Value: ");
        
        try{
            int n = sc.nextInt();
            System.out.println(n);
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("Code Run");
        }


        sc.close();
    }
}
