package FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToAFile {
    public static void main(String[] args){
        try{
            FileWriter myFileWriter = new FileWriter("Student_data.txt");
            myFileWriter.write("This Is My first Java File");
            myFileWriter.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }

    }
}
