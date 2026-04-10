package HomePractice.DailyPractice;

import java.util.HashMap;

public class FindFrequencyOfEachElement {
   public static void main(String[] args) {
       int []arr = {1,2,33,4,5,17,13,2,3,7,9,89,6,35};
       HashMap<Integer,Integer> map = new HashMap<>();
       for(int ele : arr)
       {
           map.put(ele,map.getOrDefault(ele,0)+1);
       }

       for(int key : map.keySet())
       {
           System.out.println(key + " - "+map.get(key));
       }
    }
}
