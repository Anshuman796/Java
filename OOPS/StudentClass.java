package OOPS;

public class StudentClass{
    public static class Student{       // User Define class
        
        String Name;                  // these are the attributes(properties of a class Student)
        int Rollno;
        double percentage;

    }

    public static void main(String[] args){
        Student s1 = new Student();            // s1 is an object of Student class
        s1.Name = "Anshuman Singh";
        s1.Rollno = 29;
        s1.percentage = 80.08;

        Student s2 = new Student();           // s2 is an object of Student class
        System.out.println(s2.Name);           // --> it gives null 
        System.out.println(s2.Rollno);        // --> it gives 0
        System.out.println(s2.percentage);    // --> it gives 0.0

        // if you do not initlize the attributes of a class then it gives Default Values On Printing The output
        // as you can see on the above code (null, 0 etc..)
    }
}