package ClassPractice.MainTopic.Queue.NumberOfDigitFound;

import java.util.LinkedList;
import java.util.Queue;

public class EfficientApproach {
    public static void main(String[] args) {
        int []arr = {5,6};
        int n = 19;
        Queue<String> nq = new LinkedList<>();
        nq.add(Integer.toString(arr[0]));
        nq.add(Integer.toString(arr[1]));
        for(int i = 0; i < n; i++)
        {
            String firstValue = nq.remove();
            System.out.print(firstValue+" ");
            nq.add(firstValue + Integer.toString(arr[0]));
            nq.add(firstValue + Integer.toString(arr[1]));
        }
    }
}
