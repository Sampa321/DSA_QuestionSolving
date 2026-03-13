package HomePractice.GeeksForGeeks.Array.Medium;

import java.util.Scanner;

/*
Given two integers a and b. Find the minimum value of a $ b where $ is any arithmetic operation like multiply( * ), Divide( / ), Addition( + ), Substraction( - ).
Note: Use Exception Handling in this problem.

Examples:

Input: a = 5, b = -5
Output: -25
Explanation: 5+(-5) = 0, 5-(-5) = 10, 5*(-5) = -25, 5/(-5) = -1
Minimum of all is 5*(-5) = -25.
Input: a = 5, b = 0
Output: 0
Explanation: 5+0 = 5, 5-0 = 5, 5*0 = 0, 5/0 = "Exception Handling"
Minimum of all is 5*0 = 0.
 */
public class JavaExceptionHandling {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a and b :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Minimum number : "+findMin(a,b));
    }
    public static int findMin(int a, int b) {
        // Your code here
        int min = Integer.MAX_VALUE;
        try{
            min = a+b;
            min = Math.min(min,a-b);
            min = Math.min(min,a*b);
            min = Math.min(min,a/b);
        }
        catch(Exception e)
        {

        }
        finally{
            return min;
        }
    }
}
