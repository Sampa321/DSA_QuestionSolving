package HomePractice.DailyPractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicatesMaintainTheOrder {
   public static void main(String[] args) {
       int []arr = {5,23,5,90,50,6,7,8,2,6};
       //Naive Approach  : O(n^2), O(n)
//       ArrayList<Integer> list = new ArrayList<>();
//       for(int i = 0;i < arr.length; i++)
//       {
//           if(!list.contains(arr[i]))
//           {
//               list.add(arr[i]);
//           }
//       }
//       System.out.println(list);

       //Efficient Approach : O(n), O(n)
       HashSet<Integer> set = new LinkedHashSet<>();
       for (int j : arr) {
           set.add(j);
       }
       System.out.println(set);
   }
}
