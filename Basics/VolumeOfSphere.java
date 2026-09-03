package Basics;

import java.util.Scanner;
public class VolumeOfSphere {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Your Sphere Radius: ");
        int radius= sc.nextInt();
        double Volume= (4.0/3.0)*3.14*radius*radius*radius;

        System.out.println("Volume Of Sphere Is: "+Volume);

        sc.close();
    }
}
