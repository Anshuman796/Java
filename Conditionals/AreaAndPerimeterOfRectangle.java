package Conditionals;

import java.util.Scanner;

public class AreaAndPerimeterOfRectangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Length: ");
        int length = sc.nextInt();
        System.out.print("Enter Your Breadth: ");
        int breadth= sc.nextInt();

        int Area = length*breadth;
        int Perimeter = 2*(length+breadth);

        if(Area>Perimeter){
            System.out.println("Area Of Reactangle Is Greater: "+ Area);
        }
        else if(Perimeter>Area){
            System.out.println("Perimeter Of Rectangle Is Greater: "+ Perimeter);
        }
        else{
            System.out.println("Both are Equal");
        }

        sc.close();
    }
}
