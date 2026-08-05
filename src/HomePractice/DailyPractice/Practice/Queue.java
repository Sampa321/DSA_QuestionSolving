package HomePractice.DailyPractice.Practice;

public class Queue {
     public static void main(String []args)
     {
         int []gas = {4, 5, 7, 4};
         int []cost = {6, 6, 3, 5};
         for(int i = 0; i < gas.length; i++)
         {
             int end = i;
             int curr_petrol = 0;
             while (true)
             {
                 curr_petrol += (gas[end] - cost[end]);
                 if(curr_petrol < 0) break;
                 if(i == end)
                 {
                     System.out.println(i);
                     return;
                 }
             }
         }
         System.out.println(-1);
     }
}
