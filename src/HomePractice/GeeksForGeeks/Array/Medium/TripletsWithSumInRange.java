package HomePractice.GeeksForGeeks.Array.Medium;

import java.util.Arrays;

/*
Given an array arr[]  and a range from l to r, the task is to count the number of triplets having a sum in the range [l, r].

Examples :

Input: arr = [8, 3, 5, 2], l = 7, r = 11
Output: 1
Explanation: There is only one triplet [2, 3, 5] having sum 10 in range [7, 11].
Input: arr = [5, 1, 4, 3, 2], l = 2, r = 7
Output: 2
Explanation: There are two triplets having sum in range, [1,4,2] and [1,3,2].
 */
public class TripletsWithSumInRange {
    public static void main(String[] args) {
        int []arr = {8,2,3,5};
        int l = 7;
        int r = 11;
        //System.out.println(countTriplets(arr, l, r));
        System.out.println(countTriplets(arr, l, r));
    }
//    public static int countTriplets(int[] arr, int l, int r) {
//        // code here
//        return tripletsSum(arr, l, r,0, 0, 0);
//    }
//    //Naive Approach
//    public static int tripletsSum(int []arr, int l, int r, int i, int c, int sum)
//    {
//        if(c == 3)
//        {
//            return (sum >= l && sum <= r) ? 1 : 0;
//        }
//        if(i == arr.length) return 0;
//        int notTake = tripletsSum(arr, l, r, i+1, c, sum);
//        int take = tripletsSum(arr, l, r, i+1, c+1, sum+arr[i]);
//        return notTake + take;
//    }


    // Efficient Approach
    public static int countTriplets(int[] arr, int l, int r) {

        Arrays.sort(arr);

        return countLessEqual(arr, r) - countLessEqual(arr, l - 1);
    }

    public static int countLessEqual(int[] arr, int target) {

        int count = 0;
        int n = arr.length;

        for (int i = 0; i < n - 2; i++) {

            int j = i + 1;
            int k = n - 1;

            while (j < k) {

                if (arr[i] + arr[j] + arr[k] <= target) {
                    count += k - j;
                    j++;
                } else {
                    k--;
                }
            }
        }
        return count;
    }
}
