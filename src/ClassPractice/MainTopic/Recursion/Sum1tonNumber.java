package ClassPractice.MainTopic.Recursion;
/*
Sum 1 to N number using recursion.
 */
import java.util.Scanner;
public class Sum1tonNumber {
    public static int add(int n)
    {
        if(n==0)
        {
            return 0;
        }
        return add(n-1)+n;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();
        int sum = add(n);
        System.out.print("Sum of all number is : "+sum);
    }
}
