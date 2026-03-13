package HomePractice.GeeksForGeeks.Array.Basic;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/*
Given two integers a and b, You have to compute their LCM and GCD and return an array containing their LCM and GCD.

Examples:
Input: a = 5 , b = 10
Output: [10, 5]
Explanation: LCM of 5 and 10 is 10, while their GCD is 5.
Input: a = 14 , b = 8
Output: [56, 2]
Explanation: LCM of 14 and 8 is 56, while their GCD is 2.
Input: a = 1 , b = 1
Output: [1, 1]
Explanation: LCM of 1 and 1 is 1, while their GCD is 1.
 */
public class LcmAndGcd {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a : ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b : ");
        int b = sc.nextInt();
        System.out.printf("Lcm and gcd is : "+ Arrays.toString(lcmAndGcd(a,b)));
    }
    public static int[] lcmAndGcd(int a, int b) {
        // code her
        int []re = new int[2];
        int n=(a<=b?a:b);
        int lcm =1;
        int gcd = 1;
        for(int i=n;i>=1;i--){
            if(a%i== 0 && b%i==0){
                lcm*=i;
                gcd*=i;
                a/=i;
                b/=i;
            }
        }
        lcm*=a*b;
        re[0]=lcm;
        re[1]=gcd;
        return re;
    }
}
