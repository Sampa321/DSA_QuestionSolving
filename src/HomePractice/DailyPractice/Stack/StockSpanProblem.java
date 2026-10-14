package HomePractice.DailyPractice.Stack;

import java.util.Arrays;
import java.util.Stack;

public class StockSpanProblem {
   public static void main(String[] args) {
        int []arr = {10, 4, 5, 90, 120, 80};
        int []result = new int[arr.length];

        // Naive Approach
//        for(int i = 0; i < arr.length; i++)
//        {
//            int c = 1;
//            for(int j = i-1; j >= 0; j--)
//            {
//                if(arr[i] < arr[j]) break;
//                c++;
//            }
//            result[i] = c;
//        }
//       System.out.println(Arrays.toString(result));

       Stack<Integer> st = new Stack<>();
       for (int i = 0;i < arr.length; i++)
       {
           while (!st.isEmpty() && arr[i] >= arr[st.peek()])
           {
               st.pop();
           }
           int re = st.isEmpty()? i+1 : i-st.peek();
           st.push(i);
           result[i] = re;
       }
       System.out.println(Arrays.toString(result));
    }
}
