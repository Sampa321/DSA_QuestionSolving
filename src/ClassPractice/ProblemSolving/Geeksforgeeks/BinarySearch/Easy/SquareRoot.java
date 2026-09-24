//package ClassPractice.ProblemSolving.Geeksforgeeks.BinarySearch.Easy;
///*
//Given a positive integer n, find the square root of n. If n is not a perfect square, then return the floor value.
//
//Floor value of any number is the greatest Integer which is less than or equal to that number.
//
//Examples:
//
//Input: n = 4
//Output: 2
//Explanation: Since, 4 is a perfect square, so its square root is 2.
//Input: n = 11
//Output: 3
//Explanation: Since, 11 is not a perfect square, floor of square root of 11 is 3.
//Input: n = 1
//Output: 1
//Explanation: 1 is a perfect square, so its square root is 1.
// */
//public class SquareRoot {
//    // Iterative Approach
//    public static int floorSqrt(int n)
//    {
//        if(n == 1) return 1;
//        int low = 1;
//        int high = n/2;
//        int re = 0;
//        int diff = Integer.MAX_VALUE;
//        while (low <= high)
//        {
//            int mid = (low + high) /2;
//            int product = mid*mid;
//            if(product == n) return mid;
//            else if(product > n)
//            {
//                high = mid-1;
//            }
//            else {
//                low = mid+1;
//                int actualDiff = Math.abs(product-n);
//                if (actualDiff < diff)
//                {
//                    re = mid;
//                    diff = actualDiff;
//                }
//            }
//        }
//        return re;
//    }
//
//
//
//    // Recursive Approach
////   public static int floorSqrt(int n) {
////        // code here
////       if(n == 1) return 1;
////       value(1, n/2, n);
////       return re;
////    }
////
////   static int re = 0;
////   static int diff = Integer.MAX_VALUE;
////   public static int value(int low, int high, int n)
////    {
////        if(low > high) return re;
////        int mid = (low + high)/2;
////        int product = mid*mid;
////        if(product == n)
////        {
////            re = mid;
////            return re;
////        }
////        else if(product < n)
////        {
////            int actDiff =  Math.abs(product-n);
////            if(actDiff < diff){
////                re = mid;
////                diff = Math.abs(product-n);
////            }
////            low = mid+1;
////            return value(low, high, n);
////        }
////        else
////        {
////            high = mid-1;
////            return value(low, high, n);
////        }
////    }
//
//   public static void main(String[] args) {
//        int n = 74;
//       System.out.println(floorSqrt(n));
//    }
//}
