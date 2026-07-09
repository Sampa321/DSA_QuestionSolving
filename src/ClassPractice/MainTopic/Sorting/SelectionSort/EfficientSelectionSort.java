package ClassPractice.MainTopic.Sorting.SelectionSort;

import java.util.Arrays;
// T.C = O(n^2), S.C = O(1)

public class EfficientSelectionSort {
    public static void main(String[] args) {
        int []arr = {7, 3, 5, 1};
        for(int i = 0; i < arr.length; i++)
        {
            int minIndex = i;
            for(int j = i+1; j < arr.length; j++)
            {
                if(arr[j] < arr[minIndex])
                {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
