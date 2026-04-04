package ClassPractice.ProblemSolving.Geeksforgeeks.Stack.Hard.HistogramMaxRectangularArea;

public class NaiveApproach {
    public static int maxHistogram(int []arr){
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length; i++)
        {
            int c = 1;
            for(int j = i-1;j>=0;j--)
            {
                if(arr[i] <= arr[j])
                {
                    c++;
                }
                else {
                    break;
                }
            }
            for(int j = i+1; j < arr.length;j++)
            {
                if(arr[i] <= arr[j])
                {
                    c++;
                }
                else {
                    break;
                }
            }
            int currentMax = arr[i]*c;
            if(max < currentMax)
            {
                max = currentMax;
            }
        }
        return max;
    }
    static void main(String[] args) {
        int []arr = {3, 5, 1, 7, 5, 9};
        System.out.println("Histogram Max Rectangular Area : "+maxHistogram(arr));
    }
}
