package ClassPractice.MainTopic.Backtracking.Permutation.UniqueElement;

import java.util.ArrayList;

public class PermutationOfStringWithoutExtraString {
    static void main(String[] args) {
       String str = "ABC";
       String result = "";
       char []charStr = str.toCharArray();
        ArrayList<String> resultList = new ArrayList<>();
        System.out.print("Permutation of unique element  is : ");
       printString(resultList, charStr,result,0);
        System.out.println(resultList);
    }
    public static void printString(ArrayList<String> resultList, char []charArray, String result,int p)
    {
        if(p == charArray.length)
        {
            resultList.add(result);
            return;
        }
        for(int i = p;i<charArray.length;i++)
        {
            result += charArray[i];
            swap(charArray,i,p);
            printString(resultList, charArray,result,p+1);
            result = result.substring(0,result.length()-1);
            swap(charArray,i,p);
        }
    }
    public static void swap(char []charArray,int i,int j){
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
    }
}
