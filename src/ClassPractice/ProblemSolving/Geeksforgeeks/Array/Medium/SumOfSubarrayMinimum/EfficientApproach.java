package ClassPractice.ProblemSolving.Geeksforgeeks.Array.Medium.SumOfSubarrayMinimum;

public class EfficientApproach {
    public static void main(String[] args) {
        int []arr = {10, 20};
        System.out.println(sumSubMins(arr));
    }
    public static int sumSubMins(int[] arr) {
        // code here
        if(arr.length == 1) return arr[0];
        int sum = 0;
        for(int i = arr.length-1; i >=0; i--)
        {
            sum += arr[i]*(arr.length-i);
        }
        return sum;
    }
}
