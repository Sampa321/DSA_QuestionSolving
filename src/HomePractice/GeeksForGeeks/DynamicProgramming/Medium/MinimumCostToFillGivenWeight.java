package HomePractice.GeeksForGeeks.DynamicProgramming.Medium;

import java.util.Arrays;

/*
Given a bag of size w kg and you are provided costs of packets different weights of oranges in array cost[], find the minimum total cost to buy exactly w kg oranges

The cost of 1 kg orange is present at index 0 and in general arr[i] has cost of (i+1) kg orange.
cost[i] = -1 means that 'i+1' kg packet of orange is unavailable.
If it is not possible to buy exactly w kg oranges then return -1. It may be assumed that there is an infinite supply of all available packet types.
Examples:

Input: cost[] = [20, 10, 4, 50, 100], w = 5
Output: 14
Explanation: The minimum cost is 14 by purchasing a 2kg packet for 10 and a 3kg packet for 4.
Input: cost[] = [-1, -1, 4, 3, -1], w = 5
Output: -1
Explanation: It is not possible to buy 5 kgs.
 */
public class MinimumCostToFillGivenWeight {
    public static void main(String[] args) {
        int []cost = {20, 10, 4, 50, 100};
        int w = 5;
        System.out.println(minimumCost(cost, w));
    }
    public static int minimumCost(int[] cost, int w) {
        int INF = (int)1e9;
        int[] dp = new int[w + 1];

        Arrays.fill(dp, INF);
        dp[0] = 0;

        for (int packetWeight = 1; packetWeight <= cost.length; packetWeight++) {

            if (cost[packetWeight - 1] == -1) continue;

            for (int curWeight = packetWeight; curWeight <= w; curWeight++) {

                dp[curWeight] = Math.min(
                        dp[curWeight],
                        dp[curWeight - packetWeight] + cost[packetWeight - 1]
                );
            }
        }

        return dp[w] == INF ? -1 : dp[w];
    }
}
