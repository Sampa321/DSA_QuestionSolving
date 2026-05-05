package ClassPractice.ProblemSolving.Geeksforgeeks.Array.Medium;
/*
arr[] = [3, 34, 4, 12, 5, 2], sum = 9
o/p : [3, 4, 2], [4, 5]
 */
import java.util.ArrayList;

public class PrintSubSequenceArraySum {
    public static void main(String[] args) {
        int []arr = {3, 34,4,12,5,2};
        boolean exists = subset(arr, 0, 9,new ArrayList<>());
        if(!exists){
            System.out.println("No subset found");
        }
    }
    public static boolean subset(int []arr, int counter, int sum, ArrayList<Integer> list){
        if(sum == 0)
        {
            System.out.print(list +", ");
            return true;
        }
        if(sum < 0 || counter == arr.length) return false;
        list.add(arr[counter]);
        boolean include =  subset(arr, counter+1, sum - arr[counter],list);
        list.removeLast();
        boolean exclude =  subset(arr, counter+1, sum, list);
        return include || exclude;
    }
}
