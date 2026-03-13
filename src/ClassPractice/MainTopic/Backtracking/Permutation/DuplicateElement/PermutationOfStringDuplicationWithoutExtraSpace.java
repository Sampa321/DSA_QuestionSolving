package ClassPractice.MainTopic.Backtracking.Permutation.DuplicateElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PermutationOfStringDuplicationWithoutExtraSpace {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = sc.next();
        char  []strArray = str.toCharArray();
        Arrays.sort(strArray);
        String result = "";
        ArrayList<String> resultList = new ArrayList<>();
        System.out.print("Permutation of string is : ");
        printStringDuplicate(resultList,strArray,result,0);
        System.out.println(resultList);

    }
    public  static void printStringDuplicate(ArrayList<String> resultList,  char []strArray, String result,int p)
    {
        if(p == strArray.length)
        {
            resultList.add(result);
            return;
        }
        for(int i = p;i< strArray.length;i++)
        {
            if(i>p && strArray[i] == strArray[i-1])
            {
                continue;
            }
            result += strArray[i];
            swap(strArray,i,p);
            printStringDuplicate(resultList,strArray,result,p+1);
            result = result.substring(0,result.length()-1);
            swap(strArray,i,p);
        }

    }
    public static void swap(char []arr, int i,int j)
    {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
