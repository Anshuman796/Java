package Methods;

public class SwappingOfNumbersMethod2 {
    public static void main(String[] args){

        int x=10,y=20;
        System.out.println(x+" "+y);

        x=x+y;
        y=x-y;
        x=x-y;
        System.out.print(x+" "+y);
    }
}
