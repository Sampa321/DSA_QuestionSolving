package ClassPractice.ProblemSolving.Question;

import java.util.ArrayList;
import java.util.Arrays;

public class SumOfSubsequenceArrayPrint {
    static void main(String[] args) {
        int  arr[] = {3, 34, 4, 12, 5, 2};
        int sum = 9;
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> dummy = new ArrayList<>();
        System.out.print("sum of Subset array is : ");
        subset(arr,sum,0,dummy,result);
        System.out.print(result);
    }
   public static void subset(int arr[], int sum, int counter, ArrayList<Integer> dummy, ArrayList<ArrayList<Integer>> result)
    {
        if(sum == 0)
        {
           result.add(new ArrayList<>(dummy));
           return;
        }
        if(counter == arr.length || sum<0)
        {
            return;
        }
        dummy.add(arr[counter]);
        subset(arr,sum-arr[counter],counter+1,dummy,result);
        dummy.remove(dummy.size()-1);
        subset(arr,sum,counter+1,dummy,result);
    }
}
