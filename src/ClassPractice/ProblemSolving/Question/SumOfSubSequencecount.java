package ClassPractice.ProblemSolving.Question;
/*
Given an array of positive integers arr[] and a value sum, determine if there is a subset of arr[] with sum equal to given sum.

Examples:

Input: arr[] = [3, 34, 4, 12, 5, 2], sum = 9
Output: 2
Explanation: Here there exists a subset with target sum = 9, 4+3+2 = 9,  4+5 = 9
Input: arr[] = [3, 34, 4, 12, 5, 2], sum = 30
Output: 0
Explanation: There is no subset with target sum 30.
Input: arr[] = [1, 2, 3], sum = 6
Output: 1
Explanation: The entire array can be taken as a subset, giving 1 + 2 + 3 = 6
 */
public class SumOfSubSequencecount {
    public static void main(String[] args) {
       int  arr[] = {3, 34, 4, 12, 5, 2};
        int sum = 9;
        System.out.println("count : "+subset(arr,sum,0));
    }
    static int subset(int arr[],int sum, int counter)
    {
        if(sum == 0)
        {
            return 1;
        }
        if(counter == arr.length || sum<0)
        {
            return 0;
        }
        return(subset(arr,sum-arr[counter],counter+1)+subset(arr,sum,counter+1));
    }
}
