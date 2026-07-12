package ClassPractice.MainTopic.Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int []arr = {9,5,7,8,5,73,55,23,44};
        mergeSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void mergeSort(int []arr, int l, int r)
    {
        if(l < r)
        {
            int mid = (l+r)/2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid+1, r);
            merge(arr, l, mid, r);
        }
    }
    public static void merge(int []arr, int l, int mid, int r)
    {
        int []temp = new int[r-l+1];
        int i = l;
        int j = mid+1;
        int k = 0;
        while (i <= mid && j <= r)
        {
            if(arr[i] <= arr[j])
            {
                temp[k++] = arr[i++];
            }
            else {
                temp[k++] = arr[j++];
            }
        }
        while (i <= mid)
        {
            temp[k++] = arr[i++];
        }
        while (j <= r)
        {
            temp[k++] = arr[j++];
        }
        for (i = l; i <= r; i++)
        {
            arr[i] = temp[i-l];
        }
    }
}
