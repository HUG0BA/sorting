import java.util.Random;

public class ArrayGenerator{

    public int[] RandomIntegerArray(int size){
        int[] arr = new int[size];

        Random rnd = new Random();       
        for (int i = 0; i < arr.length; i++){
            arr[i] = rnd.nextInt();
        }

        return arr;
    }

    public int[] RandomIntegerArray(int size, long seed){
        int[] arr = new int[size];

        Random rnd = new Random(seed);       
        for (int i = 0; i < arr.length; i++){
            arr[i] = rnd.nextInt(100);
        }

        return arr;
    }

    public int[] OrderedIntegerArray(int size){
        int[] arr = new int[size];
 
        for (int i = 0; i < arr.length; i++){
            arr[i] = i;
        }

        return arr;
    }
}