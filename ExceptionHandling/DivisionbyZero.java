package ExceptionHandling;

import  java.util.Scanner;

public class DivisionbyZero {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        try{
            int n = a/b;
            System.out.println(n);
            
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("I will Always run Weather Exception occur or not");
        }

        


        sc.close();
    }
}
