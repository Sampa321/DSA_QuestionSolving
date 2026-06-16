package ClassPractice.ProblemSolving.Geeksforgeeks.Array.Medium.SumOfSubarrayMinimum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NaiveApproach {
    public static void main(String[] args) {
        int []arr = {10, 20};
        System.out.println(sumSubMins(arr));
    }
    public static int sumSubMins(int[] arr) {
        // code here
        if(arr.length == 1) return arr[0];
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for(int i = 0; i < arr.length; i++)
        {
            ArrayList<Integer> subArray = new ArrayList<>();
            for(int j = i; j< arr.length; j++)
            {
                subArray.add(arr[j]);
                Collections.sort(subArray);
                list.add(new ArrayList<>(subArray));
            }
        }
        int sum = 0;
        for(int i = 0; i < list.size(); i++)
        {

            sum += list.get(i).getFirst();
        }
        return sum;
    }
}
