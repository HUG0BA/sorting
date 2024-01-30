public class MainSort {
    public static void main(String args[]){
        ArrayGenerator arrayGenerator = new ArrayGenerator();
        int[] arr = arrayGenerator.RandomIntegerArray(10,10);

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

        Sort sort = new Sort();

        System.out.println("-----------------------------------------------------------------------");
        sort.GnomeSort(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        
        
    }
}
