package ClassPractice.ProblemSolving.Geeksforgeeks.Stack.Medium.InfixToPostfix;

import java.util.ArrayList;
import java.util.Stack;

public class EfficientApproach {
    public static void main(String[] args) {
        String s = "a*(b+c)/d";
        System.out.println(infixToPostfix(s));
    }
    public static String infixToPostfix(String str){
        Stack<Character> st = new Stack<>();
        StringBuilder result = new StringBuilder();
        ArrayList<Character> arr = new ArrayList<>();
        arr.add('/');
        arr.add('*');
        arr.add('+');
        arr.add('-');
        for(int i = 0; i < str.length();i++)
        {
            char p = str.charAt(i);
            if(p == '(')
            {
                st.push(p);
            }
            else if (p == ')') {
                while(st.peek() != '(')
                {
                    result.append(st.peek());
                    st.pop();
                }
            } else if (p == '+' || p == '-' || p == '*' || p == '/') {
                if (st.isEmpty()) {
                    st.push(p);
                } else {
                    int idxOfStack = arr.indexOf(st.peek());
                    int idxOfP = arr.indexOf(p);
                    if (idxOfP < idxOfStack) {
                        st.push(p);
                    } else if (idxOfP > idxOfStack) {
                        while (idxOfP > idxOfP) {
                            result.append(st.peek());
                            st.pop();
                        }
                    } else {
                        result.append(st.peek());
                        result.append(p);
                    }
                }
            }
            else
            {
                result.append(p);
            }
        }
        while (!st.isEmpty())
        {
            result.append(st.peek());
            st.pop();
        }
        return result.toString();
    }
}
