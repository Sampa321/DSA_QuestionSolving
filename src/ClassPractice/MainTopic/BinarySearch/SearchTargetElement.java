package ClassPractice.MainTopic.BinarySearch;

public class SearchTargetElement {
    //Iterative Approach
   static int find(int []arr, int target)
    {
        int low = 0;
        int high = arr.length-1;
        while (low <= high)
        {
            int mid = (low + high)/2;
            if (arr[mid] == target)
            {
                return mid;
            }
            else if (arr[mid] > target)
            {
                high = mid-1;
            }
            else {
                low = mid + 1;
            }
        }
        return -1;
    }



    //Recursive Approach
//    static int re = -1;
//    static void find(int []a, int l, int h, int t)
//    {
//        if (l > h) return;
//        int m = (l+h)/2;
//        if(a[m] == t){
//            re = m;
//            return;
//        }
//        else if(a[m] > t)
//        {
//            find(a, l, m-1, t);
//        }
//        else {
//            find(a, m+1, h, t);
//        }
//    }
   public static void main(String[] args) {
        int []arr = {3,7,9,11,12,14};
        int t = 11;
       System.out.println(find(arr, t));

//       find(arr, 0, arr.length -1, t);
//       System.out.println(re);
    }
}
