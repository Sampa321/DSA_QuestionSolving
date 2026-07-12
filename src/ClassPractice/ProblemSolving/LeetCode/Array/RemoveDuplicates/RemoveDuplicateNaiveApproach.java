package ClassPractice.ProblemSolving.LeetCode.Array.RemoveDuplicates;

import java.util.HashSet;

public class RemoveDuplicateNaiveApproach {
   public static void main(String[] args) {
        int []arr = {3,4,5,5,6,7,7,8,9};
       HashSet<Integer> set  = new HashSet<>();
       for(int ele : arr)
       {
           set.add(ele);
       }
    }
}
