package ClassPractice.MainTopic.Queue.NumberOfDigitFound;
/*
Given a number 'n' , print first 'n' numbers(in including order) such that all the numbers have digits in the array [5,6]
Output : 5, 6, 55, 56, 65, 66,555, 556, 565, 566, 655, 656, 665, 666, 5555, 5556, 5565, 5566, 5655, 5656
 */
import java.util.HashSet;

public class NaiveApproach {
    public static void main(String []args) {
        int []arr = {5,6};
        int n = 20;
        int c = 0;
        HashSet<Integer> set = new HashSet<>();
        set.add(arr[0]);
        set.add(arr[1]);
        int number = 1;
        while (true)
        {
            int num = number;
            boolean flag = true;
            while (num != 0)
            {
                int dight = num % 10;
                if(!set.contains(dight))
                {
                    flag = false;
                    break;
                }
                else {
                    num = num /10;
                }
            }
            if(flag)
            {
                System.out.print(number+" ");
                c++;
            }
            if (c == n)
            {
                break;
            }
            number++;
        }
    }
}
