package HomePractice.GeeksForGeeks.Array.Basic;

import java.util.Arrays;
import java.util.Scanner;

/*
Given a number n, return an array containing the first n Fibonacci numbers.
Note: The first two numbers of the series are 0 and 1.
Examples:
Input: n = 5
Output: [0, 1, 1, 2, 3]
Input: n = 7
Output: [0, 1, 1, 2, 3, 5, 8]
Input: n = 2
Output: [0, 1]
 */
public class FirstNfibonacci {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        System.out.print("Fibonacci numbers is :"+ Arrays.toString(fibonacciNumbers(n)));
    }
    public static int[] fibonacciNumbers(int n) {
        // Your code here
        int []re = new int[n];
        int fst=0;
        int se =1;
        int idx=0;
        re[idx++]=fst;
        if(n>=2){
            re[idx++]=se;
        }
        for(int i=3;i<=n;i++){
            int third =fst+se;
            fst=se;
            se =third;
            re[idx++]=third;
        }
        return re;
    }
}
