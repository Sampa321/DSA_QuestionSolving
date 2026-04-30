package HomePractice.InterviewPreparation;

import java.util.Arrays;

public class MergeTwoSortedArray {
    public static void main(String []args) {
        int []arr1 = {1,3,5};
        int []arr2 = {2,4,6};
        int i = 0;
        int j = 0;
        int []re = new int[arr1.length+arr2.length];
        int k = 0;
        while(i < arr1.length && j < arr2.length)
        {
            if(arr1[i] <= arr2[j])
            {
                re[k++] = arr1[i++];
            }
            else{
                re[k++] = arr2[j++];
            }
        }
        while (i < arr1.length )
        {
            re[k++] = arr1[i++];
        }
        while (j < arr2.length)
        {
            re[k++] = arr2[j++];
        }
        System.out.println(Arrays.toString(re));
    }
}
