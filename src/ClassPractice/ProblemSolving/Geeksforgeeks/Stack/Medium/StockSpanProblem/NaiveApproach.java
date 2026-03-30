package ClassPractice.ProblemSolving.Geeksforgeeks.Stack.Medium.StockSpanProblem;

import java.util.Arrays;

public class NaiveApproach {
    public static void main(String[] args) {
        int []arr = {100, 80, 90, 120};
        int []span = new int[arr.length];
        for(int i = 0;i<arr.length;i++)
        {
            int c = 1;
            for(int j = i-1;j>=0;j--)
            {
                if(arr[i]<arr[j])
                {
                    break;
                }
                else {
                    c++;
                }
            }
            span[i] = c;
        }
        System.out.println(Arrays.toString(span));
    }
}
