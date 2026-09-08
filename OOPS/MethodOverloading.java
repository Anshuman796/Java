package OOPS;

public class MethodOverloading {
    public static class Data{
        public void Number(int x){
            System.out.print(x);
        }
        public void Number(int x,int y){
            System.out.print("Sum "+(x+y));
        }
        public void Number(char x){
            System.out.print(x);
        }
        public void Number(double x,char y){
            System.out.print(x+y);
        }
        public void Number(char y,double x){
            System.out.print(y+x);
        }
    }

    public static void main(String[] args) {
        Data obj = new Data();
        obj.Number(2,2);
        obj.Number('A');

        obj.Number('A', 20.00);
    }
}
