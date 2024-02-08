package ui;

import java.io.File;
import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main( String[] args ) throws IOException
    {
        String[][] test = GenerateExpectedArray(10);

        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 10; j++){
                System.out.println(test[i][j]);
            }
        }

        UVGFileReader reader =  new UVGFileReader();

        String[][] testArray = reader.CSVToArray("/lectorTest.csv");
        System.out.println(testArray);
        String[][] expectedArray = GenerateExpectedArray(10);


        UVGFileWriter writer = new UVGFileWriter();

        writer.ArrayToCSV(expectedArray,"kiwi.csv", true);
    }

    private static String[][] GenerateExpectedArray(int rows){
        String[][] array = new String[4][rows];

        for(int j = 0; j < rows; j++){
            array[0][j] = "A" + j;
        }

        for(int j = 0; j < rows; j++){
            array[1][j] = "B" + j;
        }

        for(int j = 0; j < rows; j++){
            array[2][j] = "C" + j;
        }

        for(int j = 0; j < rows; j++){
            array[3][j] = "D" + j;
        }


        return array;
    }

    

}
