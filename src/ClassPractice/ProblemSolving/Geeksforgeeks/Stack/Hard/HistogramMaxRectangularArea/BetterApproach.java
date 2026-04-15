package ClassPractice.ProblemSolving.Geeksforgeeks.Stack.Hard.HistogramMaxRectangularArea;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class BetterApproach {
    public static int histogramMax(int []arr){
        ArrayList<Integer> nextSmaller = new ArrayList<>();
        ArrayList<Integer> previousSmaller = new ArrayList<>();
        Stack<Integer> st1 = new Stack<>();
        //find next smaller arrayList
        for(int i = arr.length-1; i >= 0; i--)
        {
            while (!st1.isEmpty() && arr[i] <= arr[st1.peek()]) st1.pop();
            int store = st1.isEmpty() ? arr.length : st1.peek();
            nextSmaller.add(store);
            st1.push(i);
        }
        Collections.reverse(nextSmaller);
        st1.clear();
        //find previous smaller arrayList
        for(int i = 0;i < arr.length; i++)
        {
            while (!st1.isEmpty() && arr[i] <= arr[st1.peek()]) st1.pop();
            int store = st1.isEmpty() ? -1 : st1.peek();
            previousSmaller.add(store);
            st1.push(i);
        }
        int maximum = 0;
//        int c1 = -1;
//        int c2 = -1;
//        for(int i = 0;i < arr.length; i++)
//        {
//            if(previousSmaller.get(i) == -1) {
//                c1 = i + 1;
//            }
//            else {
//                c1 = i - previousSmaller.get(i);
//            }
//            if(nextSmaller.get(i) == -1)
//            {
//                c2 = arr.length - i -1;
//            }
//            else{
//                c2 = nextSmaller.get(i) - i -1;
//            }
//
//            int currentMax = arr[i]*(c1 + c2);
//            maximum = Math.max(maximum,currentMax);
//        }

        for(int  i = 0;i < arr.length;i++)
        {
            int currentPosition = nextSmaller.get(i) - previousSmaller.get(i) -1;
            int currentArea = arr[i]*currentPosition;
            maximum = Math.max(currentArea,maximum);
        }
        return maximum;
    }
   public static void main(String[] args) {
        int []arr = {3, 5, 1, 7, 5, 9};
        System.out.println(histogramMax(arr));
    }

}
