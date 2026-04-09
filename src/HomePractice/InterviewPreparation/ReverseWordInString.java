package HomePractice.InterviewPreparation;

import java.util.Arrays;
import java.util.Stack;

public class ReverseWordInString {
   public static void main(String[] args) {
       String str = "I love Coding";
       String []word = str.trim().split(" ");
       Stack<String> st = new Stack<>();
       for(int i = 0; i< word.length; i++)
       {
           st.push(word[i]);

       }
       String result = "";
       while(!st.isEmpty())
       {
           result += st.pop();
           result += " ";
       }
       System.out.println(result.replaceAll("\\s+$",""));
    }
}
