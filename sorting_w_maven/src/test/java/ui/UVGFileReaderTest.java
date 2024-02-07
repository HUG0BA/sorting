package ui;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

public class UVGFileReaderTest {
    

    @Test
    public void CSVtoArrayTest()  throws IOException{
        UVGFileReader lector = new UVGFileReader();

        String[][] testArray = lector.CSVToArray("/lectorTest.csv");
        String[][] expectedArray = GenerateExpectedArray(9);

        for(int i = 0; i < 4; i++){
            assertArrayEquals(expectedArray[i], testArray[i]);
        }
    }

    private String[][] GenerateExpectedArray(int rows){
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
