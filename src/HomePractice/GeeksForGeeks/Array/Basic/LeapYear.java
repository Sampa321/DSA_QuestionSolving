package HomePractice.GeeksForGeeks.Array.Basic;

import java.util.Scanner;

/*
You are given an Integer n. Return true if It is a Leap Year otherwise return false.
Examples:
Input: n = 4
Output: true
Explanation: 4 is not divisible by 100 and is divisible by 4 so its a leap year
Input: n = 2021
Output: false
Explanation: 2021 is not divisible by 100 and is also not divisible by 4 so its not a leap year
 */
public class LeapYear {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year : ");
        int year = sc.nextInt();
        if(isLeap(year))
        {
            System.out.print("Year is leap year");
        }
        else {
            System.out.print("Year is not leap year");
        }
    }
    static boolean isLeap(int N) {
        // code here
        if((N%400==0) || (N%100!=0 && N%4==0))
        {
            return true;
        }
        return false;
    }
}
