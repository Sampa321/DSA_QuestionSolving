package ClassPractice.ProblemSolving.Geeksforgeeks.Deque.Medium.KsizedSubarrayMaximum;
/*
Max & min of all subarrays of size 'k'.
 */
import java.util.ArrayList;

public class NaiveApproach {
    public static void main(String []args) {
        ArrayList<Integer> maxRe = new ArrayList<>();
        ArrayList<Integer> minRe = new ArrayList<>();
        int []arr = {7,18,15,10,21,13};
        int k = 3;
        for(int i = 0; i < arr.length-k+1; i+=1)
        {
            int max = arr[i];
            int min = arr[i];
            for(int j = i; j < i+k; j++)
            {
                if(max < arr[j])
                {
                    max = arr[j];
                }
                if(min > arr[j])
                {
                    min = arr[j];
                }
            }
            maxRe.add(max);
            minRe.add(min);

        }
        System.out.println(maxRe);
        System.out.println(minRe);
    }
}
