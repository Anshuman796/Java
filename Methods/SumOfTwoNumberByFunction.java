package Methods;

import java.util.Scanner;

public class SumOfTwoNumberByFunction {

    public static int sum(int x, int y){
        return x+y;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int result=sum(2,2);

        System.out.print(result);


        sc.close();
    }
}
