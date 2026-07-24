package HomePractice.DailyPractice.Practice;

import java.util.ArrayList;

public class Recursion {
     public static boolean subset(int []arr, int sum, int c, ArrayList<Integer> list)
     {
         if (sum == 0){
             System.out.println(list);
             return true;
         }
         if (c == arr.length || sum < 0) return false;
         list.add(arr[c]);
         boolean include = subset(arr, sum-arr[c], c+1, list);
         list.removeLast();
         boolean exclude = subset(arr, sum, c+1, list);
         return include || exclude;
     }

   public static void main(String[] args) {
         int []arr = {3, 34, 4, 12, 5, 2};
        if (!subset(arr, 9, 0, new ArrayList<>()))
        {
            System.out.println("Not exists!!");
        }
    }
}
