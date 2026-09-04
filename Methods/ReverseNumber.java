package Methods;

import java.util.Scanner;

public class ReverseNumber {
    public static int Reverse(int n){
        int reverse =0;
        while(n!=0){
            int lastdigit = n%10;
            reverse = reverse*10 + lastdigit;
            n/=10;
        }
        return reverse;
    }   

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Number: ");
        int n= sc.nextInt();

        int r=Reverse(n);
        System.out.print(r);

        sc.close();
        }
}
