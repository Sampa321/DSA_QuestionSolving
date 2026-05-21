package HomePractice.GeeksForGeeks.Array.Basic;

import java.util.Scanner;

/*
Given a number n, check whether every bit in the binary representation of the given number is set or not.

Return true if yes, otherwise false.

Examples :

Input: n = 7
Output: true
Explanation: Binary for 7 is 111 all the bits are set so the output is true.
Input: n = 8
Output: false
Explanation: Binary for 8 is 1000 all the bits are not set so the output is false.
Input: n = 0
Output: false
Explanation: All the bits are 0 so the output is false.
 */
public class CheckIfAllBitsSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value : ");
        int n = sc.nextInt();
        System.out.println(isBitSet(n));
    }
    public static boolean isBitSet(int n) {
        // code here
        if(n == 0) return false;
        while(n != 0)
        {
            if(n % 2 == 0)
            {
                return false;
            }
            n /= 2;
        }
        return true;
    }
}
