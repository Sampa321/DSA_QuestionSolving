package ClassPractice.ProblemSolving.Question.Array.SortArrayByParityII;

import java.util.Arrays;

public class SortArrayByParityII_EfficientApproach {
    public static void main(String[] args) {
        int []arr = {1,4,2,5,7,8,9,6};
        int e = 0;
        int o = 1;
        while (e < arr.length && o < arr.length)
        {
            while (e < arr.length && arr[e] % 2 == 0) e += 2;
            while (o < arr.length && arr[o] % 2 != 0) o += 2;
            if(e < arr.length && o < arr.length)
            {
                int temp = arr[e];
                arr[e] = arr[o];
                arr[o] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
