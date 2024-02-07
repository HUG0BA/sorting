package ui;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

public class UVGFileWriter {
    public void ArrayToCSV(String[][] array, String fileName, boolean isTest) throws IOException{
        String s = System.getProperty("java.class.path");
        String[] arr = s.split("target");
        String filePath;
        if(isTest){
            filePath = arr[0] + "src\\test\\resources\\" + fileName;
        }else{
            filePath = arr[0] + "src\\main\\resources\\" + fileName;
        }
        
        System.out.println(arr[0]);
        System.out.println(filePath);
        System.out.println(s);


        BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
        String row = "";
        for(int i = 0; i < array.length; i++){

            row = "";
            int rowLenght = array[i].length;

            for(int j = 0; j < rowLenght; j++){
                row = row + array[i][j]+",";
            }

            row = row + "\n";

            writer.write(row);
        }

        writer.close();

    }
}
