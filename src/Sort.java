public class Sort {
    
    public int[] GnomeSort(int[] arr){
        int i = 0;
        while(i<arr.length-1){
            if(arr[i] > arr[i+1]){

                Swap(arr, i, i+1);

                if(i==0) i++;
                else i--;

            }else{
                i++;
            }
        }

        return arr;
    }


    public void Swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
