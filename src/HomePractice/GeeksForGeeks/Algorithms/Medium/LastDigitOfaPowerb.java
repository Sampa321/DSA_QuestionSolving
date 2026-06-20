package HomePractice.GeeksForGeeks.Algorithms.Medium;

import java.math.BigInteger;

/*
Given two integers a and b in the form of strings. Return the last digit of ab.

Examples:

Input: a = "3", b = "10"
Output: 9
Explanation: 310 = 59049. Last digit is 9.
Input: a = "6", b = "2"
Output: 6
Explanation: 62 = 36. Last digit is 6.

 */
public class LastDigitOfaPowerb {
    public static void main(String[] args) {
        String a = "3", b = "10";
        System.out.println(getLastDigit(a,b));
    }
    public static int getLastDigit(String a, String b) {
        BigInteger base = new BigInteger(a);
        BigInteger exponent = new BigInteger(b);

        BigInteger p = base.modPow(exponent, BigInteger.TEN);

        return p.intValue();
    }
}
