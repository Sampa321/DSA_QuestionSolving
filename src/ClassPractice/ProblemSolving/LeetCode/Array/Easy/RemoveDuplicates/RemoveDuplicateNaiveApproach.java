package ClassPractice.ProblemSolving.LeetCode.Array.Easy.RemoveDuplicates;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicateNaiveApproach {
   public static void main(String[] args) {
        int []arr = {3,4,5,5,6,7,7,8,9};
        int k = 1;
       HashSet<Integer> set  = new HashSet<>();
       set.add(arr[0]);
       for(int ele : arr)
       {
          if(!set.contains(ele))
          {
              set.add(ele);
              arr[k++] = ele;
          }
       }
       System.out.println(Arrays.toString(arr));
    }
}
