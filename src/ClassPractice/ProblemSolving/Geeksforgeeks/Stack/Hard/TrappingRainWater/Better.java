package ClassPractice.ProblemSolving.Geeksforgeeks.Stack.Hard.TrappingRainWater;

public class Better {
   public static void main(String[] args) {
        int ml = 0;
        int totalWater = 0;
        int []arr = {0,1,0,2,1,0,1,3,2,1,2,1};
        int []lMax = new int[arr.length];
        int []rMax = new int[arr.length];
        for(int i = 0; i < arr.length; i++)
        {
            ml = Math.max(arr[i],ml);
            lMax[i] = ml;
        }
        int mr = 0;
        for(int i = arr.length-1; i >=0; i--)
        {
            mr = Math.max(arr[i],mr);
            rMax[i] = mr;
        }
        for(int i = 0;i < arr.length; i++)
        {
            int water = Math.min(lMax[i],rMax[i])-arr[i];
            totalWater += Math.max(water,0);
        }
        System.out.println(totalWater);
    }
}
