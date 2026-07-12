package ClassPractice.MainTopic.Sorting;

import java.util.Arrays;

public class QuickSort {
   public static void main(String[] args) {
        int []arr = {9,5,7,8,47,224,6,2,6,24};
        Quicksort(arr, 0, arr.length-1);
       System.out.println(Arrays.toString(arr));
    }
    public static void Quicksort(int []arr, int l, int r)
    {
        if(l < r)
        {
            int partitionIndex = partition(arr, l, r);
            Quicksort(arr, l, partitionIndex-1);
            Quicksort(arr, partitionIndex+1, r);
        }
    }
    public static int partition(int []arr, int l, int r)
    {
        int pivot = arr[l];
        int i = l;
        int j = r;
        while (i < j)
        {
            while (arr[i] < pivot && i <= r)
            {
                i++;
            }
            while (arr[j] > pivot && j >= l+1)
            {
                j--;
            }
            if(i < j)
            {
                int temp = arr[j];
                arr[j] = arr[l];
                arr[l] = temp;
                return j;
            }
        }
        int t = arr[j];
        arr[j] = pivot;
        arr[l] = t;
        return j;
    }
}
