package ClassPractice.MainTopic.Backtracking.Permutation.UniqueElement;

import java.util.Arrays;

public class PermutationOfArrayWithoutExtraSpace {
    public static void main(String[] args) {
        int []arr = {1,2,3};
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
