package ClassPractice.ProblemSolving.Geeksforgeeks.Deque.Medium.GasStation;

import java.util.Deque;
import java.util.LinkedList;

public class GasStationBetterApproach {
    public static void main(String []args) {
        int []gas = {4, 5, 7, 4};
        int []cost = {6, 6, 3, 5};
        int i = 0;
        int curr_petrol = 0;
        int c = 0;
        Deque<Integer> dq = new LinkedList<>();
        while (i < gas.length)
        {
            dq.add(i);
            curr_petrol = curr_petrol + (gas[i] - cost[i]);
            if(curr_petrol < 0)
            {
                c++;
            }
            if(c == gas.length)
            {
                System.out.println(-1);
                return;
            }
            while (curr_petrol < 0 && !dq.isEmpty())
            {
                int j = dq.removeFirst();
                curr_petrol = curr_petrol - (gas[j] - cost[j]);
            }

            i = (i+1) % gas.length;
            if(!dq.isEmpty() && i == dq.peekFirst())
            {
                System.out.println(i);
                return;
            }
        }
    }
}
