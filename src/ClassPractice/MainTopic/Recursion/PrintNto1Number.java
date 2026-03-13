package ClassPractice.MainTopic.Recursion;

/*
Print n to 1 number using recursion.
 */
import java.util.Scanner;
public class PrintNto1Number {
    public static void fun(int n)
    {
        if(n==0)
        {
            return;
        }
        System.out.print(n+" ");
        fun(n-1);
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();
        System.out.print("All number is : ");
        fun(n);
    }

}
