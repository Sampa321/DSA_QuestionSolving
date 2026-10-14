package HomePractice.DailyPractice.Backtracking.UniqueElement;

import java.util.Arrays;

public class PermutationOfArrayWithoutExtraSpace1 {
    public static void permutation(int []arr, int p){
        if (p == arr.length)
        {
            System.out.println(Arrays.toString(arr));
            return;
        }
        for (int i = p; i < arr.length; i++)
        {
            swap(arr, i, p);
            permutation(arr, p+1);
            swap(arr, i, p);
        }
    }

    public static void swap(int []arr, int i, int p)
    {
        int temp = arr[i];
        arr[i] = arr[p];
        arr[p] = temp;
    }

   public static void main(String[] args) {
        int []arr = {1,2,3};
        permutation(arr, 0);
    }
}
