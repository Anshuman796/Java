package OOPS;

class A{
    public void ShowA(){
        System.out.print("Class A Is Called");
    }
}
class B extends A{
    public void ShowB(){
        System.out.print("Class B Is Called");
    }
}
class C extends B{
    public void ShowC(){
        System.out.print("Class C Is Called");
    }
}
public class MultiLevelInheritance {
    public static void main(String[] args){
        C obj = new C();
        obj.ShowA();
        obj.ShowB();
        obj.ShowC();
       
    }
}
