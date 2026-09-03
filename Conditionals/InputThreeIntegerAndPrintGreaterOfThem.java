package Conditionals;

import java.util.Scanner;
public class InputThreeIntegerAndPrintGreaterOfThem {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in); 
        System.out.print("Enter Your Three Number: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        
        if(n1>=n2 && n1>=n3){
            System.out.print("n1 is Greater: "+n1);
        }
        else if(n2>=n1 && n2>=n3){
            System.out.println("n2 is greater: "+ n2);
        }
        else{
            System.out.println("n3 is Greater: "+n3);
        }

        sc.close();
    }  
}
