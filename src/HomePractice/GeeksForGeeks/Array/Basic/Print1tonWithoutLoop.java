package HomePractice.GeeksForGeeks.Array.Basic;

import java.util.Scanner;

/*
You are given an integer n. You have  to print all numbers from 1 to n.
Note: You must use recursion only, and print all numbers from 1 to n in a single line, separated by spaces.
Examples:
Input: n = 10
Output: 1 2 3 4 5 6 7 8 9 10
Input: n = 5
Output: 1 2 3 4 5
Input: n = 1
Output: 1

 */
public class Print1tonWithoutLoop {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        System.out.print("Print 1 to n : ");
        printNos(n);
    }
    public static void printNos(int n) {
        // Code here
        if(n==0){
            return ;
        }
        printNos(n-1);
        System.out.print(n+" ");
    }
}
