package ClassPractice.ProblemSolving.LeetCode.Array.Medium;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int []arr = {7, 1, 5, 3, 6, 4};

        //Naive approach
//        int maxProfit = 0;
//        for(int i = 0; i < arr.length; i++)
//        {
//            for(int j = i+1; j < arr.length; j++)
//            {
//                int currProfit = arr[j] - arr[i];
//                maxProfit = Math.max(maxProfit, currProfit);
//            }
//        }
//        System.out.println(maxProfit);


        //Efficient approach
        int maxProfit = 0;
        int minimum = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++)
        {
            minimum = Math.min(minimum, arr[i]);
            maxProfit = Math.max(maxProfit, arr[i] - minimum);
        }
        System.out.println(maxProfit);
    }
}
