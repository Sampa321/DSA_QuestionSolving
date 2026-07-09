package ClassPractice.MainTopic.Sorting.BubbleSort;

// T.C = O(n^2), S.C. = O(1)

import java.util.Arrays;
import java.util.Scanner;

public class BasicApproach {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the array size :");
       int n = sc.nextInt();
       int []arr = new int[n];
       for(int i = 0; i < n ; i++)
       {
           System.out.print("arr["+i+"] : ");
           arr[i] = sc.nextInt();
       }
       for(int i = 1; i < n; i++)
       {
           for(int j = 1; j < n ;j++)
           {
               if(arr[j] < arr[j-1])
               {
                   int temp = arr[j];
                   arr[j] = arr[j-1];
                   arr[j-1] = temp;
               }
           }
       }
       System.out.println(Arrays.toString(arr));
   }
}
