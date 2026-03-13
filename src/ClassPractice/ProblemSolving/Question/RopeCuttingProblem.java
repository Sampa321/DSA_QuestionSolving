package ClassPractice.ProblemSolving.Question;

import java.util.Scanner;

public class RopeCuttingProblem {
    public static int ropeCut(int rope,int a,int b,int c)
    {
        if(rope == 0)
        {
            return 0;
        }
        if(rope < -1)
        {
            return -1;
        }
        int ropeCutOfa = ropeCut(rope-a,a,b,c);
        int ropeCutOfb = ropeCut(rope-b,a,b,c);
        int ropeCutOfc = ropeCut(rope-c,a,b,c);
        int maxvalue = Math.max(ropeCutOfa,Math.max(ropeCutOfb,ropeCutOfc));
        if(maxvalue == -1)
        {
            return -1;
        }
        return maxvalue+1;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of rope: ");
        int rope = sc.nextInt();
        System.out.print("Enter the value of a:");
        int a = sc.nextInt();
        System.out.print("Enter the value of b:");
        int b = sc.nextInt();
        System.out.print("Enter the value of c:");
        int c = sc.nextInt();
        System.out.println("Maximum number of rope cutting is : "+ropeCut(rope,a,b,c));
    }
}
