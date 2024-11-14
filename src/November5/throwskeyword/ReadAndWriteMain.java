package November5.throwskeyword;

import java.io.FileNotFoundException;

public class ReadAndWriteMain {
    public static void main(String[] args)
    {
        ReadAndWrite r = new ReadAndWrite();
        try{
            r.readFile();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try{
            r.writeFile();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("After Exception");

    }
}
