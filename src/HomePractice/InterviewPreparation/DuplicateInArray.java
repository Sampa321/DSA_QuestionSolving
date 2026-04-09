package HomePractice.InterviewPreparation;

import java.util.Arrays;
import java.util.HashSet;

public class DuplicateInArray {
    public static void main(String[] args) {
        int []arr = {1,3,4,2,2};
        //first approach
        Arrays.sort(arr);
        for(int i = 1; i < arr.length; i++)
        {
            if(arr[i-1] == arr[i])
            {
                System.out.println(arr[i]);
                return;
            }
        }

        //2nd Approach
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0;i< arr.length; i++)
        {
            if(set.contains(arr[i]))
            {
                System.out.println(arr[i]);
                return;
            }
            else {
                set.add(arr[i]);
            }
        }

    }
}
