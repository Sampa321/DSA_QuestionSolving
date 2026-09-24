//package ClassPractice.ProblemSolving.Geeksforgeeks.BinarySearch.Easy;
///*
//Given a sorted array arr[] and a number target, find the number of occurrences of target in given array.
//
//Examples:
//
//Input: arr[] = [1, 1, 2, 2, 2, 2, 3], target = 2
//Output: 4
//Explanation: target = 2 occurs 4 times in the given array so the output is 4.
//Input: arr[] = [1, 1, 2, 2, 2, 2, 3], target = 4
//Output: 0
//Explanation: target = 4 is not present in the given array so the output is 0.
//Input: arr[] = [8, 9, 10, 12, 12, 12], target = 12
//Output: 3
//Explanation: target = 12 occurs 3 times in the given array so the output is 3.
// */
//public class NumberOfOccurrence {
//
//    //Iterative Approach
////   public static int countFreq(int[] arr, int target) {
////        // code here
////        int re1 = firstOcc(arr, target);
////        int re2 = lastOcc(arr, target);
////        if(re1 == -1 && re2 == -1) return 0;
////        return re2-re1+1;
////    }
////
////  public static int firstOcc(int []arr, int target)
////    {
////        int low = 0;
////        int high = arr.length-1;
////        int re = -1;
////        while(low <= high)
////        {
////            int mid = (low+high)/2;
////            if(arr[mid] == target)
////            {
////                re = mid;
////                high = mid - 1;
////            }
////            else if(arr[mid] > target)
////            {
////                high = mid - 1;
////            }
////            else
////            {
////                low = mid + 1;
////            }
////        }
////        return re;
////    }
////
////  public static int lastOcc(int []arr, int target)
////    {
////        int low = 0;
////        int high = arr.length-1;
////        int re = -1;
////        while(low <= high)
////        {
////            int mid = (low+high)/2;
////            if(arr[mid] == target)
////            {
////                re = mid;
////                low = mid + 1;
////            }
////            else if(arr[mid] > target)
////            {
////                high = mid - 1;
////            }
////            else
////            {
////                low = mid + 1;
////            }
////        }
////        return re;
////    }
//
//
//
//
//    // Recursive Approach
//   public static int countFreq(int[] arr, int target) {
//        // code here
//        int l1 = 0;
//        int h1 = arr.length-1;
//        int re1 = firstOcc(arr, target, l1, h1);
//       int l2 = 0;
//       int h2 = arr.length-1;
//        int re2 = lastOcc(arr, target, l2, h2);
//       System.out.println(re1);
//       System.out.println(re2);
//        if(re1 == -1 && re2 == -1) return 0;
//        return re2-re1+1;
//
//    }
//
//
//   static int first = -1;
//   public static int firstOcc(int []arr, int target, int low, int high)
//    {
//        if(low > high) return first;
//        int mid = (low+high)/2;
//        if(arr[mid] == target)
//        {
//            first = mid;
//            return firstOcc(arr, target, low, mid-1);
//        }
//        else if(arr[mid] > target)
//        {
//            high = mid - 1;
//            return firstOcc(arr, target, low, high);
//        }
//        else
//        {
//            low = mid + 1;
//            return firstOcc(arr, target, low, high);
//        }
//    }
//
//
//
//   static int last = -1;
//   public static int lastOcc(int []arr, int target, int low, int high)
//    {
//
//        if(low > high) return last;
//        int mid = (low+high)/2;
//        if(arr[mid] == target)
//        {
//            last = mid;
//            return lastOcc(arr, target, mid+1, high);
//        }
//        else if(arr[mid] > target)
//        {
//            high = mid - 1;
//            return lastOcc(arr, target, low, high);
//        }
//        else
//        {
//            low = mid + 1;
//            return lastOcc(arr, target, low, high);
//        }
//    }
//
//
//
//
//   public static void main(String[] args) {
//       int []arr = {8, 9, 10, 12, 12, 12};
//       int target = 12;
//       System.out.println(countFreq(arr, target));
//    }
//}
