package ClassPractice.ProblemSolving.LeetCode.Array.Easy;

import java.util.HashMap;

public class SingleNumber {
   public static void main(String []args) {
        int []arr = {2,3,5,6,7,5,6,4,7,3,2};

        //Naive approach
//        for(int  i = 0; i < arr.length; i++)
//        {
//            int c = 1;
//            for(int j = 0; j < arr.length; j++)
//            {
//                if(i != j && arr[i] == arr[j])
//                {
//                    c++;
//                }
//            }
//            if(c == 1)
//            {
//                System.out.println(arr[i]);
//                break;
//            }
//        }



       // Efficient Approach
//       HashMap<Integer, Integer> map = new HashMap<>();
//       for(int ele : arr)
//       {
//           map.put(ele, map.getOrDefault(ele, 0)+1);
//       }
//       for(int ele : arr)
//       {
//           if(map.get(ele) == 1)
//           {
//               System.out.println(ele);
//               break;
//           }
//       }



       //Efficient Approach
       int r = 0;
       for(int ele : arr)
       {
           r ^= ele;
       }
       System.out.println(r);
    }
}
