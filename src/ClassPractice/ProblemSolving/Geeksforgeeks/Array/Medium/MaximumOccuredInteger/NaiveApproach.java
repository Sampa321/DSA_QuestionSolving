package ClassPractice.ProblemSolving.Geeksforgeeks.Array.Medium.MaximumOccuredInteger;
/*
You are given two integer arrays L[] and R[], where each L[i] and R[i] define the start and end of a range respectively. The goal is to find the integer that appears in the most number of these ranges. If multiple integers occur in the same maximum number of ranges, then return the smallest integer among them.

Examples :

Input: L[] = [1, 4, 3, 1], R[] = [15, 8, 5, 4]
Output: 4
Explanation: The given ranges are [1, 15] [4, 8] [3, 5] [1, 4]. The smallest number that is most common or appears most times in the ranges is 4.
Input: L[] = [1, 5, 9, 13, 21], R[] = [15, 8, 12, 20, 30]
Output: 5
Explanation: The given ranges are [1, 15] [5, 8] [9, 12] [13, 20] [21, 30]. The smallest number that is most common or appears most times in the ranges is 5.
 */
import java.util.ArrayList;
import java.util.List;

public class NaiveApproach {
   public static void main(String[] args) {
       ArrayList<Integer> L = new ArrayList<>();
       ArrayList<Integer> R = new ArrayList<>();
       L.add(1);
       L.add(4);
       L.add(3);
       L.add(1);
       R.add(15);
       R.add(8);
       R.add(5);
       R.add(4);
       System.out.println(maxOccured(L, R));
   }
    public static int maxOccured(List<Integer> L, List<Integer> R) {
        // code here
        int Rmax = 0;
        for(int i = 0; i < R.size(); i++)
        {
            Rmax = Rmax < R.get(i)?R.get(i) : Rmax;
        }
        int []arr = new int[Rmax+1];
        for(int i = 0; i< L.size(); i++)
        {
            for(int j = L.get(i); j <= R.get(i); j++)
            {
                arr[j]++;
            }
        }
        int maxFreq = 0;
        int resultIndex = 0;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] > maxFreq)
            {
                maxFreq = arr[i];
                resultIndex = i;
            }
        }
        return resultIndex;
    }
}
