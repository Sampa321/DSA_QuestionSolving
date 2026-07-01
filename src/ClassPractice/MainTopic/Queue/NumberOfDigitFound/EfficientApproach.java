package ClassPractice.MainTopic.Queue.NumberOfDigitFound;
/*
Given a number 'n' , print first 'n' numbers(in including order) such that all the numbers have digits in the array [5,6]
 */

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

    //Efficient approach
//        if(n == 1)
//        {
//            System.out.print(arr[0] + " ");
//            return;
//        }
//        if(n == 2)
//        {
//            System.out.print(arr[0] + " ");
//            System.out.print(arr[1]+ " ");
//            return;
//        }
//        System.out.print(arr[0] + " ");
//        System.out.print(arr[1]+ " ");
//        int first = arr[0];
//        int second = arr[1];
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(first);
//        list.add(second);
//        int index = 0;
//        while(true)
//        {
//            int temp1 = list.get(index) * 10 + arr[0];
//            System.out.print(temp1 + " ");
//            list.add(temp1);
//            if(list.size() == n) break;
//            temp1 = list.get(index) * 10 + arr[1];
//            System.out.print(temp1 + " ");
//            list.add(temp1);
//            if(list.size() == n) break;
//            index++;
//        }
}
