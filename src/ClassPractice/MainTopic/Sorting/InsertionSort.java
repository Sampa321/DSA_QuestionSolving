package ClassPractice.MainTopic.Sorting;
// S.C = O(n^2), T.C = O(1)

import java.util.Arrays;

public class InsertionSort {
   public static void main(String[] args) {
        int []arr = {9,5,7,3,17,27,2,72,7,4};
        for(int i = 1; i < arr.length; i++)
        {
            int temp = arr[i];
            int j = i-1;
            while (j >= 0 && temp < arr[j])
            {
                arr[j+1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
       System.out.println(Arrays.toString(arr));
    }
}
