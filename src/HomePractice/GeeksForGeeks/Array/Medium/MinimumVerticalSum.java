package HomePractice.GeeksForGeeks.Array.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumVerticalSum {
   public static void main(String[] args) {
       ArrayList<ArrayList<Integer>> arr = new ArrayList<>(
               Arrays.asList(
                       new ArrayList<>(Arrays.asList(1, 2 ,3)),
                       new ArrayList<>(Arrays.asList(4, 5)),
                       new ArrayList<>(List.of(6))
               )
       );
       System.out.println(minimum_vertical_sum(arr));
    }
    public static int minimum_vertical_sum(ArrayList<ArrayList<Integer>> arr) {
        // code here
        int max = 0;
        for(int i = 0; i < arr.size(); i++)
        {
            for(int j = 0; j < arr.get(i).size(); j++)
            {
                if(max < arr.get(i).size())
                {
                    max = arr.get(i).size();
                }
            }
        }
        int []newArr = new int[max];
        for(int i = 0; i < arr.size(); i++)
        {
            for(int j = 0; j < arr.get(i).size(); j++)
            {
                newArr[j] += arr.get(i).get(j);
            }
        }
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < max; i++)
        {
            if(min > newArr[i])
            {
                min = newArr[i];
            }
        }
        return min;
    }
}
