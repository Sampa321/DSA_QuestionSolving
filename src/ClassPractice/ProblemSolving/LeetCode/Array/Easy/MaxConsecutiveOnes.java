package ClassPractice.ProblemSolving.LeetCode.Array.Easy;

public class MaxConsecutiveOnes {
   public static void main(String[] args) {
       int []arr = {0,1,0,1,1,1,1,0,1,1,1};
       int maxOnes = 0;
       int one = 0;
       for(int ele : arr)
       {
           if(ele == 1)
           {
               one++;
               maxOnes = Math.max(maxOnes, one);
           }
           else {
               one = 0;
           }
       }
       System.out.println(maxOnes);
    }
}
