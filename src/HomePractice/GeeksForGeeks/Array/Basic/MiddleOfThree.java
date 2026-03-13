package HomePractice.GeeksForGeeks.Array.Basic;

import java.util.Scanner;

/*
Given three distinct numbers a, b and c. Find the number with a value in the middle (Try to do it with minimum comparisons).
Examples :
Input: a = 978, b = 518, c = 300
Output: 518
Explanation: Since 518>300 and 518<978, so 518 is the middle element.
Input: a = 162, b = 934, c = 200
Output: 200
Exaplanation: Since 200>162 && 200<934, So, 200 is the middle element.
Input: a = 246, b = 214, c = 450
Output: 246

 */
public class MiddleOfThree {
    static void main() {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter the value of a : ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b : ");
        int b = sc.nextInt();
        System.out.print("Enter the value of c : ");
        int c = sc.nextInt();
        System.out.print("Middle element is : "+middle(a,b,c));
    }
    static int middle(int a, int b, int c) {
        // code here
        if ((a > b && a < c) || (a > c && a < b)) {
            return a;
        } else if ((b > a && b < c) || (b > c && b < a)) {
            return b;
        }
        return c;
    }
}
