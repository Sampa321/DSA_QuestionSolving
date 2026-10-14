package HomePractice.DailyPractice.Stack;

public class TrappingRainWater {
   public static void main(String[] args) {
       int []arr = {4, 2, 0, 3, 2, 5};
       int []rmax = new int[arr.length];
       int []lmax = new int[arr.length];
       int total = 0;

       // Naive Approach
//       for(int i = 0; i < arr.length; i++)
//       {
//           int rm = 0;
//           for(int j = i+1; j < arr.length; j++)
//           {
//               if (arr[j] > arr[i])
//               {
//                   rm = Math.max(rm, arr[j]);
//               }
//           }
//           rmax[i] = rm;
//
//           int lm = 0;
//           for(int j = i-1; j >= 0; j--)
//           {
//               if (arr[j] > arr[i])
//               {
//                   lm = Math.max(lm, arr[j]);
//               }
//           }
//           lmax[i] = lm;
//       }
//
//       for(int i = 0; i < arr.length; i++)
//       {
//           int value = Math.min(rmax[i], lmax[i]) - arr[i];
//           total += Math.max(value, 0);
//       }
//       System.out.println(total);




       // Efficient Approach
       int lm = 0;
       for(int i = 0; i < arr.length; i++)
       {
           lm = Math.max(lm, arr[i]);
           lmax[i] = lm;
       }

       int rm = 0;
       for(int i = arr.length-1; i >= 0; i--)
       {
           rm = Math.max(rm, arr[i]);
           rmax[i] = rm;
       }

       for(int i = 0; i < arr.length; i++)
       {
           int minValue = Math.min(lmax[i], rmax[i]) - arr[i];
           total += Math.max(minValue, 0);
       }
       System.out.println(total);
    }
}












