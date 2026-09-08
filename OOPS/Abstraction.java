package OOPS;

public class Abstraction {
    public static class Rectangle{
        private int length,breadth;                // Abstraction

        public void Input(int l,int b){
            length = l;
            breadth = b;
        }

        public void Area(){
            System.out.print("Area Of Reactangle is: "+length*breadth);   // Abstraction
        }
    }

    public static void main(String[] args) {
        Rectangle obj = new Rectangle();
        obj.Input(2, 02);
        obj.Area();
    }

}
