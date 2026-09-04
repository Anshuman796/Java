package Arrays;

import java.util.Scanner;

public class MarksAndRollNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Student: ");
        int Student = sc.nextInt();

        int [] marks = new int[Student];
        System.out.println("Enter The marks Of Student: ");

        for(int i=0;i<=Student-1;i++){
            marks[i]= sc.nextInt();
        }

        for(int i=0;i<=Student-1;i++){
            if(marks[i]<35){
                System.out.print(i);
            }
        }



        sc.close();
    }
}