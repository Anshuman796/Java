package Methods;

public class SwappingOfNumbers {
    public static void main(String[] args){

        int x=10,y=20;
        System.out.println(x+" "+y);

        int temp = x;
        x=y;
        y=temp;

        System.out.print(x+" "+y);
    }
}
