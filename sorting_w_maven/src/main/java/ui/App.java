package ui;

import java.io.IOException;
import java.util.ArrayList;
import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{

    
    public static void main( String[] args ) throws IOException
    {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Sorting : Presiones ENTER para iniciar");
        teclado.nextLine();

        boolean generateFiles = true;
        if(generateFiles){
            GenerateAllFiles();
        }

        Sorting<Integer> sorting = new Sorting<Integer>();
        for(int i = 10; i <= 3000; i++){
            FileManager fileManager = new FileManager();

            ArrayList<Integer> arrayList = fileManager.readTXTFile("/n"+i+".txt");
            Integer[] array = new Integer[i];
            for(int j = 0; j < i; j++){
                array[j] = arrayList.get(j);
            }
            
            sorting.GnomeSort(array);
            sorting.MergeSort(array);
            sorting.QuickSort(array);
            int maxNumberOfDigits = sorting.FindMaxNumberOfDigits(array);
            sorting.RadixSort(array, maxNumberOfDigits);
            sorting.selectionSort(array, array.length);

        }
    }

    public static void GenerateAllFiles() throws IOException{
        NumberGenerator generator = new NumberGenerator();

        for(int i = 10; i <= 3000; i++){
            generator.GenerateRandomNumberFile(i, "n" + i + ".txt",false);


        }

    }


    

}
