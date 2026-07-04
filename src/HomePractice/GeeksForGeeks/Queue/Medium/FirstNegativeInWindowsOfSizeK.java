package HomePractice.GeeksForGeeks.Queue.Medium;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class FirstNegativeInWindowsOfSizeK {
    public static void main(String[] args) {
            int []arr = {12, -1, -7, 8, -15, 30, 16, 28};
            int k = 3;
           System.out.println(firstNegInt(arr, k));
    }
    public static List<Integer> firstNegInt(int arr[], int k) {
        // code here
        List<Integer> list = new ArrayList<>();
        Deque<Integer> qu = new LinkedList<>();
        for(int i = 0; i < k; i++)
        {
            if(arr[i] < 0)
            {
                qu.add(i);
            }
        }
        int result = qu.isEmpty()? 0 : arr[qu.peekFirst()];
        list.add(result);
        for(int i = k ; i < arr.length; i++)
        {
            if(!qu.isEmpty() && qu.peek() <= i-k)
            {
                qu.removeFirst();
            }
            if(arr[i] < 0)
            {
                qu.add(i);
            }
            result = qu.isEmpty()? 0 : arr[qu.peekFirst()];
            list.add(result);
        }
        return list;
    }
}
