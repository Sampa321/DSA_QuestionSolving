package ClassPractice.MainTopic.Backtracking.Permutation.DuplicateElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PermutationOfStringDuplicateElementUsingExtraSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = sc.next();
        char  []strArray = str.toCharArray();
        boolean []track = new boolean[strArray.length];
        String result = "";
        ArrayList<Character> dubba = new ArrayList<>();
        Arrays.sort(strArray);
        ArrayList<String> resultList = new ArrayList<>();
        System.out.println("Permutation of string is  :");
        permutationOfString(resultList,strArray,track,dubba,result);
        System.out.println(resultList);
    }
    public static void permutationOfString(ArrayList<String> resultList,char []strArray,boolean []track,ArrayList<Character> dubba,String result)
    {
        if(dubba.size() == strArray.length)
        {
            resultList.add(result);
            return;
        }
        for(int i = 0;i<strArray.length;i++)
        {
            if(i>0 && strArray[i] == strArray[i-1] && !track[i-1])
            {
                continue;
            }

            if(!track[i])
            {
                dubba.add(strArray[i]);
                result += strArray[i];
                track[i] = true;
                permutationOfString(resultList,strArray,track,dubba,result);
                dubba.remove(dubba.size()-1);
                result = result.substring(0,result.length() -1);
                track[i] = false;
            }
        }
    }
}
