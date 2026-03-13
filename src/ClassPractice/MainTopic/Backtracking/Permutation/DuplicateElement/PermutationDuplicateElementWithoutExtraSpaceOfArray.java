package ClassPractice.MainTopic.Backtracking.Permutation.DuplicateElement;

import java.util.Arrays;

public class PermutationDuplicateElementWithoutExtraSpaceOfArray {
    public static void main(String[] args) {
        int []arr = {1,2,3,2};
        Arrays.sort(arr);
        printArray(arr,0);
    }
    public  static void printArray(int []arr,int p)
    {
        if(p == arr.length)
        {
            System.out.println(Arrays.toString(arr));
            return;
        }
        for(int i = p;i< arr.length;i++)
        {
            if(i>p && arr[i] == arr[i-1])
            {
                continue;
            }
            swap(arr,i,p);
            printArray(arr,p+1);
            swap(arr,i,p);
        }

    }
    public static void swap(int []arr, int i,int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
