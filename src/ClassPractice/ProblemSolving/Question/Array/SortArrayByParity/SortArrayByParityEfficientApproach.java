package ClassPractice.ProblemSolving.Question.Array.SortArrayByParity;

import java.util.Arrays;

public class SortArrayByParityEfficientApproach {
   public static void main(String[] args) {
       int []arr = {1,2,3,5,89,86,7,8,82};
       int even = 0;

       for(int i = 0; i < arr.length; i++)
       {
           if(arr[i] % 2 == 0)
           {
               int temp = arr[i];
               arr[i] = arr[even];
               arr[even++] = temp;
           }
       }
       System.out.println(Arrays.toString(arr));
    }
}
