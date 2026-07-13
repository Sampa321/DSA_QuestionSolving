package HomePractice.GeeksForGeeks.Array.Medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/*
Given a non-empty integer array arr[]. Your task is to find and return the top k elements which have the highest frequency in the array.

Note: If two numbers have the same frequency, the larger number should be given the higher priority.

Examples:

Input: arr[] = [3, 1, 4, 4, 5, 2, 6, 1], k = 2
Output: [4, 1]
Explanation: Frequency of 4 is 2 and frequency of 1 is 2, these two have the maximum frequency and 4 is larger than 1.
Input: arr[] = [7, 10, 11, 5, 2, 5, 5, 7, 11, 8, 9], k = 4
Output: [5, 11, 7, 10]
Explanation: Frequency of 5 is 3, frequency of 11 is 2, frequency of 7 is 2, frequency of 10 is 1.
 */
public class TopKFrequentInArray {
   public static void main(String[] args) {
        int []arr = {3, 1, 4, 4, 5, 2, 6, 1};
        int k = 2;
       System.out.println(topKFreq(arr, k));
    }
    public static ArrayList<Integer> topKFreq(int[] arr, int k) {
        // Code here
        ArrayList<Integer> result = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++)
        {
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }

        PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>((a, b) ->
        { if(!a.getValue().equals(b.getValue()))
        {
            return b.getValue() - a.getValue();
        }
            return b.getKey() - a.getKey();
        });
        for(Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            pq.offer(entry);
        }

        while(k-- > 0 && !pq.isEmpty())
        {
            result.add(pq.poll().getKey());
        }
        return result;
    }
}
