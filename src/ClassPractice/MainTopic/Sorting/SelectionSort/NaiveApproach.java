package ClassPractice.MainTopic.Sorting.SelectionSort;
// T.C = O(n^2), S.C = O(n)
import java.util.Arrays;

public class NaiveApproach {
   public static void main(String[] args) {
       int  []arr = {5, 1, 7, 3};
       int []re = new int[arr.length];
        for(int i = 0; i < arr.length; i++)
        {
            int minimum = i;
            for(int j = 0; j < arr.length; j++)
            {
                minimum = arr[j] < arr[minimum] ? j : minimum;
            }
            re[i] = arr[minimum];
            arr[minimum] = Integer.MAX_VALUE;
        }
       System.out.println(Arrays.toString(re));
    }
}
