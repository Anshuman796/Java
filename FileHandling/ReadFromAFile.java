package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromAFile {
    public static void main(String[] args){
        File myfile = new File("Student_data.txt");
        try {
            Scanner sc = new Scanner(myfile);
            while (sc.hasNextLine()) {
                String Line = sc.nextLine();
                System.out.println(Line);
                
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
