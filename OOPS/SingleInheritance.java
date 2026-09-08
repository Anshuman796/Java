package OOPS;

class Parent{                            // Base class
    public String surname = "Thakur";
}
class child extends Parent{              // Derived class
    public String Name ="Anshuman Singh";

    public void display(){
        System.out.print(Name+" "+surname);
    }
}
public class SingleInheritance {
    public static void main(String[] args){
        child obj = new child();
        obj.display();
    }
}
