package HomePractice.DailyPractice.Practice;

import java.util.Scanner;
import java.util.Arrays;
public class Revision{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size :");
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i = 0; i < n ; i++)
        {
            System.out.print("arr["+i+"] : ");
            arr[i] = sc.nextInt();
        }
        int []re = new int[n];
        for(int i = 0; i < n; i++)
        {
            int minimum = i;
            for(int j = 0; j < n ; j++)
            {
                if(arr[j] < arr[minimum])
                {
                    minimum = j;
                }
            }
            re[i] = arr[minimum];
            arr[minimum] = Integer.MAX_VALUE;
        }
        System.out.println(Arrays.toString(re));
    }
}