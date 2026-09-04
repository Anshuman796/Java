package Loops;

import java.util.Scanner;


public class ReverseOfaNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Number: ");
        int n = sc.nextInt();

        int reverse= 0;
        while(n!=0){
            int lastdigit= n%10;
            reverse= lastdigit+reverse*10;
            n/=10;
        }
        System.out.print(reverse);

        sc.close();
    }
}
