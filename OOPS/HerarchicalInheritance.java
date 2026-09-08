package OOPS;

class Parent{
    public String surname ="Thakur";
}
class Child1 extends Parent{
    public String Name = "Anshuman";

    public void display(){
        System.out.println(Name+" "+surname);
    }
}
class Child2 extends Parent{
    public String Name = "Ankit";

    public void display(){
        System.out.println(Name+" "+surname);
    }
}


public class HerarchicalInheritance {
    public static void main(String[] args){
        Child1 obj1 = new Child1();
        Child2 obj2 = new Child2();

        obj1.display();
        obj2.display();
    }
}
