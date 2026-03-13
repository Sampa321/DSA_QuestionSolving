package ClassPractice.MainTopic.Recursion;
/*
Print 1 to n number using recursion.
 */
import java.util.Scanner;
public class Print1tonNumber {
    public static void f(int n)
    {
        if(n==0)
        {
            return;
        }
        f(n-1);
        System.out.print(n+" ");
    }
    static void main() {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.print("Print all number : ");
        f(n);
    }
}
