package HomePractice.DailyPractice.Practice;

import java.util.Deque;
import java.util.LinkedList;

public class BST {
   public static void main(String []args) {
         int []gas = {4,5,7,4};
         int []cost = {6,6,3,5};
         int i = 0;
         int curr_petrol = 0;
         int c = 0;
       Deque<Integer> dq = new LinkedList<>();
       while ( i < gas.length)
       {
           curr_petrol += (gas[i]-cost[i]);
           if(curr_petrol < 0) c++;
           if(c == gas.length)
           {
               System.out.println(-1);
               return;
           }
           while (curr_petrol < 0 && !dq.isEmpty())
           {
               int j = dq.removeFirst();
               curr_petrol -= (gas[j]-cost[j]);
           }
           i = (i+1);
           if (!dq.isEmpty() && dq.peekFirst() == i)
           {
               System.out.println(i);
           }
       }
    }
}
