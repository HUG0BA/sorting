package ui;

import java.io.IOException;
import java.util.*;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) throws IOException
    {
        Scanner teclado = new Scanner(System.in);
        Sorting<Integer> sorter = new Sorting<Integer>();
        System.out.println("Sorting, Seleccione una opcion");
        System.out.println("1. Gnome Sorting");
        System.out.println("2. Quick Sorting");
        System.out.println("3. Radix Sorting");
        System.out.println("4. Merge Sorting");
        System.out.println("5. Selection Sorting");
        int option = teclado.nextInt();
        switch (option) {
            case 1:
                System.out.println("1. Gnome Sorting");
                sorter.GnomeSort();
                break;
            case 2:
                System.out.println("2. Quick Sorting");
                sorter.QuickSort();
                
                break;
            case 3:
                System.out.println("3. Radix Sorting");
                sorter.RadixSort(null, 3000);
                
                break;
            case 4:
                System.out.println("4. Merge Sorting");
                sorter.MergeSort();
                
                break;
            case 5:
                System.out.println("5. Selection Sorting"); 
                sorter.selectionSort(, .length);
                break;
        
            default:
                break;
        }
    }
}
