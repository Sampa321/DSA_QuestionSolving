package HomePractice.DailyPractice.Backtracking.UniqueElement;

import java.util.ArrayList;

public class PermutationOfArrayWithExtraSpace {
    public static void permutationOfArray(int []arr, ArrayList<Integer> list, boolean []track){
        if (list.size() == arr.length)
        {
            System.out.println(new ArrayList<>(list));
            return;
        }
        for (int i = 0; i < arr.length; i++)
        {
            if(!track[i])
            {
                list.add(arr[i]);
                track[i] = true;
                permutationOfArray(arr, list, track);
                list.removeLast();
                track[i] = false;
            }
        }
    }

   public static void main(String[] args) {
        int []arr = {1,2,3,4};
       ArrayList<Integer> list = new ArrayList<>();
       boolean []track = new boolean[arr.length];
       permutationOfArray(arr, list, track);
    }
}
