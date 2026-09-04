package Arrays;

public class PassingArrayToMethods {
    public static void value(int[] Anshuman){
        Anshuman[1]=0;
    }
    public static void main(String[] args){
        int [] arr={10,20,30,40,50};

        System.out.println(arr[1]);
        value(arr);                 // it means array pass by refrence to a function
        System.out.println(arr[1]);
    }
}
