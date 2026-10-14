package HomePractice.DailyPractice.Stack;

import java.util.Arrays;
import java.util.Stack;

public class PreviousGreaterElement {
   public static void main(String[] args) {
        int []arr = {10, 4, 2, 20, 40, 12, 30};
        int []result = new int[arr.length];
//        for(int i = 0; i < arr.length; i++)
//        {
//            int re = -1;
//            for (int j = i-1; j >= 0; j--)
//            {
//                if(arr[i] < arr[j])
//                {
//                    re = arr[j];
//                    break;
//                }
//            }
//            result[i] = re;
//        }


       Stack<Integer> st = new Stack<>();
       for(int i = 0; i < arr.length; i++)
       {
           while (!st.isEmpty() && st.peek() <= arr[i])
           {
               st.pop();
           }
           int re =  st.isEmpty()? -1 : st.peek();
           st.add(arr[i]);
           result[i] = re;
       }
       System.out.println(Arrays.toString(result));
    }
}
