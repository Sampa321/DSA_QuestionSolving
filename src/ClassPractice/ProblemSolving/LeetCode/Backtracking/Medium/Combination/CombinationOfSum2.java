package ClassPractice.ProblemSolving.LeetCode.Backtracking.Medium.Combination;

import java.util.ArrayList;
import java.util.Arrays;

public class CombinationOfSum2 {
    static void main() {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        ArrayList<Integer> dubba = new ArrayList<>();
        int a[] = {2,5,2,1,2};
        int target = 5;
        Arrays.sort(a);
        printCombination(0,target,dubba,result,a);
        System.out.println(result);
    }
    public static void printCombination(int index, int t, ArrayList<Integer> dubba, ArrayList<ArrayList<Integer>> result,int []a)
    {
        if (t == 0)
        {
            result.add(new ArrayList<>(dubba));
            return;
        }
        if(index == a.length) return;
        for(int i = index;i<a.length;i++)
        {
            if(i>index && a[i] == a[i-1])
            {
                continue;
            }
            if(t<a[i]) break;
            dubba.add(a[i]);
            printCombination(index+1,t-a[i],dubba,result,a);
            dubba.removeLast();
        }
    }
}
