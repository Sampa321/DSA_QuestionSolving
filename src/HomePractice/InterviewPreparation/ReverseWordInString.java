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
       StringBuilder result = new StringBuilder();
       while(!st.isEmpty())
       {
           result.append(st.pop()).append(" ");
       }
       System.out.println(result.toString().trim());



       /* Without extra space

        String str = "I love Coding";
        String[] words = str.trim().split(" ");
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }
        */
    }
}
