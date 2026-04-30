package HomePractice.GeeksForGeeks.Stack.Medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class Find123Pattern {
    public static void main(String []args) {
        int []arr = {18,17,10,11};
        System.out.println(has132Pattern(arr));
    }
    public static boolean has132Pattern(int[] arr) {
        // code here
        ArrayList<Integer> prevSmall = new ArrayList<>();
        ArrayList<Integer> nextSmall = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        //for prev small
        for(int i = 0; i < arr.length; i++)
        {
            while(!st.isEmpty() && st.peek() >= arr[i])
            {
                st.pop();
            }
            if(st.isEmpty())
            {
                prevSmall.add(-1);
            }
            else
            {
                prevSmall.add(st.peek());
            }
            st.push(arr[i]);
        }
        System.out.println(prevSmall);
        st.clear();
        //next Smaller
        for(int i = arr.length-1; i >= 0; i--)
        {
            while(!st.isEmpty() && st.peek() >= arr[i])
            {
                st.pop();
            }
            if(st.isEmpty())
            {
                nextSmall.add(-1);
            }
            else
            {
                nextSmall.add(st.peek());
            }
            st.push(arr[i]);
        }
        Collections.reverse(nextSmall);
        System.out.println(nextSmall);
        for(int i = 0; i < arr.length; i++)
        {
            if(prevSmall.get(i) != -1 && nextSmall.get(i) !=  -1 && prevSmall.get(i) < nextSmall.get(i))
            {
                return true;
            }
        }
        return false;
    }
}
