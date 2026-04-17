package ClassPractice.ProblemSolving.Geeksforgeeks.Stack.Hard.TrappingRainWater;
// 42.
public class NaiveApproach {
    public static void main(String[] args) {
        int total_water = 0;
        int []arr = {0,1,0,2,1,0,1,3,2,1,2,1};
        for(int i = 0; i < arr.length; i++)
        {
            int l_max = 0;
            for(int j = i-1; j >= 0 ; j--)
            {
                if(arr[j] > l_max)
                {
                    l_max = arr[j];
                }
            }
            int r_max = 0;
            for(int k = i+1; k < arr.length; k++)
            {
                if(arr[k] > r_max)
                {
                    r_max = arr[k];
                }
            }
            int result = Math.min(l_max,r_max) - arr[i];
            total_water += Math.max(result,0);
        }
        System.out.println(total_water);
    }
}
