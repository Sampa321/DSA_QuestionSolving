package HomePractice.DailyPractice.Practice;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class MaximumSubarraySum {
    public static void main(String[] args)
    {
        int []arr = {1, 5, 7, 6, 2, 8, 5};
        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> preSmall = new ArrayList<>();
        ArrayList<Integer> nextSmall = new ArrayList<>();

        for(int i = 0; i < arr.length; i++)
        {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) st.pop();
            int store = st.isEmpty() ? -1 : st.peek();
            preSmall.add(store);
            st.push(i);
        }


        st.clear();
        for(int i = arr.length-1 ; i >= 0 ; i--)
        {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) st.pop();
            int store = st.isEmpty() ? arr.length : st.peek();
            nextSmall.add(store);
            st.push(i);
        }
        Collections.reverse(nextSmall);
        System.out.println(nextSmall);

        int sum = 0;
        for(int i = 0; i < arr.length; i++)
        {
            int diff = (i-preSmall.get(i))*(nextSmall.get(i)-i);
            sum += diff*arr[i];
        }
        System.out.println(sum);
    }

}
