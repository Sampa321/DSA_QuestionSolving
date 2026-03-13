package HomePractice.GeeksForGeeks.Array.Easy;

import java.util.Scanner;

/*
Given an array height representing the heights of buildings. You have to count the buildings that will see the sunrise (Assume the sun rises on the side of the array starting point).
Note: The height of the building should be strictly greater than the height of the buildings left in order to see the sun.

Examples :
Input: height = [7, 4, 8, 2, 9]
Output: 3
Explanation: As 7 is the first element, it can see the sunrise. 4 can't see the sunrise as 7 is hiding it. 8 can see. 2 can't see the sunrise. 9 also can see
the sunrise.
Input: height = [2, 3, 4, 5]
Output: 4
Explanation: As 2 is the first element, it can see the sunrise.  3 can see the sunrise as 2 is not hiding it. Same for 4 and 5, they also can see the sunrise.

 */
public class FacingTheSun {
    static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size:");
        int n= sc.nextInt();
        int []arr = new int[n];
        System.out.println("Enter the array elements : ");
        for(int i=0;i<n;i++)
        {
            System.out.print("arr["+i+"]=");
            arr[i] = sc.nextInt();
        }
        System.out.println("result is : "+countBuildings(arr));
    }
    public static int countBuildings(int[] height) {
        // code here
        int max = height[0];
        int c=1;
        for(int i=1;i<height.length;i++){
            if(max<height[i]){
                max=height[i];
                c++;
            }
        }
        return c;
    }
}
