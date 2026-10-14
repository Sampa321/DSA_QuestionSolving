package HomePractice.DailyPractice.Backtracking.DuplicateElement;

import java.util.ArrayList;
import java.util.Arrays;

public class PermutationArrayWithExtraSpace {
    public static void permutation(int []arr, ArrayList<Integer> list, boolean []track){
        Arrays.sort(arr);
        if (list.size() == arr.length)
        {
            System.out.println(new ArrayList<>(list));
            return;
        }
        for(int i = 0; i < arr.length; i++)
        {
            if (i > 0 && arr[i-1] == arr[i] && !track[i-1]) continue;
            if (!track[i])
            {
                list.add(arr[i]);
                track[i] = true;
                permutation(arr, list, track);
                list.removeLast();
                track[i] = false;
            }
        }
    }
   public static void main(String[] args) {
        int []arr = {1,2,1,6};
        ArrayList<Integer> list = new ArrayList<>();
        boolean []track = new boolean[arr.length];
        permutation(arr, list, track);
    }
}
