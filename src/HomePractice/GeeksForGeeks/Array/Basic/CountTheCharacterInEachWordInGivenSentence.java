package HomePractice.GeeksForGeeks.Array.Basic;

import java.util.ArrayList;
import java.util.Scanner;

/*
Given a string containing multiple words, count the characters in each word and display them.

Example 1:

Input:
S = "the quick brown fox"
Output: 3 5 5 3
Explanation: "the" has 3 characters
"quick" has 5 characters
"brown" has 5 characters
"fox" has 3 characters
â€‹Example 2:

Input:
S = "geeks for geeks"
Output: 5 3 5
Explanation: "geeks" has 5 characters
"for" has 3 characters
"geeks" has 5 characters
 */
public class CountTheCharacterInEachWordInGivenSentence{
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = sc.nextLine();
        System.out.println("Count characters : "+countChars(str));
    }
   public static ArrayList<Integer> countChars(String s) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        int c=0;
        for(int i=0;i<s.length()-1;i++)
        {
            if(s.charAt(i)==' ')
            {
                list.add(c);
                c=0;
            }
            else
            {
                c+=1;
            }
        }
        list.add(c+1);
        return list;
    }
}
