package HomePractice.Leetcode.Math.Easy;
/*
You are given an integer n. Your task is to compute the GCD (greatest common divisor) of two values:

sumOdd: the sum of the smallest n positive odd numbers.

sumEven: the sum of the smallest n positive even numbers.

Return the GCD of sumOdd and sumEven.



Example 1:

Input: n = 4

Output: 4

Explanation:

Sum of the first 4 odd numbers sumOdd = 1 + 3 + 5 + 7 = 16
Sum of the first 4 even numbers sumEven = 2 + 4 + 6 + 8 = 20
Hence, GCD(sumOdd, sumEven) = GCD(16, 20) = 4.

Example 2:

Input: n = 5

Output: 5

Explanation:

Sum of the first 5 odd numbers sumOdd = 1 + 3 + 5 + 7 + 9 = 25
Sum of the first 5 even numbers sumEven = 2 + 4 + 6 + 8 + 10 = 30
Hence, GCD(sumOdd, sumEven) = GCD(25, 30) = 5.
 */
public class GCD_OfOddAndEvenSums {
   public static void main(String[] args) {
        int n = 5;
       System.out.println(gcdOfOddEvenSums(n));
    }
    public static int gcdOfOddEvenSums(int n) {
        int evenSum = 0;
        int oddSum = 0;
        int c1 = 0;
        int c2 = 0;
        int num = 2;
        while(c1 != n)
        {
            evenSum = evenSum + num;
            c1++;
            num += 2;
        }
        num = 1;
        while(c2 != n)
        {
            oddSum = oddSum + num;
            c2++;
            num += 2;
        }

        int range = Math.min(oddSum, evenSum);
        for(int i = range ; i >= 1; i--)
        {
            if(evenSum % i == 0 && oddSum % i == 0) return i;
        }
        return 0;
    }
}
