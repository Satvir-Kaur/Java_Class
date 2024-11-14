package November5.throwskeyword;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ReadAndWrite {
     public void readFile() throws FileNotFoundException
     {
         FileInputStream fis= new FileInputStream("d:/ABC.txt");
     }

     public void writeFile() throws FileNotFoundException
     {
         FileOutputStream fos= new FileOutputStream("d:/XYZ.txt");
     }
}
