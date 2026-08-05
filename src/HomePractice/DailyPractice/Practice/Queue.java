package HomePractice.DailyPractice.Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class Queue {
     public static void main(String []args)
     {
         int []heights = {4,2,0,3,2,4,3,4};
         ArrayList<Integer> ns = new ArrayList<>();
         ArrayList<Integer> ps = new ArrayList<>();
         Stack<Integer> st = new Stack<>();
         for(int i = heights.length-1; i >= 0; i--)
         {
             while(!st.isEmpty() && heights[st.peek()] >= heights[i])
             {
                 st.pop();
             }
             int re = st.isEmpty()? heights.length : st.peek();
             ns.add(re);
             st.add(i);
         }
         Collections.reverse(ns);
         System.out.println(ns);
         st.clear();
         for(int i = 0; i < heights.length; i++)
         {
             while (!st.isEmpty() && heights[st.peek()] >= heights[i]) st.pop();
             int re = st.isEmpty()? -1 : st.peek();
             ps.add(re);
             st.add(i);
         }
         System.out.println(ps);

         int maximum = Integer.MIN_VALUE;
         for(int i = 0; i < heights.length; i++)
         {
             int curr = (ns.get(i)-ps.get(i)-1)*heights[i];
             maximum = Math.max(maximum, curr);
         }
         System.out.println(maximum);
     }
}
