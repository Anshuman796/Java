package Vector;

import java.util.Scanner;
import java.util.Vector;

public class TraversingInVector {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Your Vector Size: ");
        int n = sc.nextInt();

        Vector<Integer> vec = new Vector<>(n);
        System.out.println("Enter Your Vector Element: ");
        for(int i=0;i<=n-1;i++){
            vec.add(sc.nextInt());
        }

        for(int i=0;i<=n-1;i++){
            System.out.print(vec.get(i)+" ");
        }


        sc.close();
    }  
}
