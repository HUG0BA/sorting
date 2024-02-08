package ui;

import java.util.Random;
import java.io.IOException;
import java.util.ArrayList;

public class NumberGenerator{
    
    public void GenerateRandomNumberFile(int numberAmount, String fileName, boolean isTest) throws IOException{

        Random random = new Random();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        for(int i = 0; i < numberAmount; i++){
            arrayList.add(random.nextInt());
        }

        FileManager fileManager = new FileManager();
        fileManager.writeTXTFile(arrayList,fileName, isTest);
        
    }
}
