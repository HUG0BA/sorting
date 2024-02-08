package ui;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main( String[] args ) throws IOException
    {

        GenerateAllFiles();

        /*
        FileManager fileManager = new FileManager();
        ArrayList<Integer> arrayList = fileManager.readTXTFile("/test.txt");
        System.out.println(arrayList);
        */
    }

    public static void GenerateAllFiles() throws IOException{
        NumberGenerator generator = new NumberGenerator();

        for(int i = 10; i < 20; i++){
            generator.GenerateRandomNumberFile(i, "n" + i + ".txt",false);
        }
        

    }


    

}
