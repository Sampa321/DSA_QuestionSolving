package HomePractice.DailyPractice.Backtracking.DuplicateElement;

import java.util.Arrays;

public class PermutationArrayWithoutExtraSpace {
    public static void permutation(int []arr, int p){
        if (p == arr.length)
        {
            System.out.println(Arrays.toString(arr));
            return;
        }
        for (int i = p ; i < arr.length; i++)
        {
            if (i > p && arr[i-1] == arr[i]) continue;
            swap(arr, i, p);
            permutation(arr, p+1);
            swap(arr, i, p);
        }
    }


    public static void swap(int []arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
   public static void main(String[] args) {
        int []arr = {1,2,1,2};
        Arrays.sort(arr);
        permutation(arr, 0);
    }
}
