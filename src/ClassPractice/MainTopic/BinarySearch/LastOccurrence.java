//package ClassPractice.MainTopic.BinarySearch;
//
//public class LastOccurrence {
//    //Iterative Approach
//    public static int lastSearch(int[] arr, int k) {
//        // Code Here
//        int l = 0;
//        int h = arr.length-1;
//        while (l <= h)
//        {
//            int m = (l+h)/2;
//            if(arr[m] == k){
//                if(m == arr.length-1 || arr[m+1] != arr[m]) return m;
//                while(m <= arr.length-1 && arr[m] == k)
//                {
//                    m++;
//                }
//                return m;
//            }
//            else if(arr[m] > k) h = m-1;
//            else l = m+1;
//        }
//        return -1;
//    }
//
//    //OR,
////    public static int lastSearch(int[] arr, int k) {
////        // Code Here
////        int n=arr.length;
////        int l=0;
////        int h=n-1;
////        int idx=-1;
////        while(l<=h) {
////            int  mid=(l+h)/2;
////            if(arr[mid]>k) {
////                h=mid-1;
////            }
////            else if(arr[mid]<k) {
////                l=mid+1;
////
////            }
////            else {
////                idx=mid;
////                l=mid+1;
////            }
////        }
////        return idx;
////    }
//
//
//    //Recursive Approach
////    static int re = -1;
////    public static int lastSearch(int []a, int l, int h, int t){
////        if (l > h) return re;
////        int m = (l+h)/2;
////        if(a[m] == t){
////            re = m;
////            lastSearch(a, m+1, h, t);
////        }
////        else if(a[m] > t)
////        {
////            lastSearch(a, l, m-1, t);
////        }
////        else {
////            lastSearch(a, m+1, h, t);
////        }
////        return re;
////    }
//
////    public static int lastSearch(int []a, int l, int h, int t){
////        if (l > h) return -1;
////        int m = (l+h)/2;
////        if(a[m] == t){
////            if(m == a.length-1 || a[m] != a[m+1]) return m;
////            return lastSearch(a, m+1, h, t);
////        }
////        else if(a[m] > t)
////        {
////            return lastSearch(a, l, m-1, t);
////        }
////        else {
////            return lastSearch(a, m+1, h, t);
////        }
////    }
//
//
//    public static void main(String[] args) {
//        int []arr = {1, 1, 2, 2, 3, 4, 5};
//        int k = 1;
//        //lastSearch(arr, 0,arr.length-1, k);
//        System.out.println(lastSearch(arr, k));
//    }
//}
