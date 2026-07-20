package ClassPractice.ProblemSolving.Geeksforgeeks.Array.Easy;

import java.util.Arrays;

public class MovesZeroAtTheEnd {
   public static void main(String[] args) {
        int []arr = {1,2,4,0,0,4,9,1,0};
        int i = -1;

        //Keep track of 1st zero element
        for(int j = 0; j < arr.length; j++)
        {
            if(arr[j] == 0)
            {
                i = j;
                break;
            }
        }

        //If no any ele of 0 return array.
        if(i  == -1)
        {
            System.out.println(Arrays.toString(arr));
            return;
        }

        for(int j = i+1; j < arr.length; j++)
        {
            if(arr[j] != 0)
            {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
        }
       System.out.println(Arrays.toString(arr));
    }
}
