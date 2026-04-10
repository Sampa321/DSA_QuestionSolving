package HomePractice.InterviewPreparation;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int []arr = {2, 7, 11, 15};
        int target = 9;
        int i = 0;
        int j = arr.length-1;
        int []result = new int[2];
        while (i < j)
        {
            int currentSum = arr[i] + arr[j];
            if(currentSum == target)
            {
                result[0] = i;
                result[1] = j;
                System.out.println(Arrays.toString(result));
                return;
            } else if (currentSum < target) {
                i++;
            }
            else {
                j--;
            }
        }
    }
}
