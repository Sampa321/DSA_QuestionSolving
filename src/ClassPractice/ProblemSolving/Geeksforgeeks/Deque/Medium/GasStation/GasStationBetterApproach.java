package ClassPractice.ProblemSolving.Geeksforgeeks.Deque.Medium.GasStation;

import java.util.Deque;
import java.util.LinkedList;

public class GasStationBetterApproach {
    public static void main(String []args) {
        int []gas = {3, 9};
        int []cost = {7, 6};
        int i = 0;
        int curr_petrol = 0;
        int start = 0;
        Deque<Integer> dq = new LinkedList<>();
        while (dq.isEmpty() || start != i)
        {
            dq.add(i);
            curr_petrol = curr_petrol + (gas[i] - cost[i]);
            if (curr_petrol < 0)
            {
                dq.removeFirst();
                curr_petrol = curr_petrol - (gas[i] - cost[i]);
                start = i+1;
            }
            i = (i+1) % gas.length;
        }
        int result = (start != dq.peekFirst()) ? -1 : dq.peekFirst();
        System.out.println(result);
    }
}
