package ClassPractice.ProblemSolving.Geeksforgeeks.Stack.Hard.HistogramMaxRectangularArea;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class BetterApproach {
    public static int histogramMax(int []arr){
        ArrayList<Integer> nextSmaller = new ArrayList<>();
        ArrayList<Integer> previousSmaller = new ArrayList<>();
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        //find next smaller arrayList
        for(int i = arr.length-1; i >= 0; i--)
        {
            while (!st1.isEmpty() && arr[i] <= arr[st1.peek()]) st1.pop();
            int store = st1.isEmpty() ? -1 : st1.peek();
            nextSmaller.add(store);
            st1.push(i);
        }
        Collections.reverse(nextSmaller);

        //find previous smaller arrayList
        for(int i = 0;i < arr.length; i++)
        {
            while (!st2.isEmpty() && arr[i] <= arr[st2.peek()]) st2.pop();
            int store = st2.isEmpty() ? -1 : st2.peek();
            previousSmaller.add(store);
            st2.push(i);
        }
        int maximum = Integer.MIN_VALUE;
        int c1 = -1;
        int c2 = -1;
        for(int i = 0;i < arr.length; i++)
        {
            if(previousSmaller.get(i) == -1) {
                c1 = i + 1;
            }
            else {
                c1 = i - previousSmaller.get(i);
            }
            if(nextSmaller.get(i) == -1)
            {
                c2 = arr.length - i -1;
            }
            else{
                c2 = nextSmaller.get(i) - i -1;
            }

            int currentMax = arr[i]*(c1 + c2);
            maximum = Math.max(maximum,currentMax);
        }
        return maximum;
    }
    static void main(String[] args) {
        int []arr = {60,20,50,40,10,50,60};
        System.out.println(histogramMax(arr));
    }

}
