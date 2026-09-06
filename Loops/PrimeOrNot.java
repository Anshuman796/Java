package Loops;

import java.util.*;

public class PrimeOrNot{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Number: ");
        int n = sc.nextInt();

        boolean flag = false;
        if(n>1){
            for(int i=2;i<=n-1;i++){
                if(n%2!=0){
                    flag = true;
                    break;
                }
            }
            if(flag==false){
                System.out.print("Not prime");
            }
            else{
                System.out.print("Prime");
            }
        }

        sc.close();
    }
}