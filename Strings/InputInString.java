package Strings;

import java.util.Scanner;

public class InputInString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       // String str = sc.next();              // it take input only at the first space
        
       String str = sc.nextLine();
       System.out.print(str);

        sc.close();
    }
    
}
