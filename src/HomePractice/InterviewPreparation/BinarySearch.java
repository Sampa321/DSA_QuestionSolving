package HomePractice.InterviewPreparation;

public class BinarySearch {
   public static void main(String[] args) {
        int []arr = {1,2,3,4,5};
        int target = 4;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == target)
            {
                System.out.println("index = "+i);
                return;
            }
        }
       System.out.println("index = "+-1);
   }
}


