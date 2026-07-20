package ClassPractice.ProblemSolving.Question.Array;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
   public static void main(String[] args) {
        int []arr = {2, 7, 11, 15};
        int target = 9;
        int []result = new int[2];
       HashMap<Integer, Integer> map = new HashMap<>();
       for(int i = 0; i < arr.length; i++)
       {
           int temp = target - arr[i];
           if(map.containsKey(temp))
           {
               result[0] = map.get(temp);
               result[1] = i;
           }
           map.put(arr[i],i);
       }
       System.out.println(Arrays.toString(result));
    }
}
