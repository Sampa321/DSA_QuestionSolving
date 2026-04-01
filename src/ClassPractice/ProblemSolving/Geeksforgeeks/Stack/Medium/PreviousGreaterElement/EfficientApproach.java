package ClassPractice.ProblemSolving.Geeksforgeeks.Stack.Medium.PreviousGreaterElement;

import java.util.ArrayList;
import java.util.Stack;

public class EfficientApproach {
    public static ArrayList<Integer> previousGreaterEle(int []arr){
        ArrayList<Integer> result = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < arr.length; i++) {
            while (!st.empty() && arr[i] >= st.peek()) {
                st.pop();
            }
            int store = st.empty() ? -1 :  st.peek();
            result.add(store);
            st.push(arr[i]);
        }
        return result;
    }
    public static void main(String[] args) {
        int []arr = {10, 4, 2, 20, 40, 12, 30};
        System.out.println(previousGreaterEle(arr));
    }
}
