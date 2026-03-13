package HomePractice.GeeksForGeeks.Array.Basic;

import java.util.Scanner;

/*
Given a positive integer n, find the nth Even Fibonacci number.

Example :

Input: n = 1
Output: 2
Explanation: 2 is the first even number in the fibonacci series.
Input: n = 2
Output: 8
Explanation: 8 is the second even number in the fibonacci series.
 */
public class NthEvenFibonacciNumber {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        System.out.println(n+" no of even fibonacci number : "+nthEvenFibonacci(n));
    }
    public static int nthEvenFibonacci(int n) {
        // code here
        int a= 0;
        int b = 1;
        int c = 1;
        int count = 0;
        while(count<n)
        {
            c= a+b;
            if(c%2==0)
            {
                count++;
            }
            a= b;
            b = c;
        }
        return c;
    }
}
