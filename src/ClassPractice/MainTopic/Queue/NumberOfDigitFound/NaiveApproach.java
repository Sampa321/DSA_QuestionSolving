package ClassPractice.MainTopic.Queue.NumberOfDigitFound;

import java.util.ArrayList;

public class NaiveApproach {
    public static void main(String []args) {
        int []arr = {5,6};
        int n = 20;
        if(n == 1)
        {
            System.out.print(arr[0] + " ");
            return;
        }
        if(n == 2)
        {
            System.out.print(arr[0] + " ");
            System.out.print(arr[1]+ " ");
            return;
        }
        System.out.print(arr[0] + " ");
        System.out.print(arr[1]+ " ");
        int first = arr[0];
        int second = arr[1];
        ArrayList<Integer> list = new ArrayList<>();
        list.add(first);
        list.add(second);
        int index = 0;
        while(true)
        {
            int temp1 = list.get(index) * 10 + arr[0];
            System.out.print(temp1 + " ");
            list.add(temp1);
            if(list.size() == n) break;
            temp1 = list.get(index) * 10 + arr[1];
            System.out.print(temp1 + " ");
            list.add(temp1);
            if(list.size() == n) break;
            index++;
        }
    }
}
