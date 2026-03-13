package ClassPractice.MainTopic.Backtracking.Permutation.UniqueElement;

import java.util.ArrayList;

public class PermutationOfArrayUsingExtraSpace {
        public static void main(String[] args) {
            int nums[] = {1,2,3};
            boolean []track = new boolean[nums.length];
            ArrayList<Integer> dubba = new ArrayList<>();
            f(nums,dubba,track);
        }
        public static void f(int []nums, ArrayList<Integer> dubba, boolean []track)
        {
            if(nums.length == dubba.size())
            {
                System.out.println(dubba);
                return;
            }
            for(int  i =0;i<nums.length;i++)
            {
                if(!track[i])
                {
                    dubba.add(nums[i]);
                    track[i] = true;
                    f(nums,dubba,track);
                    dubba.remove(dubba.size()-1);
                    track[i] = false;
                }
            }
        }

}
