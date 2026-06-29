package ClassPractice.MainTopic.Dequeue.MaxMinSubArray;

import java.util.ArrayList;

public class NaiveApproach {
    public static void main(String []args) {
        ArrayList<Integer> maxRe = new ArrayList<>();
        ArrayList<Integer> minRe = new ArrayList<>();
        int []arr = {7,18,15,10,21,13};
        int k = 3;
        for(int i = 0; i < arr.length-k+1; i+=1)
        {
            int max = arr[i];
            int min = arr[i];
            for(int j = i+1; j < i+k && j < arr.length; j++)
            {
                if(max < arr[j])
                {
                    max = arr[j];
                }
                if(min > arr[j])
                {
                    min = arr[j];
                }
            }
            maxRe.add(max);
            minRe.add(min);
        }
        System.out.println(maxRe);
        System.out.println(minRe);
    }
}
