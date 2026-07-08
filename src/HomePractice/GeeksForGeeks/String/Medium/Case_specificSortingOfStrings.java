package HomePractice.GeeksForGeeks.String.Medium;

import java.util.ArrayList;
import java.util.Collections;

/*
Given a string s consisting of only uppercase and lowercase characters. The task is to sort uppercase and lowercase letters separately such that if the ith place in the original string had an Uppercase character then it should not have a lowercase character after being sorted and vice versa.

Examples :

Input: s = "GEekS"
Output: EGekS
Explanation: Sorted form of given string with the same case of character will result in output as EGekS.
Input: s = "XWMSPQ"
Output: MPQSWX
Explanation: Since all characters are of the same case We can simply perform a sorting operation on the entire string.
 */
public class Case_specificSortingOfStrings {
   public static void main(String[] args) {
        String str = "GEekS";
       System.out.println(caseSort(str));
    }
    public static String caseSort(String s) {
        // code here
        ArrayList<Character> uc = new ArrayList<>();
        ArrayList<Character> lc = new ArrayList<>();
        char []arr = s.toCharArray();
        for(int i = 0; i < arr.length; i++)
        {
            char ch = s.charAt(i);
            if(Character.isUpperCase(ch))
            {
                uc.add(ch);
            }
            else
            {
                lc.add(ch);
            }
        }
        Collections.sort(uc);
        Collections.sort(lc);
        StringBuilder result = new StringBuilder();
        int i = 0;
        int j = 0;
        for (char ch : s.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                result.append(uc.get(i++));
            } else {
                result.append(lc.get(j++));
            }
        }
        return result.toString();
    }
}
