package HomePractice.DailyPractice.Backtracking;

import java.util.ArrayList;
import java.util.Arrays;

public class CombinationSumI {
    public static void combination(int []arr, int target, ArrayList<Integer> list, int index){
        if(target == 0)
        {
            System.out.println(new ArrayList<>(list));
            return;
        }

        if (index == arr.length) return;
        for(int i = index; i < arr.length; i++)
        {
            if (i > index && arr[i-1] == arr[i]) continue;
            if (target < arr[i]) break;
            list.add(arr[i]);
            combination(arr, target-arr[i], list, i+1);
            list.removeLast();
        }
    }
   public static void main(String[] args) {
        int []arr = {1,2,1,3,6,7};
        int target = 7;
       Arrays.sort(arr);
       ArrayList<Integer> list = new ArrayList<>();
       combination(arr, target, list, 0);
    }
}
