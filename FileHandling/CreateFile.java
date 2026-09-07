package FileHandling;

import java.io.File;
import java.io.IOException;

public class CreateFile{
    public static void main(String[] args){
        File myfile = new File("Student_data.txt");
        
        try{
            myfile.createNewFile();
        }
        catch(IOException e){
            System.out.print("Unable to create this file");
            e.printStackTrace();
        }
    }
}