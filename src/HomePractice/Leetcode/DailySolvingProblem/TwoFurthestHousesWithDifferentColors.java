package HomePractice.Leetcode.DailySolvingProblem;

import java.util.Scanner;

//2078
public class TwoFurthestHousesWithDifferentColors {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array : ");
        int n = sc.nextInt();
        int []arr = new int[n];
        System.out.println("Enter the value of an array : ");
        for(int i = 0; i < n; i++)
        {
            System.out.print("arr["+i+"] = ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Max distance is : "+maxDistance(arr));
    }
    public static int maxDistance(int[] colors) {
        int n = colors.length;
        int left = 0;
        int right = 0;
        for(int i = 0; i < n ;i++)
        {
            if(colors[i] != colors[n-1])
            {
                left = i;
                break;
            }
        }
        for(int i = n - 1; i >= 0; i--)
        {
            if(colors[i] != colors[0])
            {
                right = i;
                break;
            }
        }
        return Math.max(n-1-left, right);
    }
}
