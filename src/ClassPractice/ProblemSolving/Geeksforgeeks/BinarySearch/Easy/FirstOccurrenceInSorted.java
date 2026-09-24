package ClassPractice.ProblemSolving.Geeksforgeeks.BinarySearch.Easy;
/*
Given a sorted array arr[] and an integer k, find the position(0-based indexing) at which k is present in the array using binary search. If k doesn't exist in arr[] return -1.

Note: If multiple occurrences are there, please return the smallest index.

Examples:

Input: arr[] = [1, 2, 3, 4, 5], k = 4
Output: 3
Explanation: 4 appears at index 3.
Input: arr[] = [11, 22, 33, 44, 55], k = 445
Output: -1
Explanation: 445 is not present.
Input: arr[] = [1, 1, 1, 1, 2], k = 1
Output: 0
Explanation: 1 appears at index 0.
 */
public class FirstOccurrenceInSorted {
    //Iterative Approach
//    public int firstSearch(int[] arr, int k) {
//        // Code Here
//        int l = 0;
//        int h = arr.length-1;
//        while (l <= h)
//        {
//            int m = (l+h)/2;
//            if(arr[m] == k){
//                if(m == 0 || arr[m-1] != arr[m]) return m;
//                while(m >= 0 && arr[m] == k)
//                {
//                    m--;
//                }
//                return m+1;
//            }
//            else if(arr[m] > k) h = m-1;
//            else l = m+1;
//        }
//        return -1;
//    }

    //OR,
//    public int firstSearch(int[] arr, int k) {
//        // Code Here
//        int n=arr.length;
//        int l=0;
//        int h=n-1;
//        int idx=-1;
//        while(l<=h) {
//            int  mid=(l+h)/2;
//            if(arr[mid]>k) {
//                h=mid-1;
//            }
//            else if(arr[mid]<k) {
//                l=mid+1;
//
//            }
//            else {
//                idx=mid;
//                h=mid-1;
//            }
//        }
//        return idx;
//    }


    //Recursive Approach
//    static int re = -1;
//    public static int firstSearch(int []a, int l, int h, int t){
//        if (l > h) return re;
//        int m = (l+h)/2;
//        if(a[m] == t){
//            re = m;
//            firstSearch(a, l, m-1, t);
//        }
//        else if(a[m] > t)
//        {
//            firstSearch(a, l, m-1, t);
//        }
//        else {
//            firstSearch(a, m+1, h, t);
//        }
//        return re;
//    }

    public static int firstSearch(int []a, int l, int h, int t){
        if (l > h) return -1;
        int m = (l+h)/2;
        if(a[m] == t){
            if(m == 0 || a[m] != a[m-1]) return m;
            return firstSearch(a, l, m-1, t);
        }
        else if(a[m] > t)
        {
          return firstSearch(a, l, m-1, t);
        }
        else {
         return firstSearch(a, m+1, h, t);
        }
    }


    public static void main(String[] args) {
        int []arr = {1, 1, 2, 2, 3, 4, 5};
        int k = 7;
        firstSearch(arr, 0,arr.length-1, k);
        System.out.println(firstSearch(arr, 0, arr.length-1, k));
    }
}
