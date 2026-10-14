package HomePractice.DailyPractice.Queue;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class MaxAndMinSubarray {

   public static void main(String[] args) {
        int []arr = {1,2,3,1,4,5,2,3,6};
        int k = 3;


       ArrayList<Integer> maxList = new ArrayList<>();
       ArrayList<Integer> minList = new ArrayList<>();
        // Naive Approach T.C = O(nK), S.c = 0(1)
//        for(int i = 0; i <= arr.length-k; i++)
//        {
//            int maximum = arr[i];
//            int minimum = arr[i];
//            for(int j = i+1; j < i+k; j++)
//            {
//                maximum = Math.max(arr[j], maximum);
//                minimum = Math.min(arr[j], minimum);
//            }
//            maxList.add(maximum);
//            minList.add(minimum);
//        }



       //Efficient Approach
       Deque<Integer> dq = new LinkedList<>();
       for(int i = 0; i < k; i++)
       {
           while (!dq.isEmpty() && arr[dq.peekLast()] < arr[i])
           {
               dq.removeLast();
           }
           dq.addLast(i);
       }
       maxList.add(arr[dq.peekFirst()]);
       for(int i = k ;i < arr.length; i++)
       {
           if(dq.peekFirst() <= (i-k)) dq.removeFirst();
           while (!dq.isEmpty() && arr[dq.peekLast()] < arr[i])
           {
               dq.removeLast();
           }
           dq.addLast(i);
           maxList.add(arr[dq.peekFirst()]);
       }
       System.out.println(maxList);
    }
}
