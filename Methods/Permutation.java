package Methods;

import java.util.Scanner;

public class Permutation {
    public static int factorial(int x){
        int fact=1;
        for(int i=1;i<=x;i++){
            fact*=i;
        }
        return fact;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Value of n: ");
        int n = sc.nextInt();
        System.out.print("Enter Value of r: ");
        int r = sc.nextInt();

        int npr= factorial(n)/(factorial(n-r)*factorial(r));

        System.out.print(npr);

        sc.close();
    }    
}
