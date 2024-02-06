package ui;

import java.util.ArrayList;

public class Sorting<T extends Comparable<T>> {

    public void GnomeSort(T[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (i == 0) {
                i++;
            }
            if (arr[i].compareTo(arr[i - 1]) >= 0) {
                i++;
            } else {
                Swap(arr, i, i - 1);
                i--;
            }

        }
    }

    public void QuickSort(T[] arr) {
        QuickSortRecursive(arr, 0, arr.length - 1);
    }

    private int Partition(T[] arr, int leftIndex, int rightIndex) {
        while (true) {
            while (leftIndex < rightIndex && arr[leftIndex].compareTo(arr[rightIndex]) < 0)
                rightIndex--;
            if (leftIndex < rightIndex)
                Swap(arr, leftIndex, rightIndex);
            else
                return leftIndex;

            while (leftIndex < rightIndex && arr[leftIndex].compareTo(arr[rightIndex]) < 0)
                leftIndex++;
            if (leftIndex < rightIndex)
                Swap(arr, leftIndex, rightIndex);
            else
                return rightIndex;
        }
    }

    private void QuickSortRecursive(T[] arr, int leftIndex, int rightIndex) {
        if (leftIndex >= rightIndex)
            return;
        int pivot = Partition(arr, leftIndex, rightIndex);
        QuickSortRecursive(arr, leftIndex, pivot - 1);
        QuickSortRecursive(arr, pivot + 1, rightIndex);
    }

    public void RadixSort(Integer[] arr, int maxNumberOfDigits) {
        for (int i = 0; i < maxNumberOfDigits; i++) {
            BucketPass(arr, i);
        }
    }

    private int Digit(int n, int d) {
        if (d == 0)
            return n % 10;
        else
            return Digit(n / 10, d - 1);
    }

    private void BucketPass(Integer[] arr, int d) {

        int i, j;
        int value;
        int dthDigit;
        int bucketSize;
        int n = arr.length;

        ArrayList<ArrayList<Integer>> buckets = new ArrayList<ArrayList<Integer>>();

        for (j = 0; j < 10; j++) {
            System.out.print(buckets);
            buckets.add(j, new ArrayList<Integer>());
        }

        for (i = 0; i < n; i++) {
            value = arr[i];

            dthDigit = Digit(value, d);

            buckets.get(dthDigit).add(value);

        }

        i = n;
        for (j = 9; j >= 0; j--) {
            while (!buckets.get(j).isEmpty()) {
                i--;

                bucketSize = buckets.get(j).size();
                value = buckets.get(j).remove(bucketSize - 1);

                arr[i] = value;

            }

        }

    }

    public void Swap(T[] arr, int i, int j) {
        T iValue = arr[i];
        arr[i] = arr[j];
        arr[j] = iValue;
    }

}