package ClassPractice.ProblemSolving.Question;

import java.util.Scanner;

public class SubsequenceOfString {
    public static void subset(String str,String r,int c)
    {
        if(str.length() == c)
        {
            System.out.print(r+" ");
            return;
        }
        subset(str,r,c+1);
        subset(str,r+ str.charAt(c),c+1);
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = sc.next();
        System.out.print("Subset is :");
        subset(str," ",0);
    }
}
