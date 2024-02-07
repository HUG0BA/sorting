package ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class UVGFileReader {

    /** 
     * @return Vector<String>
     * @throws IOException
     * @description Leer cada línea del archivo de texto
     */
    public String[][] CSVToArray(String fileName) throws IOException{

        ArrayList<ArrayList<String>> arrayList;
        String line = "";

        int columnAmount = 0;
        int rowAmount = 0;

        BufferedReader reader = new BufferedReader(new InputStreamReader(getClass().getResourceAsStream(fileName)));

        if((line = reader.readLine()) != null){
            String[] firstRow = line.split(",");
            columnAmount = firstRow.length;
            arrayList = new ArrayList<ArrayList<String>>(columnAmount);

            for(int i = 0; i < columnAmount; i++){
                arrayList.add(new ArrayList<String>());
            }

            for(int i = 0; i < firstRow.length; i++){
                arrayList.get(i).add(firstRow[i]);
            }

        }else{
            return new String[0][0];
        }

        while((line = reader.readLine()) != null){
            String[] row = line.split(",");
            for(int i = 0; i < row.length; i++){
                arrayList.get(i).add(row[i]);
            }
            rowAmount++;
        }
        
        String[][] array = new String[columnAmount][rowAmount];

        for(int i = 0; i < columnAmount; i++){
            for(int j = 0; j < rowAmount; j++){
                array[i][j] = arrayList.get(i).get(j);
            }
        }
        reader.close();
        
        return array;
        

    }
}
