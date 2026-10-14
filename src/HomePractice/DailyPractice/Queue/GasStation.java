package HomePractice.DailyPractice.Queue;

import ClassPractice.ProblemSolving.Geeksforgeeks.Stack.Medium.TwoStackInOneArray.EfficientApproach;

import java.util.Deque;
import java.util.LinkedList;

public class GasStation {
    public static void naive(int []gas, int []cost){
        for(int start = 0;start < gas.length; start++)
        {
            int end = start;
            int curr_petrol = 0;
            while (true)
            {
                curr_petrol += (gas[end] - cost[end]);
                if (curr_petrol < 0) break;
                end = (end+1) % gas.length;
                if (start == end){
                    System.out.println(start);
                    return;
                }
            }
        }
    }


    public static int Better(int []gas, int []cost){
        Deque<Integer> dq = new LinkedList<>();
        int i = 0;
        int curr_petrol = 0;
        int c = 0;
        while (i < gas.length)
        {
            dq.addLast(i);
            curr_petrol += (gas[i] - cost[i]);
            if(curr_petrol < 0) c++;
            if (c == gas.length) return -1;
            while (curr_petrol < 0 && !dq.isEmpty())
            {
                int j = dq.removeFirst();
                curr_petrol -= (gas[j]-cost[j]);
            }
            i = (i+1) % gas.length;
            while (!dq.isEmpty() && i == dq.peekFirst())
            {
                return i;
            }
        }
        return -1;
    }


    public static int efficientApproach(int []gas, int []cost)
    {
        int curr_petrol = 0;
        int start = 0;
        int prev_petrol = 0;
        for(int i = 0;i < gas.length; i++)
        {
            curr_petrol += (gas[i]-cost[i]);
            if(curr_petrol < 0)
            {
                start = i+1;
                prev_petrol += curr_petrol;
                curr_petrol = 0;
            }
        }
        if (curr_petrol + prev_petrol >= 0) return start;
        else return -1;
    }




   public static void main(String[] args) {
        int []gas = {4,8,7,4};
        int []cost = {6,5,3,5};
       // naive(gas, cost);

       //System.out.println(Better(gas, cost));
       System.out.println(efficientApproach(gas, cost));
    }
}
