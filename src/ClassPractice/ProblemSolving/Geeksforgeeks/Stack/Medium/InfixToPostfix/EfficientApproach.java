package ClassPractice.ProblemSolving.Geeksforgeeks.Stack.Medium.InfixToPostfix;

import java.util.Stack;

public class EfficientApproach {
    public static int precedence(char op){
        if(op == '^') return 3;
        if(op == '*' || op == '/') return 2;
        if(op == '+' || op == '-') return 1;
        return -1;
    }
    public static void main(String[] args) {
        String ex = "h^m^q^(7-4)";
        //hmq74-^^^
        StringBuilder result = new StringBuilder();
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < ex.length(); i++)
        {
            char ch = ex.charAt(i);
            //operand
            if(Character.isLetterOrDigit(ch)) result.append(ch);
                // if '('
            else if(ch == '(') st.push(ch);
                //if ')'
            else if(ch == ')')
            {
                while (!st.isEmpty() &&  st.peek() != '(') {
                    result.append(st.pop());
                }
                if(!st.isEmpty()) st.pop();
            }
            else {
                while (!st.isEmpty() && (precedence(ch) < precedence(st.peek()) ||(precedence(st.peek()) == precedence(ch) && ch != '^')))
                {
                    result.append(st.pop());
                }
                st.push(ch);
            } //else end
        } //for loop end
        while (!st.isEmpty())
        {
            result.append(st.pop());
        }
        System.out.println(result);
    }
}
