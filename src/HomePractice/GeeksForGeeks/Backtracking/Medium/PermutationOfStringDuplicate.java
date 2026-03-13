package HomePractice.GeeksForGeeks.Backtracking.Medium;
/*
Given a string s, which may contain duplicate characters, your task is to generate and return an array of all unique permutations of the string. You can return your answer in any order.

Examples:
Input: s = "ABC"
Output: ["ABC", "ACB", "BAC", "BCA", "CAB", "CBA"]
Explanation: Given string ABC has 6 unique permutations.
Input: s = "ABSG"
Output: ["ABGS", "ABSG", "AGBS", "AGSB", "ASBG", "ASGB", "BAGS", "BASG", "BGAS", "BGSA", "BSAG", "BSGA", "GABS", "GASB", "GBAS", "GBSA", "GSAB", "GSBA", "SABG", "SAGB", "SBAG", "SBGA", "SGAB", "SGBA"]
Explanation: Given string ABSG has 24 unique permutations.
Input: s = "AAA"
Output: ["AAA"]
Explanation: No other unique permutations can be formed as all the characters are same.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PermutationOfStringDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String  str = sc.nextLine();
        System.out.println("Permutation of string is :"+findPermutation(str));
        System.out.println();
    }
    public static ArrayList<String> findPermutation(String s) {
        // Code here
        ArrayList<String> original = new ArrayList<>();
        String result = "";
        ArrayList<Character> dubba = new ArrayList<>();
        char []charString = s.toCharArray();
        Arrays.sort(charString);
        boolean []track = new boolean[charString.length];
        return printString(result,original,dubba,charString,track);
    }
    public static ArrayList<String> printString(String result,ArrayList<String> original ,ArrayList<Character> dubba ,char []charString, boolean []track)
    {
        if(dubba.size() == charString.length)
        {
            original.add(result);

        }
        for(int i=0;i<charString.length;i++)
        {
            if(i>0 && charString[i] == charString[i-1] && !track[i-1])
            {
                continue;
            }
            if(!track[i])
            {
                result+=charString[i];
                track[i] = true;
                dubba.add(charString[i]);
                printString(result,original,dubba,charString,track);
                dubba.remove(dubba.size()-1);
                result = result.substring(0,result.length()-1);
                track[i] = false;
            }
        }
        return original;
    }
}
