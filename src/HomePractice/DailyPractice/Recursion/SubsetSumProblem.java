package HomePractice.DailyPractice.Recursion;

import java.util.ArrayList;

public class SubsetSumProblem {
    public static void sumArray(int []arr, int c,int sum, ArrayList<Integer> list)
    {
        if (sum == 0){
            System.out.println(new ArrayList<>(list));
            return;
        }
        if(sum < 0 || c >= arr.length) return;
        sumArray(arr, c+1,sum, list);
        list.add(arr[c]);
        sumArray(arr, c+1, sum-arr[c], list);
        list.removeLast();
    }

   public static void main(String[] args) {
        int []arr = {1,2,3};
        int sum = 6;
       ArrayList<Integer> list = new ArrayList<>();
       sumArray(arr, 0, sum, list);
    }
}
