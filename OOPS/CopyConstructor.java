package OOPS;

public class CopyConstructor{
   public static class Student{
        String Name;
        int Rollno;
   
        Student(String Name, int Rollno ){         // parameterized Constructor
            this.Name = Name;
            this.Rollno = Rollno;
        }
        Student(Student s){                      // copy constructor
            this.Name = s.Name;
            this.Rollno = s.Rollno;
        }

        public void Display(){
            System.out.println(Name);
            System.out.println(Rollno);
        }
    }
    public static void main(String[] args) {
        Student s1 = new Student("Anshuman Singh",29);
        s1.Display();

        Student s2 = new Student(s1);
        s2.Display();
    }
}