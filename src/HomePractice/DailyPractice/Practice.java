package HomePractice.DailyPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class Practice {
   public static void main(String[] args) {
        int []nums = {7, 1, 7, 2, 2, 4};
        largestRectangleArea(nums);
    }
    public static void largestRectangleArea(int[] heights) {
        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> preSma = new ArrayList<>();
        ArrayList<Integer> nextSma = new ArrayList<>();
        for(int i = 0; i < heights.length; i++)
        {
            while(!st.isEmpty() && heights[st.peek()] >= heights[i])
            {
                st.pop();
            }
            int result = st.isEmpty() ? -1 : st.peek();
            preSma.add(result);
            st.push(i);
        }

        st.clear();
        for(int i = heights.length-1; i >= 0; i--)
        {
            while(!st.isEmpty() && heights[st.peek()] >= heights[i])
            {
                st.pop();
            }
            int result = st.isEmpty() ? heights.length : st.peek();
            nextSma.add(result);
            st.push(i);
        }
        Collections.reverse(nextSma);
        int maxArea = 0;
        for(int i = 0; i < heights.length; i++)
        {
            int currMax = (nextSma.get(i)-preSma.get(i)-1)*heights[i];
            maxArea = Math.max(currMax,maxArea);
        }
        System.out.println(maxArea);
    }
}
