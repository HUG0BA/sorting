package ui;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;

import org.junit.Test;

public class UVGWriterTest {
    
    @Test
    public void ArrayToCSVTest() throws IOException{
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
