package HomePractice.DailyPractice.Stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class HistogramMaxRectangleArea {
   public static void main(String[] args) {
        int []arr = {60, 20, 50, 40, 10, 50, 60};
//        int maxValue = 0;
//        for (int i = 0; i < arr.length; i++)
//        {
//            int c = 1;
//            for(int j = i+1; j < arr.length; j++)
//            {
//                if(arr[i] <= arr[j]){
//                    c++;
//                }
//                else {
//                    break;
//                }
//            }
//
//            for(int j = i-1; j >= 0; j--)
//            {
//                if(arr[i] <= arr[j]){
//                    c++;
//                }
//                else {
//                    break;
//                }
//            }
//            int maxArea = c*arr[i];
//            maxValue = Math.max(maxArea, maxValue);
//        }
//       System.out.println(maxValue);


       ArrayList<Integer> prevSmaller = new ArrayList<>();
       ArrayList<Integer> nextSmaller = new ArrayList<>();
       Stack<Integer> st = new Stack<>();
       for (int i = 0; i < arr.length; i++)
       {
           while (!st.isEmpty() && arr[st.peek()] >= arr[i])
           {
               st.pop();
           }
           int re = st.isEmpty()? -1 : st.peek();
           prevSmaller.add(re);
           st.push(i);
       }



       st.clear();
       for(int i = arr.length-1; i >= 0; i--)
       {
           while (!st.isEmpty() && arr[st.peek()] >= arr[i])
           {
               st.pop();
           }
           int re = st.isEmpty()? arr.length : st.peek();
           nextSmaller.add(re);
           st.push(i);
       }
       Collections.reverse(nextSmaller);


       int maxValue = 0;
       for(int i = 0; i < arr.length; i++)
       {
           maxValue = Math.max(maxValue, (nextSmaller.get(i) - prevSmaller.get(i) -1)*arr[i]);
       }
       System.out.println(maxValue);
    }
}
