package OOPS;

class Encap{
        public String Name;
        private int age;

        Encap(String Name,int age){
            this.Name = Name;
            this.age = age;
        }

        public void setage(int x){
            age = x;
        }

        public void getage(){
            System.out.print(age);
        }

        public void display(){
            System.out.println(Name+" "+age);
        }
    }

public class Encapsulation {
   
    public static void main(String[] args){
        Encap obj = new Encap("Anshuman Singh",18);
        obj.display();

        obj.Name = "Ankit";

        //obj.age = 19;                   -->Not allowed because age is private in Encap Class

        obj.setage(19);
        obj.getage();

        obj.display();
    }
}
