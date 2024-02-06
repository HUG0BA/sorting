package ui;

import static org.junit.Assert.*;

import org.junit.Test;

public class SortingTest {
    
    @Test
    public void TestGnomeSorting(){
        Sorting<Integer> sorting = new Sorting<Integer>();

        Integer[] testArray = GenerateTestArray(25);
        Integer[] orderedTestArray = GenerateOrderedTestArray(25);

        sorting.GnomeSort(testArray);

        assertArrayEquals(orderedTestArray, testArray);

    }

    @Test
    public void TestQuickSort(){
        Sorting<Integer> sorting = new Sorting<Integer>();

        Integer[] testArray = GenerateTestArray(25);
        Integer[] orderedTestArray = GenerateOrderedTestArray(25);

        sorting.QuickSort(testArray);

        assertArrayEquals(orderedTestArray, testArray);
    }

    @Test
    public void TestRadixSort(){
        Sorting<Integer> sorting = new Sorting<Integer>();

        Integer[] testArray = GenerateTestArray(25);
        Integer[] orderedTestArray = GenerateOrderedTestArray(25);

        sorting.RadixSort(testArray, 2);

        assertArrayEquals(orderedTestArray, testArray);
    }


    public Integer[] GenerateTestArray(int size){
        Integer[] testArray = new Integer[size];
        for(int i = 0; i < size; i++){
            testArray[i] = size - i;
        }
        return testArray;
    }

    public Integer[] GenerateOrderedTestArray(int size){
        Integer[] orderedTestArray = new Integer[size];
        for(int i = 0; i < size; i++){
            orderedTestArray[i] = i + 1;
        }
        return orderedTestArray;
    }

}
