package ClassPractice.ProblemSolving.LeetCode.Stack.Easy;
public class ValidParentheses {
    public static boolean checkValidParentheses(String input){
        Stack3  stack = new Stack3();
        for (int i = 0;i<input.length();i++)
        {
            char bracket = input.charAt(i);
            if(bracket == '(' || bracket=='{' || bracket == '[')
            {
                stack.push(bracket);
            }else {
                if(stack.isEmpty())
                {
                    return false;
                }
                else {
                    char top = stack.pop();
                    if(bracket == ']' && top !='[' ||
                            bracket == '}' && top != '{' ||
                            bracket == ')' && top != '('
                    ){
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }
    static void main(String[] args) {
        String input = "[]{]";
        System.out.println(checkValidParentheses(input) ? input+" is Valid Parentheses" : input+ " is not Valid Parentheses");
    }
}
