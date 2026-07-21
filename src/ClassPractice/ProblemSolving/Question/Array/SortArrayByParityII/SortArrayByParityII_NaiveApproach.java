package ClassPractice.ProblemSolving.Question.Array.SortArrayByParityII;

import java.util.Arrays;

public class SortArrayByParityII_NaiveApproach {
   public static void main(String[] args) {
        int []arr = {1,3,5,4,8,2,6,7};
        int []re = new int[arr.length];
        int e = 0;
        int o = 1;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] % 2 ==0)
            {
                re[e] = arr[i];
                e += 2;
            }
            else {
                re[o] = arr[i];
                o += 2;
            }
        }
       System.out.println(Arrays.toString(re));
   }
}
