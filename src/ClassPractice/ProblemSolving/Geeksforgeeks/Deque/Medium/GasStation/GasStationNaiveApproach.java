package ClassPractice.ProblemSolving.Geeksforgeeks.Deque.Medium.GasStation;

public class GasStationNaiveApproach {
     public static void main(String []args) {
        int []gas = {4, 5, 7, 4};
        int []cost = {6, 5, 3, 5};
        for(int start = 0; start < gas.length; start++)
        {
             int end = start;
             int curr_petrol = 0;
             while(true)
             {
                 curr_petrol += (gas[end]-cost[end]);
                 if(curr_petrol < 0)
                 {
                     break;
                 }
                 end = (end + 1) % gas.length;
                 if(start == end)
                 {
                     System.out.println(start);
                     return;
                 }
             }
        }
        System.out.println(-1);
    }
}
