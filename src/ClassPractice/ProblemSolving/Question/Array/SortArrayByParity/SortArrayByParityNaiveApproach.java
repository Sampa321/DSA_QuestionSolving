package ClassPractice.ProblemSolving.Question.Array.SortArrayByParity;

import ClassPractice.MainTopic.Inheritance.MultilevelInheritance.Example1.A;

import java.util.Arrays;

public class SortArrayByParityNaiveApproach {
    public static void main(String[] args) {
        int []arr = {1,2,3,5,89,86,7,8,82};
        int []result = new int[arr.length];
        int k = 0;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] % 2 == 0) result[k++] = arr[i];
        }
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] % 2 != 0) result[k++] = arr[i];
        }

        System.out.println(Arrays.toString(result));
    }
}
