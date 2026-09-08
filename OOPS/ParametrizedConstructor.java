package OOPS;

class Student{
    String Name;
    int Rollno;
    int Age;

    Student(String Name,int Rollno,int Age){
        this.Name = Name;
        this.Rollno = Rollno;
        this.Age = Age;

    }
}
public class ParametrizedConstructor {
    public static void main(String[] args){
        Student s1 = new Student("Anshuman Singh",29,18);
        System.out.println(s1.Name);
        System.out.println(s1.Rollno);
        System.out.println(s1.Age);
    }
}
