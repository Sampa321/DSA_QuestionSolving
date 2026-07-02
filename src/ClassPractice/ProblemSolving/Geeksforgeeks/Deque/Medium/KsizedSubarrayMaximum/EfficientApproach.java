package ClassPractice.ProblemSolving.Geeksforgeeks.Deque.Medium.KsizedSubarrayMaximum;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class EfficientApproach {
    public static void main(String[] args) {
        int []arr = {1, 2, 3, 1, 4, 5, 2, 3, 6};
        int k = 3;
        ArrayList<Integer> result = new ArrayList<>();
        Deque<Integer> dq = new LinkedList<>();


        //Traverse the first k element of the array
        //Check the last element of deque, if it is smaller than a[i], remove it.
        //if it is greater than a[i], just add 'i' to the dq;
        for(int i = 0; i < k; i++)  //O(k)
        {
            while (!dq.isEmpty() && arr[dq.peekLast()] <= arr[i])
            {
                dq.removeLast(); //O(1)
            }
            dq.addLast(i);
        }
        result.add(arr[dq.peek()]);

        for(int i = k ; i < arr.length; i++)  //O(n-k)
        {
            // removal logic - checking if the first element of the dq is still part of the subarray or not.
            if(dq.peekFirst() <= (i-k))
            {
                dq.removeFirst();
            }
            //insertion process -- same as above
            while (!dq.isEmpty() && arr[dq.peekLast()] < arr[i])
            {
                dq.removeLast();
            }
            dq.addLast(i);
            //storing the max value of the subarray into the result.
            result.add(arr[dq.peek()]);
        }
        System.out.println(result);
    }
}
