package ClassPractice.MainTopic.Backtracking.Permutation.DuplicateElement;

import java.util.ArrayList;
import java.util.Arrays;

public class PermutationExtraSpaceForArray {
    public static void main(String[] args) {
        int []nums = {1,2,3,2};
        boolean []track = new boolean[nums.length];
        Arrays.sort(nums);
        ArrayList<Integer> dubba = new ArrayList<>();
        printArray(nums,dubba,track);
    }
    public static void printArray(int []nums, ArrayList<Integer> dubba, boolean []track)
    {
        if(nums.length == dubba.size())  //4  //0
        {
            System.out.println(dubba);
            return;
        }
        for(int  i = 0;i<nums.length;i++)
        {
            if(i>0 && nums[i] == nums[i-1] && !track[i-1])
            {
                continue;
            }
            if(!track[i])    //DUBBA=[1]
            {
                dubba.add(nums[i]);
                track[i] = true;  //TRACK=['TRUE',,'FASLE','
                printArray(nums,dubba,track);
                dubba.remove(dubba.size()-1);
                track[i] = false;
            }
        }
    }
}
