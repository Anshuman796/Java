package FileHandling;

import java.io.File;

public class DeleteAFile {
    public static void main(String[] args){
        File myfile = new File("Student_data.txt");
        if(myfile.delete()){
            System.out.print(myfile+"Deleted Successfully");
        }
        else{
            System.out.print("Error Occured During Deletion");
        }
    }
}
